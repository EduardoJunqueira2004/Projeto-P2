// Arquivo: Switch.java

public class Switch extends Device {
    private String ipOrigem;
    private String ipDestino;
    private String macOrigem;
    private String macDestino;
    private String protocolo;
    private Integer portas;

    // Ajuste os parâmetros conforme necessário e chame o construtor da superclasse Device
    public Switch(String id, String name, String ipOrigem, String ipDestino, String macOrigem, String macDestino, String netmask, String dns, String protocolo,Integer portas) {
        
        super(id, name, ipOrigem, macOrigem, "gateway não especificado", netmask, dns); 
        this.portas = portas;
        this.ipOrigem = ipOrigem;
        this.ipDestino = ipDestino;
        this.macOrigem = macOrigem;
        this.macDestino = macDestino;
        this.protocolo = protocolo;
    }

    // Implemente os métodos get e set conforme necessário

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMacOrigem() {
        return macOrigem;
    }

    public void setMacOrigem(String macOrigem) {
        this.macOrigem = macOrigem;
    }

    public String getMacDestino() {
        return macDestino;
    }

    public void setMacDestino(String macDestino) {
        this.macDestino = macDestino;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }


}
