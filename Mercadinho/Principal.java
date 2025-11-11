public class Principal {
    public static void main(String[] args) {
        
        Mercadinho m = new Mercadinho(6);
        
        m.adicionarCliente(new ClienteOuroVip("neto", 150.0, "Rua aleatória pro código 1 =>", "2-0398103"));
        m.imprimirClientes();
        System.out.println(m.calcularValorTotal());
    }
}
