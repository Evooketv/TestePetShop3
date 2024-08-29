import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    private Estatisticas dados;

    public EscritaArquivo(Estatisticas dados) {
        this.dados = dados;

    }

    public void escrita(String path) {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path))) {
            buffWrite.append("Quantidade de clientes: " + dados.totalClientes() +
                    "\n");
            buffWrite.append("Quantidade de vendedores: " + dados.quantiVendedores() +
                    "\n");
            buffWrite.append("Quantidade de serviços: " + dados.quantiServicos() +
                    "\n");
            buffWrite.append("O animal mais pesado: " + dados.animalPesado() +
                    "\n");
            buffWrite.append("O serviço mais lucrativo: " + dados.servicoLucrativo() +
                    "\n");
            buffWrite.append("O melhor vendedor: " + dados.melhorVendedor() +
                    "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
