import java.util.ArrayList;

public class Switch  extends Device
{

     private ArrayList<Connection> Switch; // Lista de conexões do Switch
    private String ip_origem;
    private String ip_destino;
    private String mac_origem;
    private String mac_destino;
    private String gateway;
    private String porta_origem;
    private String porta_destino;
    private String protocolo;
    private String netmask;
    private String dns;
    
    public Switch(String id, String name, String ip_origem,String ip_destino, String mac_origem,String mac_destino, String gateway, String netmask, String dns, String porta_origem, String porta_destino, String protocolo)
    {
        super(id, name);
        this.ip_origem = ip_origem;
        this.ip_destino = ip_destino;
        this.mac_origem = mac_origem;
        this.mac_destino = mac_destino;
        this.gateway = gateway;
        this.porta_origem = porta_origem;
        this.porta_destino = porta_destino;
        this.protocolo = protocolo;
        this.netmask = netmask;
        this.dns = dns;
        this.Switch = new ArrayList<>();


    }

   //Métodos Getters e Setter's
    public String getIp_origem() {
        return ip_origem;
    }

    public void setIp_origem(String ip_origem) {
        this.ip_origem = ip_origem;
    }

    public String getIp_destino() {
        return ip_destino;
    }

    public void setIp_destino(String ip_destino) {
        this.ip_destino = ip_destino;
    }

    public String getMac_origem() {
        return mac_origem;
    }

    public void setMac_origem(String mac_origem) {
        this.mac_origem = mac_origem;
    }

    public String getMac_destino() {
        return mac_destino;
    }

    public void setMac_destino(String mac_destino) {
        this.mac_destino = mac_destino;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getPorta_origem() {
        return porta_origem;
    }

    public void setPorta_origem(String porta_origem) {
        this.porta_origem = porta_origem;
    }

    public String getPorta_destino() {
        return porta_destino;
    }

    public void setPorta_destino(String porta_destino) {
        this.porta_destino = porta_destino;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }
    
    // Adiciona uma conexão ao Switch
    public void addConnection(Connection connection) {
        this.Switch.add(connection);
    }
    
    // Remove uma conexão do roteador
    public void removeConnection(Connection connection) {
        this.Switch.remove(connection);
    }

    // Obter a lista de conexões
    public ArrayList<Connection> getConnections() {
        return this.Switch;
    }


    //To string para switch
    @Override
    public String toString() 
    {
        //Falta chamar construtor e meter nome e id
        return "Switch{ID: " + this.id + "\n"  + "Name: " + this.name + "\n"  + "ip_origem=" + ip_origem + ", ip_destino=" + ip_destino + ", mac_origem=" + mac_origem + ", mac_destino=" + mac_destino + ", gateway=" + gateway + ", porta_origem=" + porta_origem + ", porta_destino=" + porta_destino + ", protocolo=" + protocolo + ", netmask=" + netmask + ", dns=" + dns + '}';
    }
}