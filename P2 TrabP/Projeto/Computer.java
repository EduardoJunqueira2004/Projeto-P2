public class Computer extends Device
{
    private String ip;
    private String mac;
    private String gateway;
    private String netmask;
    private String dns;
    
    public Computer(String id, String name, String ip, String mac, String gateway, String netmask, String dns)
    {
        super(id, name);
        this.ip = ip;
        this.mac = mac;
        this.gateway = gateway;
        this.netmask = netmask;
        this.dns = dns;
    }

    //Métodos Getter's e Setters
    public String getIp()
    {
        return this.ip;
    }

    public String getMac()
    {
        return this.mac;
    }

    public String getGateway()
    {
        return this.gateway;
    }

    public String getNetmask()
    {
        return this.netmask;
    }

    public String getDns()
    {
        return this.dns;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public void setMac(String mac)
    {
        this.mac = mac;
    }

    public void setGateway(String gateway)
    {
        this.gateway = gateway;
    }

    public void setNetmask(String netmask)
    {
        this.netmask = netmask;
    }

    public void setDns(String dns)
    {
        this.dns = dns;
    }

    public String toString()
    {   
        
        return "ID: " + this.id + "\n" + "Name: " + this.name + "\n" + "IP: " + this.ip + "\n" + "MAC: " + this.mac + "\n" + "Gateway: " + this.gateway + "\n" + "Netmask: " + this.netmask + "\n" + "DNS: " + this.dns + "\n";
    }




}
