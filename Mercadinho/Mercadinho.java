public class Mercadinho {   
    private Cliente[] clientes;
    private int quantidade;

    public Mercadinho(int quantidade) {
        this.clientes = new Cliente[quantidade];
        this.quantidade = 0;
    }

    public void adicionarCliente(Cliente cliente){
        if (clientes.length > quantidade){
            clientes[quantidade] = cliente;
            quantidade++;
        } else{
            System.out.println("cheio");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes(){
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cliente: " + clientes[i].toString());
        }
    }
    
}
