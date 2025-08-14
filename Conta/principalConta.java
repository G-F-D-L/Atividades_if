public class principalConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(867,"Elon Musk");
        Conta c2 = new Conta(967, "Emilly");
        Conta c3 = new Conta(1067, "Janiel");

        c1.exibir();
        c2.exibir();
        c3.exibir();  
        
        c1.ativar();
        c2.ativar();
        c3.ativar();

        c1.depositar(1000000000);
        c2.depositar(10);
        c3.depositar(800);

        c1.exibir();
        c2.exibir();
        c3.exibir();

        c1.setNome("ksuM nolE");
        c2.setNome("Emilly Firmino");
        c3.setNome("Janiel Bobbie Goods");

        c1.sacar(50000);
        c2.sacar(5);
        c3.sacar(799);

        c1.exibir();
        c2.exibir();
        c3.exibir();

        c2.desativar();
        c3.desativar();

        c1.exibir();
        c2.exibir();
        c3.exibir();
    
    }
}
