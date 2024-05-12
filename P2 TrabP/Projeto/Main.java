import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
//Processa em cada switch e em cada Router para cada PC
public class Main {

    private static List<Packet> packetHistory = new ArrayList<>();

    public static void main(String[] args)  throws Exception{
        ArrayList<Device> dispositivos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

do {
    
    imprimirMenu();
    System.out.print("Escolha uma opção (1-8): ");
    String linha = input.nextLine(); // Lê a linha inteira como uma string
    int opcao;
    try {
        opcao = Integer.parseInt(linha); // Tenta converter a linha para um inteiro

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
                listDevices(dispositivos, input);
                break;
            case 6:
                listDevicesTxt(dispositivos);
                break;
            case 7:
                removeAllDevices(dispositivos, input);
                break;
            case 8:
                System.out.println("Saindo do programa...");
                input.close(); // Fechar o scanner antes de sair
                System.exit(0); // Sai do programa
                break;
            default:
                System.out.println("Opção inválida! Por favor, insira um número de 1 a 8.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Entrada inválida! Por favor, insira um número de 1 a 8.");
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
         System.out.println("\n\t║                        6 - Relátorio Dispositivos TXT                                            ║");
         System.out.println("\n\t║                        7 - Remover Todos os Dispositivos                                         ║");  
         System.out.println("\n\t║                        8 - Sair                                                                  ║");                                               
         System.out.println("\n\t║                                                                                                  ║");
         System.out.println("\n\t║                                                                                                  ║");
         System.out.println("\n\t╚══════════════════════════════════════════════════════════════════════════════════════════════════╝");
         System.out.println("\033[0m"); // volta a cor padrão do terminal
        System.out.print("\nEscolha uma opção: ");
        }
        

//Para o computador
private static void addComputer(ArrayList<Device> devices, Scanner input) {
    clearScreen();
    System.out.println("\033[1;36m"); // Cor azul ciano
    System.out.println("Adicionando um novo computador:");
    
    System.out.print("Digite o ID do computador: ");
    String id = input.next();
    System.out.print("Digite o nome do computador: ");
    String name = input.next();
    String randomIp = generateRandomIp();
    System.out.println("Endereço IP gerado aleatoriamente: " + randomIp);

    if (!isUniqueIdAndIp(devices, id, randomIp)) {
        System.out.println("Erro: Um computador com esse ID ou IP já existe.");
        System.out.println("1 - Voltar ao menu principal");
        System.out.println("2 - Sair do programa");
        System.out.print("Escolha uma opção: ");
        
        int option = 0;
        boolean validOption = false;
        while (!validOption) {
            try {
                option = input.nextInt();
                validOption = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                input.next(); // Limpa o buffer do scanner
            }
        }

        switch (option) {
            case 1:
                return; // Retorna ao menu principal
            case 2:
                System.out.println("Saindo do programa...");
                input.close(); // Fechar o scanner antes de sair
                System.exit(0); // Sai do programa
            default:
                System.out.println("Opção inválida. Retornando ao menu principal.");
                return;
        }
    }

    System.out.print("Digite o MAC do computador: ");
    String mac = input.next();
    System.out.print("Digite o gateway do computador: ");
    String gateway = input.next();
    System.out.print("Digite o netmask do computador: ");
    String netmask = input.next();
    System.out.print("Digite o DNS do computador: ");
    String dns = input.next();

    Device computer = new Computer(id, name, randomIp, mac, gateway, netmask, dns);
    devices.add(computer);
    System.out.println("Computador adicionado com sucesso!");
    System.out.println("\033[0m"); // Volta a cor padrão do terminal
}

//Para o router
private static void addRouter(ArrayList<Device> devices, Scanner input) {
   //Cor azul ciano
        System.out.println("\033[1;36m");

    clearScreen();

    System.out.println("Digite o ID do roteador: ");
    String id = input.next();
    System.out.println("\033[0mDigite o nome do roteador: "); // Reseta a cor
    String name = input.next();
    String randomIp = generateRandomIp();
    System.out.println("Endereço IP gerado aleatoriamente: " + randomIp);
    System.out.println("Digite o MAC do roteador: ");
    String mac = input.next();
    System.out.println("Digite o gateway do roteador: ");
    String gateway = input.next();
    System.out.println("Digite o netmask do roteador: ");
    String netmask = input.next();
    System.out.println("Digite o DNS do roteador: ");
    String dns = input.next();

    // Supondo que a classe Router tem um construtor que aceita todos esses argumentos
    Device router = new Router(id, name, randomIp, mac, gateway, netmask, dns);
    devices.add(router); // Adiciona o dispositivo à lista
    System.out.println("\033[0m"); // volta a cor padrão do terminal 
}

private static void addSwitch(ArrayList<Device> devices, Scanner input)
{
    //Cor azul ciano
    clearScreen();
        System.out.println("\033[1;36m");

    System.out.println("Digite o ID do Switch : ");
    String id = input.next();
    System.out.println("\nDigite o nome do Switch: ");
    String name = input.next();
    System.out.println("Digite a porta que deseja conectar o Switch: ");
    String porta = input.next();
    
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

    Device switchDevice = new Switch(id, name, ip_origem, ip_destino, mac_origem, mac_destino, netmask, dns, protocolo, null);

    devices.add(switchDevice);

    System.out.println("\033[0m"); // volta a cor padrão do terminal
}


private static void listDevices(ArrayList<Device> devices, Scanner input) {
    int choice; // Declaração da variável choice antes do loop
    
    do {
        clearScreen();
        System.out.println("\033[1;36m"); // Cor azul ciano
        System.out.println("Listando dispositivos:");

        if (devices.isEmpty()) {
            System.out.println("Nenhum dispositivo cadastrado.");
        } else {
            for (Device device : devices) {
                String deviceType = "Dispositivo"; // Tipo genérico se não for nenhum dos tipos conhecidos

                if (device instanceof Computer) {
                    deviceType = "Computador\n";
                } else if (device instanceof Router) {
                    deviceType = "Router\n";
                } else if (device instanceof Switch) {
                    deviceType = "Switch\n";
                }

                System.out.println(deviceType + ": " + device);
            }
        }

        System.out.println("\033[0m"); // Volta a cor padrão do terminal

        // Mini-menu após a listagem
    
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Voltar ao menu principal");
        System.out.println("2 - Sair do programa");
        System.out.print("Opção: ");

        try {
            choice = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            input.next(); // Limpa o buffer do scanner
            continue; // Continua no loop para que o usuário possa tentar novamente
        }

        switch (choice) {
            case 1:
                return; // Retorna ao menu principal
            case 2:
                System.out.println("Saindo do programa...");
                input.close(); // Fechar o scanner antes de sair
                System.exit(0); // Sai do programa
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
                break;
        }
    do {
        // Rest of the code

    } while (choice != 2);
    } while (true);
}


    
private static void listDevicesTxt(ArrayList<Device> devices) {
    try {
        clearScreen();
        String nomeArquivoDevices = "dispositivos.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivoDevices));
        for (Device device : devices) {
            writer.write(device.toString());
            writer.newLine();
        }
        writer.close();
        System.out.println("Arquivo de dispositivos criado com sucesso!\n");

        // Escrevendo o histórico de pacotes em um arquivo separado
        String nomeArquivoPackets = "historico_pacotes.txt";
        writePacketHistoryToFile(nomeArquivoPackets);

    } catch (IOException e) {
        System.out.println("Erro ao criar arquivo de dispositivos!\n");
    }
}

private static void sendPacket(Device source, Device destination, String packetData) {
    
    clearScreen();
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
    packetHistory.add(new Packet(source, destination, packetData));
}

private static void simulatePacketTransfer(ArrayList<Device> devices, Scanner input) {
    clearScreen();
    System.out.println("\033[1;36m"); // Cor azul ciano
    System.out.println("Dispositivos disponíveis e seus IPs:");
    
    if (devices.isEmpty()) {
        System.out.println("Nenhum dispositivo cadastrado.");
        return; // Retorna ao menu anterior se não houver dispositivos
    }
    
    // Listando todos os dispositivos com seus IPs
    for (Device device : devices) {
        System.out.println(device.getName() + " - IP: " + device.getIP());
    }

    System.out.println("Digite o IP do dispositivo de origem para a simulação de envio de pacotes:");
    String sourceIp = input.next();
    System.out.println("Digite o IP do dispositivo de destino:");
    String destinationIp = input.next();
    System.out.println("Digite os dados do pacote:");
    String packetData = input.next();

    Device source = findDeviceByIp(devices, sourceIp);
    Device destination = findDeviceByIp(devices, destinationIp);

    if (source != null && destination != null) {
        sendPacket(source, destination, packetData);
    } else {
        System.out.println("Dispositivo com o IP fornecido não encontrado.");
    }

    System.out.println("\033[0m"); // Volta a cor padrão do terminal
}


private static Device findDeviceByIp(ArrayList<Device> devices, String ip) {
    for (Device device : devices) {
        if (device.getIP().equals(ip)) {
            return device;
        }
    }
    return null;
}

private static boolean isReachable(Device source, Device destination) {
    return source.getNetmask().equals(destination.getNetmask());
}

public static void clearScreen() {
    try {
        String os = System.getProperty("os.name");

        if (os.contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            // Em ambientes Unix, isso limpará a tela do terminal.
            // O comando 'clear' também pode ser usado da seguinte forma:
            // new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (IOException | InterruptedException ex) {
        ex.printStackTrace();
    }
}

private static void removeAllDevices(ArrayList<Device> dispositivos, Scanner input) {
    clearScreen();
    System.out.println("\033[1;36m");
    System.out.println("Tem certeza de que deseja remover todos os dispositivos? (sim/não)");
    String resposta = input.next().trim().toLowerCase();
    if (resposta.equals("sim")) {
        dispositivos.clear();
        System.out.println("Todos os dispositivos foram removidos.");
    } else {
        System.out.println("A remoção de todos os dispositivos foi cancelada.");
    }
}

//funçºao para editar alldevices



private static void writePacketHistoryToFile(String nomeArquivo) {
    ArrayList<Packet> packetHistory = new ArrayList<>(); // Declare and initialize packetHistory variable
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) { // O true é para append
        for (Packet packet : packetHistory) {
            writer.write(packet.toString());
            writer.newLine();
        }
        System.out.println("Histórico de pacotes gravado em: " + nomeArquivo);
    } catch (IOException e) {
        System.out.println("Erro ao escrever o histórico de pacotes no arquivo.");
        e.printStackTrace();
    }
}

private static boolean isUniqueIdAndIp(ArrayList<Device> devices, String id, String ip) {
    for (Device device : devices) {
        if (device.getId().equals(id) || device.getIP().equals(ip)) {
            return false; // Encontrou um dispositivo com o mesmo ID ou IP
        }
    }
    return true; // ID e IP são únicos
}

private static Random random = new Random();

public static String generateRandomIp() {
    return random.nextInt(256) + "." + 
           random.nextInt(256) + "." + 
           random.nextInt(256) + "." + 
           random.nextInt(256);
}

}