package Calendario;
public class PrincipalCalendario {
    public static void main(String[] args) {
        // Criando dois objetos Calendario
        Calendario d1 = new Calendario(19, 1, 2006);
        Calendario d2 = new Calendario(23, 2, 2025);

        d1.mostrarData();
        d1.anoBissexto();

        d2.mostrarData();
        d2.anoBissexto();
    }
}