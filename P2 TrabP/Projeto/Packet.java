/*
 * Classe Packet 
 * Aqui nesta classe é possível Adicionar os pacotes de envio de dados
 */
public class Packet {
    private Device source;
    private Device destination;
    private String data;

    public Packet(Device source, Device destination, String data) {
        this.source = source;
        this.destination = destination;
        this.data = data;
    }

    @Override
    public String toString() {
        return "De: " + source.getName() + ", Para: " + destination.getName() + ", Dados: " + data;
    }
    
    public Device getSource() {
        return source;
    }

    public void setSource(Device source) {
        this.source = source;
    }

    public Device getDestination() {
        return destination;
    }

    public void setDestination(Device destination) {
        this.destination = destination;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
