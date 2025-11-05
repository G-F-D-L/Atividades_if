public class Principal {
    public static void main(String[] args) {
        
        Mercadinho m = new Mercadinho(6);
        
        m.adicionarCliente(new ClienteRegular("neto", 150.0));
        m.adicionarCliente(new ClienteVip("ana", 200.0, "1234-5678-9012-3456"));
        System.out.println(m.calcularValorTotal());

    }
}
