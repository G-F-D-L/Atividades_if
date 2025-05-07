//classe
public class Circulo {
    private double  raio;

    //construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    //método
    public double calcularArea(){
        return 3.141516f * raio * raio;
    }
    public double calcularPerimetro(){
        return 2 * 3.141516f * raio;
    }
    public void imprimir(){
        System.out.printf(" raio: %d\n Area: %d\n perimetro: %d\n ", raio, calcularArea(), calcularPerimetro());
    }

}