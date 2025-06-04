public class PrincipalHelicoptero {
    public static void main(String[] args){
        //criando instâncias
        Helicoptero H1 = new Helicoptero (5);
        Helicoptero H2 = new Helicoptero (9);

        //estado atual do Helicóptero
        System.out.println(H1);
        System.out.println(H2);
        
        //adiciona pessoas no H1
        H1.adicionaPessoa();
        H1.adicionaPessoa();
        H1.adicionaPessoa();
        H1.adicionaPessoa();
        H1.adicionaPessoa();
        H1.adicionaPessoa();

        //adiciona pessoas no H2
        H2.adicionaPessoa();
        H2.adicionaPessoa();
        H2.adicionaPessoa();
        H2.adicionaPessoa();
        H2.adicionaPessoa();
        H2.adicionaPessoa();

        //liga os helicópteros
        H1.ligaHelicoptero();
        H2.ligaHelicoptero();

        //Decola heli
        H1.helicopteroDecola(450);
        H2.helicopteroDecola(500);
        
        //estado heli
        System.out.println(H1);
        System.out.println(H2);
        
        //Aterrissar Heli
        H1.helicopteroAterrissar(450);
        H2.helicopteroAterrissar(500);
        
        //desligar Heli
        H1.helicopteroDesliga();
        H2.helicopteroDesliga();

        //remove pessoas
        H1.removePessoa();
        H1.removePessoa();
        H1.removePessoa();
        H1.removePessoa();
        H1.removePessoa();
        H2.removePessoa();
        H2.removePessoa();
        H2.removePessoa();
        H2.removePessoa();
        H2.removePessoa();
        H2.removePessoa();

        //estado atual
        System.out.println(H1);
        System.out.println(H2);



    }
}