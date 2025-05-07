package Calendario;
public class Calendario {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // Método para retornar o nome do mês
    public String nomeMes(int m) {
        switch (m) {
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            default: return "mês inválido";
        }
    }

    // Método para mostrar a data formatada
    public void mostrarData() {
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }

    // Método para verificar ano bissexto
    public void anoBissexto(){
        if(ano % 4 == 0){
            System.out.println(ano + " é ano bissexto.");
        }
        else{
            System.out.println(ano + " não é ano bissexto.");
        }
    }
}
