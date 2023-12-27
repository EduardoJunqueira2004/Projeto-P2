import java.util.ArrayList;

public class Router extends Device 
{

    private ArrayList<Connection> connections; // Lista de conexões do roteador
    private String ip;
    private String mac;
    private String gateway;
    private String netmask;
    private String dns;
    
    // Construtor
    public Router(String id, String name, String ip, String mac, String gateway, String netmask, String dns) {
        super(id, name); // Chama o construtor da classe base (Device)
        this.ip = ip;
        this.mac = mac;
        this.gateway = gateway;
        this.netmask = netmask;
        this.dns = dns;
        this.connections = new ArrayList<>();
    }

    // Adiciona uma conexão ao roteador
    public void addConnection(Connection connection) {
        this.connections.add(connection);
    }

    // Remove uma conexão do roteador
    public void removeConnection(Connection connection) {
        this.connections.remove(connection);
    }

    // Obter a lista de conexões
    public ArrayList<Connection> getConnections() {
        return this.connections;
    }

    //to string
    @Override
    public String toString() {
        return "Router{ID: " + this.id + "\n"  + "Name: " + this.name + "\n" + "connections=" + connections + ", ip=" + ip + ", mac=" + mac + ", gateway=" + gateway + ", netmask=" + netmask + ", dns=" + dns + '}';
    }
    
}
