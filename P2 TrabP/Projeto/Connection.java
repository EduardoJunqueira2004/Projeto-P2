/**
 * Representa uma conexão entre dois dispositivos em uma rede.
 */

public class Connection {
    private Device source;       // Dispositivo de origem da conexão
    private Device destination;  // Dispositivo de destino da conexão
    private String type;         // Tipo de conexão (ex: Ethernet, Wi-Fi)

    //Getter's e Setter's

    /**
     * Construtor para criar uma nova conexão.
     *
     * @param source      O dispositivo de origem da conexão
     * @param destination O dispositivo de destino da conexão
     * @param type        O tipo da conexão
     */
    public Connection(Device source, Device destination, String type) {
        this.source = source;
        this.destination = destination;
        this.type = type;
    }

    // Getters e Setters

    public Device getSource() {
        return this.source;
    }

    public Device getDestination() {
        return this.destination;
    }

    public String getType() {
        return this.type;
    }

    public void setSource(Device source) {
        this.source = source;
    }

    public void setDestination(Device destination) {
        this.destination = destination;
    }

    public void setType(String type) {
        this.type = type;
    }
    //to string
    @Override
    public String toString() {
        return "Connection{" + "source=" + source + ", destination=" + destination + ", type=" + type + '}';
    }
    
}
