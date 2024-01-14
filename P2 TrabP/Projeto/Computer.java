/*
 * Classe Computer que herda tudo de Device
 * Aqui nesta classe é possível Adicionar Computadores.
 */
class Computer extends Device {
    /*
    *Construtor da classe Computer.
    *Este construtor será chamado quando um novo objeto Computer for criado.
    *Ele recebe vários parâmetros que são passados para o construtor da classe base Device através da palavra-chave 'super'.
     */
    Computer(String id, String name, String ip, String mac, String gateway, String netmask, String dns) {
        super(id, name, ip, mac, gateway, netmask, dns);
    }
}