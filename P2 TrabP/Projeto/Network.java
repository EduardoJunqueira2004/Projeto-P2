
import java.util.ArrayList;
//Em construção.....
public class Network 
{
    private ArrayList<Device> devices;
    
    public Network() 
    {
        devices = new ArrayList<Device>();
    }
    //Adiciona um dispositivo na rede
    public void addDevice(Device device) 
    {
        devices.add(device);
    }
    //Remove um dispositivo da rede
    public void removeDevice(Device device) 
    {
        devices.remove(device);
    }

}
