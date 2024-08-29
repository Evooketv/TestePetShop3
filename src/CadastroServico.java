import java.util.List;

public class CadastroServico {

    private int idServico;
    private List<Servicos> servicos;
    private String nomeFuncionario;
    private CadastroFuncionario funcionario;

    public CadastroServico(int idServico, List<Servicos> servicos, String nomeFuncionario) {
        this.idServico = idServico;
        this.servicos = servicos;
        this.nomeFuncionario = nomeFuncionario;
    }

    public CadastroFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(CadastroFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double total() {
        double total = 0;
        for (int i = 0; i < servicos.size(); i++) {
            Servicos servicos1 = servicos.get(i);
            total = servicos1.subtotal() + total;

        }
        return total;

    }
}
