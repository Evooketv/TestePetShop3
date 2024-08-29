import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionario {

    private String nomeFuncionario;
    private long cpfFuncioario;
    private double salarioFuncionario;
    private List<CadastroServico> vendas = new ArrayList<>();


    public CadastroFuncionario(String nomeFuncionario, long cpfFuncioario, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncioario = cpfFuncioario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public long getCpfFuncioario() {
        return cpfFuncioario;
    }

    public void setCpfFuncioario(long cpfFuncioario) {
        this.cpfFuncioario = cpfFuncioario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public List<CadastroServico> getVendas() {
        return vendas;
    }

    public void setVendas(List<CadastroServico> vendas) {
        this.vendas = vendas;
    }

    public double totalVendas() {
        double totalVendas = 0;
        for (int i = 0; i < vendas.size(); i++) {
            CadastroServico venda = vendas.get(i);
            totalVendas = venda.total() + totalVendas();

        }
        return totalVendas;

    }

}
