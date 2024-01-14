/*
 * Classe Router que herda tudo de Device
 * Aqui nesta classe é possível Adicionar Routers.
 */
class Router extends Device {
    /*
    *Construtor da classe Router.
    *Este construtor será chamado quando um novo objeto Router for criado.
    *Ele recebe vários parâmetros que são passados para o construtor da classe base Device através da palavra-chave 'super'.
     */
    Router(String id, String name, String ip, String mac, String gateway, String netmask, String dns) {
        super(id, name, ip, mac, gateway, netmask, dns);
    }
}