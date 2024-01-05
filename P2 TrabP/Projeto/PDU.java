import java.util.HashMap;
import java.util.Map;


//PDU.java serve para tratar dos pacotes enviados para cada pc via switch ou router através de funções
public class PDU extends Device{
    //Pacotes 
    //Função enviar
    //Função receber
    //Função processa
    //Função Verificação
    //Função to String

    //Pacotes
    private String source;//origem
    private String destination;//destino
    private int packetSize;// packet size
    private String data; //conteúdo
    private Boolean PDU;
    
    public PDU(String source, String destination, int packetSize, String data,Boolean PDU)
    {
        this.source = source;
        this.packetSize = packetSize;
        this.destination = destination;
        this.data = data;
        this.PDU = PDU;
    }

    //Métodos Getters e Setters

    public String getSource()
    {
        return source;  
    }

    public String getDestination()
    {
        return destination;
    }

    public int getPacketSize()
    {
        return packetSize;
    }

    public String getData()
    {
        return data;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setPacketSize(int packetSize)
    {
        this.packetSize = packetSize;
    }

    public void setData(String data)
    {
        this.data = data;
    }



    public void processa()
    {
        System.out.println("PDU processado");
        
    }

    public void verifica(String PDU)
    {
        if (!this.getClass().getName().equals(PDU))
        {
            System.out.println("PDU não verificado");
            return;
        }
        try
        {
            PDU pdu = (PDU) Class.forName(PDU).newInstance();
        }
        catch (Exception e)
        {
            System.out.println("PDU não verificado");
            return;
        }
        System.out.println("PDU verificado");
    }

    public void enviar()
    {   
        
        if (PDU = true){
        System.out.println("PDU enviado");
        }
        else{
            System.out.println("PDU não enviado");
        }
    }   
    public String toString()
    {
        return "Source: " + source + "\nDestination: " + destination + "\nPacket Size: " + packetSize + "\nData: " + data;
    }


}
