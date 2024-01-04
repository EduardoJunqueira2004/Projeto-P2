import java.util.Scanner;
import java.util.ArrayList;
//Processa em cada switch e em cada Router para cada PC
public class Main {

    public static void main(String[] args)  throws Exception{
        ArrayList<Device> dispositivos = new ArrayList<>();
        ArrayList<Device> router = new ArrayList<>();
        ArrayList<Device> Switch = new ArrayList<>();
        ArrayList<Device> Computer = new ArrayList<>();
        ArrayList<Device> Connection = new ArrayList<>();
        ArrayList<Device> File = new ArrayList<>();
        ArrayList<Device> listDevices = new ArrayList<>();
        ArrayList<Device> removeConnection = new ArrayList<>();
        

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
                //simulação de enviar pacotes
                    addConnection(dispositivos, input);
                    break;    
                case 5:
                    listDevices(dispositivos);
                    break;
                case 6:
                //chamar a função file.java

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
         System.out.println("\n\t║                        4 - Adicionar Conexão                                                     ║");
         System.out.println("\n\t║                        5 - Listar Dispositivos na rede                                           ║");
         System.out.println("\n\t║                        6 - Listar Dispositivos por ficheiro txt em construção                    ║");                                        
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

private static void addConnection(ArrayList<Device> devices, Scanner input)
{
    //em construção
     //Cor azul ciano
        System.out.println("\033[1;36m");

    System.out.println("\nDigite o ID do dispositivo 1: ");
    String id1 = input.next();
    System.out.println("\nDigite o ID do dispositivo 2: ");
    String id2 = input.next();
    System.out.println("\nDigite o tipo de conexão: ");
    String type = input.next();

    System.out.println("\033[0m"); // volta a cor padrão do terminal
}


private static void removeConnection(ArrayList<Device> devices, Scanner input)
{
//Ver package .utils em construção
    //Cor azul ciano
        System.out.println("\033[1;36m");
    System.out.println("\nDigite o ID do dispositivo 1: ");
    String id1 = input.next();
    System.out.println("\nDigite o ID do dispositivo 2: ");
    String id2 = input.next();
    System.out.println("\nDigite o tipo de conexão: ");
    String type = input.next();

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
    
}
