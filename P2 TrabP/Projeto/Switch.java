/*
 * Classe Switch que herda tudo de Device
 * Aqui nesta classe é possível Adicionar Switch.
 */


import java.util.HashMap;//Usamos o HasMap nesta classe
public class Switch extends Device {
    private String ipOrigem;
    private String ipDestino;
    private String macOrigem;
    private String macDestino;
    private String protocolo;
    private HashMap<String, String> portas; // Adicionado para gerenciar as portas

    public Switch(String id, String name, String gateway,String ipOrigem, String ipDestino, String macOrigem, String macDestino, String netmask, String dns, String protocolo) {
        /*
    *Construtor da classe Switch.
    *Este construtor será chamado quando um novo objeto Switch for criado.
    *Ele recebe vários parâmetros que são passados para o construtor da classe base Device através da palavra-chave 'super'.
    *Também é aplicado aqui o polimorfismo onde é implementado mais Variáveis que não estão defenidas na classe super Device.
     */
        super(id, name, ipOrigem, macOrigem, gateway, netmask, dns); 
        this.ipOrigem = ipOrigem;
        this.ipDestino = ipDestino;
        this.macOrigem = macOrigem;
        this.macDestino = macDestino;
        this.protocolo = protocolo;
        this.portas = new HashMap<>(); // Inicializa o HashMap de portas
    }

    // Métodos para gerenciar portas
    public void addPorta(String numeroPorta, String tipo) {
        portas.put(numeroPorta, tipo);
    }
    public boolean isOpened(String porta) {
        return portas.containsKey(porta);
    }
    public String getTipoPorta(String porta) {
        return portas.get(porta);
    }
    public void removePorta(String porta) {
        portas.remove(porta);
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
