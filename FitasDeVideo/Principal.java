package Atividades_if.FitasDeVideo;

public class Principal {
    public static void main(String[] args) {
        // Criação de fitas de vídeo
        FitasDeVideo fita1 = new FitasDeVideo("Star Wars: Guerra dos Clones", 5.0);
        FitasDeVideo fita2 = new FitasDeVideo("MIB: Homens de Preto", 3.5);
        FitasDeVideo fita3 = new FitasDeVideo("Senhor dos anéis: O Retorno do Rei", 7.0);

         // Mostrando os dados das fitas
         System.out.println("Dados das fitas:");
         System.out.println(fita1);
         System.out.println(fita2);
         System.out.println(fita3);
        
      // Calculando e mostrando o valor do aluguel para diferentes períodos
      System.out.println("\nValores de aluguel:");
      System.out.println(fita1.getTitulo() + " por 3 dias: R$" + fita1.getValorAluguel(3));
      System.out.println(fita2.getTitulo() + " por 5 dias: R$" + fita2.getValorAluguel(5));
      System.out.println(fita3.getTitulo() + " por 7 dias: R$" + fita3.getValorAluguel(7));
    }
}
