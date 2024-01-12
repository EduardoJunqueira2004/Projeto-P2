/**
 * Representa uma conexão entre dois dispositivos em uma rede, enviar pacotes de um dispositivo para outro.
 */

public class Connection extends Main{
    private Device source;       // Dispositivo de origem da conexão
    private Device destination;  // Dispositivo de destino da conexão
    private TipoInternet tipo;         // Tipo de conexão (ex: Ethernet, Wi-Fi)
    private String connection;

    //Getter's e Setter's

    /**
     * Construtor para criar uma nova conexão.
     *
     * @param source      O dispositivo de origem da conexão
     * @param destination O dispositivo de destino da conexão
     * @param tipo        O tipo da conexão
     * @param connection Conecção
     */
    
    public Connection(Device source, Device destination, TipoInternet tipo, String connection) {
        this.source = source;
        this.destination = destination;
        this.tipo = tipo;
        this.connection=connection;
    }

    // Getters e Setters

    public Device getSource() {
        return this.source;
    }

    public Device getDestination() {
        return this.destination;
    }

    
    public void setSource(Device source) {
        this.source = source;
    }

    public void setDestination(Device destination) {
        this.destination = destination;
    }

    public void setType(TipoInternet tipo) {
        this.tipo = tipo;
    }

    public String getConnection() {
        return connection;
    }
    public void setConnection(String connection) {
        this.connection = connection;
    }
    //to string
    @Override
    public String toString() {
        return "Connection{" + "source=" + source + ", destination=" + destination + ", type=" + tipo + ", connection=" + connection +'}';
    }
    
}
