package atividade_conta;

public class principalConta{
    public static void main(String args[]) {
        Conta T1 = new Conta(45924873, "Danão", 0, true);
        Conta T2 = new Conta(84937586, "Tonho", 0, true);
        Conta T3 = new Conta(85928562, "Ogai,", 0, true);

        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);

        T1.depositar(500000.00);
        T2.depositar(1000000.00);
        T3.depositar(850301.00);

        System.out.println(T1);
        System.out.println(T2);
        T3.exibir();

        T1.setTitular("Danão do bolo");
        T2.setTitular("tonho tonho");
        T3.setTitular("Ogai Iago");

        T1.sacar(500000000);
        T2.sacar(1503958.50);
        T3.sacar(58923.99);

        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);

        T2.desativar();
        T3.desativar();

        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);



    }
}