import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {
    private List<CadastroAnimal> cadastroAni;
    private List<CadastroFuncionario> cadastroFunc;
    private List<CadastroServico> cadastroServ;
    private List<CadastroServico> vendas;

    public LeituraArquivo() {
        this.cadastroAni = new ArrayList<>();
        this.cadastroFunc = new ArrayList<>();
        this.cadastroServ = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public List<CadastroAnimal> getCadastroAni() {
        return cadastroAni;
    }

    public List<CadastroFuncionario> getCadastroFunc() {
        return cadastroFunc;
    }

    public List<CadastroServico> getCadastroServ() {
        return cadastroServ;
    }

    public void lerArquivo(String nomeArquivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(",");
                if (colunas[0].equals("001")) {
                    String tipoAnimal = colunas[1];
                    double pesoAnimal = Double.parseDouble(colunas[2]);
                    String nomeAnimal = colunas[3];
                    String nomeDono = colunas[4];

                    CadastroAnimal animal = new CadastroAnimal(tipoAnimal, pesoAnimal, nomeAnimal, nomeDono);
                    cadastroAni.add(animal);


                }
                if (colunas[0].equals("002")) {
                    String nomeFuncionario = colunas[1];
                    long cpfFuncionario = Long.parseLong(colunas[2]);
                    double salarioFuncionario = Double.parseDouble(colunas[3]);

                    CadastroFuncionario funcionario = new CadastroFuncionario(nomeFuncionario, cpfFuncionario, salarioFuncionario);
                    cadastroFunc.add(funcionario);

                }
                if (colunas[0].equals("003")) {
                    int idServico = Integer.parseInt(colunas[1]);
                    String[] colunas2 = colunas[2].substring(1, colunas[2].length() - 1).split(";");
                    String nomeFuncionario = colunas[3];
                    List<Servicos> servicos = new ArrayList<>();

                    CadastroFuncionario funcionario = null;
                    for (int i = 0; i < cadastroFunc.size(); i++) {
                        CadastroFuncionario fucionarioAtual = cadastroFunc.get(i);
                        if (fucionarioAtual.getNomeFuncionario().equals(nomeFuncionario)) {
                            funcionario = fucionarioAtual;
                        }
                    }

                    for (int i = 0; i < colunas2.length; i++) {
                        String[] colunas3 = colunas2[i].split("-");
                        int idAnimal = Integer.parseInt(colunas3[0]);
                        double duracaoServico = Double.parseDouble(colunas3[1]);
                        double precoServico = Double.parseDouble(colunas3[2]);
                        Servicos servico = new Servicos(idAnimal, duracaoServico, precoServico);
                        servicos.add(servico);

                    }

                    CadastroServico venda = new CadastroServico(idServico, servicos, nomeFuncionario);

                    venda.setFuncionario(funcionario);
                    funcionario.getVendas().add(venda);

                    vendas.add(venda);

                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
