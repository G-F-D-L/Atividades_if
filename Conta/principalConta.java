package conta;
public class principalConta {
    public static void main(String[] args) {
        conta c1 = new conta(867,"Elon Musk");
        conta c2 = new conta(967, "Emilly");
        conta c3 = new conta(1067, "Janiel");

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

        c1.setTitular("ksuM nolE");
        c2.setTitular("Emilly Firmino");
        c3.setTitular("Janiel Bobbie Goods");

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
