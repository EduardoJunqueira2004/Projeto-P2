import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File extends Device {

    public void writeDevicesToFile(ArrayList<Computer> devices) {
        String nomeArquivo = "devices.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Computer device : devices) {
                writer.write(device.toString());
                writer.newLine();
            }

            System.out.println(nomeArquivo + " criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
