public class Servicos {

    private int idAnimal;
    private double duracaoServico;
    private double precoServico;


    public Servicos(int idAnimal, double duracaoServico, double precoServico) {
        this.idAnimal = idAnimal;
        this.duracaoServico = duracaoServico;
        this.precoServico = precoServico;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public double getDuracaoServico() {
        return duracaoServico;
    }

    public void setDuracaoServico(double duracaoServico) {
        this.duracaoServico = duracaoServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public double subtotal() {
        return duracaoServico / precoServico;
    }

}
