//classe
public class FitasDeVideo {
    //atributos
    private String titulo;
    private double precoAluguel;

    //construtor
    public FitasDeVideo(String título, double precoAluguel) {
        this.titulo = titulo;
        this.precoAluguel = precoAluguel;
    }

    //método
    public String getTitulo(){
        return titulo;
    }

    public double getprecoAluguel(){
        return precoAluguel;
    }

    public double getValorAluguel(double numeroDeDiasAlugada) {
        return precoAluguel * numeroDeDiasAlugada;
    }

    //toString
    public String toString() {
        return "Título: " + titulo + ", Preço do aluguel por dia: " + precoAluguel;
    }

}