public class Device extends Main{

    protected String id;
    protected String name;
    protected TipoInternet tipoConexao;
    

    // Construtor
    public Device(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Device created with ID: " + this.getId());

    }
     
    public Device() {
        this.tipoConexao = TipoInternet.NENHUMA; // valor padrão
    }
    
    // Método para definir o tipo de conexão
    public void setTipoConexao(TipoInternet tipo) {
        this.tipoConexao = tipo;
    }

    // Método para obter o tipo de conexão
    public TipoInternet getTipoConexao() {
        return this.tipoConexao;
    }

    // Getter para ID
    public String getId() {
        return this.id;
    }

    // Getter para nome
    public String getName() {
        return this.name;
    }

    // Setter para ID
    public void setId(String id) {
        this.id = id;
    }

    // Setter para nome
    public void setName(String name) {
        this.name = name;
    }

    
    public void printDevice() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.name);
        
    }
    // To string
    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", name=" + name + '}';
    }
}
