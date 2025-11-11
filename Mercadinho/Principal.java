public class Principal {
    public static void main(String[] args) {
        
        Mercadinho m = new Mercadinho(6);
        
        m.adicionarCliente(new ClienteOuroVip("neto", 150.0, "Rua aleatória pro código 1 =>", "2-0398103"));
        m.adicionarCliente(new ClienteRegular("Iago", 150.0));
        m.adicionarCliente(new ClienteVip("tonho", 150.0, "Rua aleatória pro código 2 =>"));
        m.adicionarCliente(new ClienteRegular("Danil", 150.0));

        m.imprimirClientes();

        System.out.println("Valor total----------");
        System.out.println(m.calcularValorTotal());
    }
}
