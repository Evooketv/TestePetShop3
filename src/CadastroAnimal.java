public class CadastroAnimal {

    private String tipoAnimal;
    private double pesoAnimal;
    private String nomeAnimal;
    private String nomeDono;

    public CadastroAnimal(String tipoAnimal, double pesoAnimal, String nomeAnimal, String nomeDono) {
        this.tipoAnimal = tipoAnimal;
        this.pesoAnimal = pesoAnimal;
        this.nomeAnimal = nomeAnimal;
        this.nomeDono = nomeDono;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
}
