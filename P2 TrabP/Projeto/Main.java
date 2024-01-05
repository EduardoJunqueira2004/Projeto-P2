import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Device> devices = new HashMap<>();
    static Map<String, String> connections = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            imprimirMenu();
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    addDevice(new Computer(), input);
                    break;
                case 2:
                    addDevice(new Router(), input);
                    break;
                case 3:
                    addDevice(new Switch(), input);
                    break;
                case 4:
                    addConnection(input);
                    break;
                case 5:
                    listDevices();
                    break;
                case 6:
                    listDevicesFromFile();
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
        System.out.println("\nMenu de Gerenciamento de Dispositivos:");
        System.out.println("1 - Adicionar Computador");
        System.out.println("2 - Adicionar Router");
        System.out.println("3 - Adicionar Switch");
        System.out.println("4 - Adicionar Conexão"); 
        System.out.println("5 - Listar Dispositivos na rede");
        System.out.println("6 - Listar Dispositivos por arquivo"); 
        System.out.println("7 - Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void addDevice(Device device, Scanner input) {
        System.out.println("Digite o ID do dispositivo: ");
        String id = input.nextLine();
        System.out.println("Digite o nome do dispositivo: ");
        String name = input.nextLine();
        System.out.println("Digite o IP do dispositivo: ");
        String ip = input.nextLine();
        System.out.println("Digite o MAC do dispositivo: ");
        String mac = input.nextLine();
        System.out.println("Digite o gateway do dispositivo: ");
        String gateway = input.nextLine();
        System.out.println("Digite o netmask do dispositivo: ");
        String netmask = input.nextLine();
        System.out.println("Digite o DNS do dispositivo: ");
        String dns = input.nextLine();

        device.id = id;
        device.name = name;
        device.ip = ip;
        device.mac = mac;
        device.gateway = gateway;
        device.netmask = netmask;
        device.dns = dns;

        devices.put(id, device);
        System.out.println("Dispositivo adicionado com sucesso!");
    }

    private static void listDevices() {
        if (devices.isEmpty()) {
            System.out.println("Nenhum dispositivo cadastrado.");
            return;
        }
        for (Device device : devices.values()) {
            System.out.println(device);
        }
    }

    private static void addConnection(Scanner input) {
        System.out.println("Digite o ID do dispositivo de origem: ");
        String sourceId = input.nextLine();
        System.out.println("Digite o ID do dispositivo de destino: ");
        String destinationId = input.nextLine();

        if (!devices.containsKey(sourceId) || !devices.containsKey(destinationId)) {
            System.out.println("Um ou ambos os dispositivos não existem.");
            return;
        }

        connections.put(sourceId, destinationId);
        System.out.println("Conexão adicionada com sucesso entre " + sourceId + " e " + destinationId);
    }

    private static void listDevicesFromFile() {
        
        System.out.println("Listando dispositivos a partir de um arquivo (funcionalidade simulada):");
        // Simulação: mostrar alguns dispositivos
        System.out.println("ID: comp123, Name: Computador1, IP: 192.168.1.2, MAC: AA:BB:CC:DD:EE:FF");
        System.out.println("ID: rout456, Name: Roteador1, IP: 192.168.1.1, MAC: FF:EE:DD:CC:BB:AA");
        // Continuar com a simulação ou implementar a leitura real do arquivo
    }
}