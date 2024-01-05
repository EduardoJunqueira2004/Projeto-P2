//Superclasse Device.java 

public class Device extends Main{

    protected String id, name, IP,MAC, gateway, netmask, dns;
    protected TipoInternet tipoConexao;
    

    // Construtor
    public Device(String id, String name,String IP,String MAC,String gateway,String netmask, String dns) {
        this.id = id;
        this.name = name;
        this.IP= IP;
        this.MAC= MAC;
        this.gateway = gateway;
        this.netmask = netmask;
        this.dns = dns;
       // System.out.println("Device created with ID: " + this.getId());


    }
     
    public Device() {
        this.tipoConexao = TipoInternet.NENHUMA; // valor padrão
    }
    /**
     * Construtor para device
     *
     * @param id      
     * @param name
     * @param IP
     * @param MAC
     * @param gateway
     * @param netmask
     * @param dns
     */
    //Métodos
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public TipoInternet getTipoConexao() {
        return tipoConexao;
    }
    public void setTipoConexao(TipoInternet tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public String getIP() {
            return IP;
        }
        public void setIP(String IP) {
            this.IP = IP;
        }
        public String getMAC() {
            return MAC;
        }
        public void setMAC(String MAC) {
            this.MAC = MAC;
        }
        public String getGateway() {
            return gateway;
        }
        public void setGateway(String gateway) {
            this.gateway = gateway;
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


    // To string // Método para imprimir o dispositivo
    @Override
    public String toString() {
        return "ID: " + this.id + "\nNome: " + this.name + "\nIP: " + this.IP + "\nMAC: " + this.MAC + "\nGateway: " + this.gateway + "\nNetmask: " + this.netmask + "\nDNS: " + this.dns + "\n";
    }
}
