import java.util.List;

public class Estatisticas {

    private List<CadastroAnimal> cadastroAni;
    private List<CadastroFuncionario> cadastroFunc;
    private List<CadastroServico> cadastroServ;


    public Estatisticas(List<CadastroAnimal> cadastroAni, List<CadastroFuncionario> cadastroFunc, List<CadastroServico> cadastroServ) {
        this.cadastroAni = cadastroAni;
        this.cadastroFunc = cadastroFunc;
        this.cadastroServ = cadastroServ;
    }

    public List<CadastroAnimal> getCadastroAni() {
        return cadastroAni;
    }

    public void setCadastroAni(List<CadastroAnimal> cadastroAni) {
        this.cadastroAni = cadastroAni;
    }

    public List<CadastroFuncionario> getCadastroFunc() {
        return cadastroFunc;
    }

    public void setCadastroFunc(List<CadastroFuncionario> cadastroFunc) {
        this.cadastroFunc = cadastroFunc;
    }

    public List<CadastroServico> getCadastroServ() {
        return cadastroServ;
    }

    public void setCadastroServ(List<CadastroServico> cadastroServ) {
        this.cadastroServ = cadastroServ;
    }

    public int totalClientes() {
        return cadastroAni.size();
    }

    public int quantiVendedores() {
        return cadastroFunc.size();
    }

    public int quantiServicos() {
        return cadastroServ.size();
    }

    public int animalPesado() {
        CadastroAnimal animalMaisPesado = cadastroAni.get(0);
        for (int i = 1; i < cadastroAni.size(); i++) {
            CadastroAnimal pesadoAtual = cadastroAni.get(i);
            if (pesadoAtual.getPesoAnimal() > animalMaisPesado.getPesoAnimal()) {
                animalMaisPesado = pesadoAtual;
            }
        }
        return (int) animalMaisPesado.getPesoAnimal();

    }

    public int servicoLucrativo() {
        CadastroServico servicoMaisLucrativo = cadastroServ.get(0);
        for (int i = 1; i < cadastroServ.size(); i++) {
            CadastroServico lucrativoAtual = cadastroServ.get(i);
            if (lucrativoAtual.total() > servicoMaisLucrativo.total()) {
                servicoMaisLucrativo = lucrativoAtual;
            }
        }
        return servicoMaisLucrativo.getIdServico();

    }

    public CadastroFuncionario melhorVendedor() {
        CadastroFuncionario melhorVendedor = cadastroFunc.get(0);
        for (int i = 1; i < cadastroFunc.size(); i++) {
            CadastroFuncionario vendedorAtual = cadastroFunc.get(i);
            if (vendedorAtual.totalVendas() > melhorVendedor.totalVendas()) {
                melhorVendedor = vendedorAtual;
            }
        }
        return melhorVendedor;
    }

}
