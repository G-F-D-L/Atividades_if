public class principalTelevisor {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor(0, false, 0);
        controleRemoto con1 = new controleRemoto(tv1);
    
        System.out.println(tv1);

        con1.ligar();
        
        System.out.println(tv1);

        con1.aumentarVolume(48);

        System.out.println(tv1);

        con1.diminuirVolume(20);

        System.out.println(tv1);

        con1.trocarCanal(95.05);

        System.out.println(tv1);

        con1.trocarCanal(10.03);

        con1.desligar();

        System.out.println(tv1);
    }

}
