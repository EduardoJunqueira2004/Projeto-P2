import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//Processa em cada switch e em cada Router para cada PC
public class Main {

    public static void main(String[] args)  throws Exception{
        ArrayList<Device> dispositivos = new ArrayList<>();
        

        Scanner input = new Scanner(System.in);

         do{
            imprimirMenu();
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    addComputer(dispositivos, input);
                    break;
                case 2:
                    addRouter(dispositivos, input);
                    break;
                case 3:
                    addSwitch(dispositivos, input);
                    break;   
                case 4:
                   simulatePacketTransfer(dispositivos, input);
                    break;    
                case 5:
                    listDevices(dispositivos);
                    break;
                case 6:
                    listDevicesTxt(dispositivos);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
            } while (true);

    }

    private static void imprimirMenu() {
        //Cor azul ciano
        System.out.println("\033[1;36m");
    

        
        // MenuInicial Centro de Mecânica Rápida
         System.out.println("\n\t╔══════════════════════════════════════════════════════════════════════════════════════════════════╗");
         System.out.println("\n\t║==============================Menu de Gerenciamento de Dispositivos===============================║");
         System.out.println("\n\t║══════════════════════════════════════════════════════════════════════════════════════════════════╢");
         System.out.println("\n\t║                                                                                                  ║");
         System.out.println("\n\t║                        1 - Adicionar Computador                                                  ║");
         System.out.println("\n\t║                        2 - Adicionar Router                                                      ║");
         System.out.println("\n\t║                        3 - Adicionar Switch                                                      ║");
         System.out.println("\n\t║                        4 - Simulação Rede                                                        ║");
         System.out.println("\n\t║                        5 - Listar Dispositivos na rede                                           ║");
         System.out.println("\n\t║                        6 - Listar Dispositivos Ficheiro Txt                                      ║");                                        
         System.out.println("\n\t║                        7 - Sair                                                                  ║");
         System.out.println("\n\t║                                                                                                  ║");
         System.out.println("\n\t╚══════════════════════════════════════════════════════════════════════════════════════════════════╝");
         System.out.println("\033[0m"); // volta a cor padrão do terminal
        System.out.print("\nEscolha uma opção: ");
        }
        

//Para o computador
private static void addComputer(ArrayList<Device> devices, Scanner input)
{
    //Cor azul ciano
        System.out.println("\033[1;36m");
    System.out.println("Digite o ID do computador: ");
    String id = input.next();
    System.out.println("\nDigite o nome do computador: ");
    String name = input.next();
    System.out.println("\nDigite o IP do computador: ");
    String ip = input.next();
    System.out.println("\nDigite o MAC do computador: ");
    String mac = input.next();
    System.out.println("\nDigite o gateway do computador: ");
    String gateway = input.next();
    System.out.println("\nDigite o netmask do computador: ");
    String netmask = input.next();
    System.out.println("\nDigite o DNS do computador: ");
    String dns = input.next();
    Device dispositivo = new Computer(id, name, ip, mac, gateway, netmask, dns);
    devices.add(dispositivo);
    System.out.println("\033[0m"); // volta a cor padrão do terminal

}

//Para o router
private static void addRouter(ArrayList<Device> devices, Scanner input) {
   //Cor azul ciano
        System.out.println("\033[1;36m");

    System.out.println("Digite o ID do roteador: ");
    String id = input.next();
    System.out.println("\033[0mDigite o nome do roteador: "); // Reseta a cor
    String name = input.next();
    System.out.println("Digite o IP do roteador: ");
    String ip = input.next();
    System.out.println("Digite o MAC do roteador: ");
    String mac = input.next();
    System.out.println("Digite o gateway do roteador: ");
    String gateway = input.next();
    System.out.println("Digite o netmask do roteador: ");
    String netmask = input.next();
    System.out.println("Digite o DNS do roteador: ");
    String dns = input.next();

    // Supondo que a classe Router tem um construtor que aceita todos esses argumentos
    Device router = new Router(id, name, ip, mac, gateway, netmask, dns);
    devices.add(router); // Adiciona o dispositivo à lista
    System.out.println("\033[0m"); // volta a cor padrão do terminal 
}

private static void addSwitch(ArrayList<Device> devices, Scanner input)
{
    //Cor azul ciano
        System.out.println("\033[1;36m");

    System.out.println("Digite o ID do Switch : ");
    String id = input.next();
    System.out.println("\nDigite o nome do Switch: ");
    String name = input.next();
    System.out.println("\nDigite o IP  de Destino do Switch: ");
    String ip_origem = input.next();
    System.out.println("\nDigite o IP  de Origem do Switch: ");
    String ip_destino = input.next();
    System.out.println("\nDigite o MAC  de Destino do Switch: ");
    String mac_origem = input.next();
    System.out.println("\nDigite o MAC  de Origem do Switch: ");
    String mac_destino = input.next();
    System.out.println("\nDigite o netmask do Switch: ");
    String netmask = input.next();
    System.out.println("\nDigite o DNS do Switch: ");
    String dns = input.next();
    System.out.println("\nDigite o protocolo do Switch: ");
    String protocolo = input.next();

     // Supondo que a classe Router tem um construtor que aceita todos esses argumentos
    //Está a dar erro-->Device Switch = new Switch(id, name, ip_origem, ip_destino, mac_origem, mac_destino, netmask, dns, protocolo);
    //Está a dar erro-->devices.add(Switch);

    System.out.println("\033[0m"); // volta a cor padrão do terminal
}


private static void listDevices(ArrayList<Device> devices) {
     //Verificar
    //Cor azul ciano
        System.out.println("\033[1;36m");

        System.out.println("Listando dispositivos:");
        for (Device device : devices) {
            System.out.println(device);
        }
        if (devices.isEmpty()) {
            System.out.println("Nenhum dispositivo cadastrado.");
        }
        System.out.println("\033[0m"); // volta a cor padrão do terminal
    }
    


 private static void listDevicesTxt(ArrayList<Device> devices) {
        try {
            String nomeArquivo = "dispositivos.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
            for (Device device : devices) {
                writer.write(device.toString());
                writer.newLine();
            }
            writer.close();
            System.out.println("Arquivo criado com sucesso!\n");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo!\n");
        }
    }


private static void sendPacket(Device source, Device destination, String packetData) {
    System.out.println("Enviando pacote de " + source.getName() + " para " + destination.getName() + " com dados: " + packetData);
    
    if (!source.getNetmask().equals(destination.getNetmask())) {
        System.out.println("Os dispositivos não estão na mesma sub-rede.");
        return;
    }
    
    if (!isReachable(source, destination)) {
        System.out.println("Dispositivo de destino não está acessível.");
        return;
    }
    
    System.out.println("Pacote enviado de " + source.getName() + " para " + destination.getName() + " com dados: " + packetData);
}

private static void simulatePacketTransfer(ArrayList<Device> devices, Scanner input) {
    System.out.println("\033[1;36m");
    System.out.println("Simulação de envio de pacotes");
    System.out.println("Digite o ID do dispositivo de origem: ");
    String sourceId = input.next();
    System.out.println("Digite o ID do dispositivo de destino: ");
    String destinationId = input.next();
    System.out.println("Digite os dados do pacote: ");
    String packetData = input.next();

    Device source = findDeviceById(devices, sourceId);
    Device destination = findDeviceById(devices, destinationId);

    if (source != null && destination != null) {
        sendPacket(source, destination, packetData);
    } else {
        System.out.println("Dispositivo não encontrado.");
    }

    System.out.println("\033[0m");
}

private static Device findDeviceById(ArrayList<Device> devices, String id) {
    for (Device device : devices) {
        if (device.getId().equals(id)) {
            return device;
        }
    }
    return null;
}

private static boolean isReachable(Device source, Device destination) {
    for (Connection connection : source.getConnections()) {
        if (connection.getDestination().equals(destination)) {
            return true;
        }
    }
    return false;
}

}