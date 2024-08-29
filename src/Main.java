public class Main {
    public static void main(String[] args) {

        LeituraArquivo leitura = new LeituraArquivo();
        leitura.lerArquivo("/home/marcelo/Desktop/Pasta Teste PetShop/DadosIn.dat");

        Estatisticas estatistcas = new Estatisticas(leitura.getCadastroAni(),leitura.getCadastroFunc(),leitura.getCadastroServ());

        EscritaArquivo escritaArquivo = new EscritaArquivo(estatistcas);

        escritaArquivo.escrita("/home/marcelo/Desktop/Pasta Teste PetShop/DadosOut.dat");

    }
}
