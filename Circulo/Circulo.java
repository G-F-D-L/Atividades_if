//classe
public class Circulo {
    private double  raio;

    //construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    //método
    public float calcularArea(){
        return 3.141516f * raio * raio;
    }
    public float calcularPerimetro(){
        return 2 * 3.141516f * raio;
    }
    public void imprimir(){
        System.out.printf(" raio: %.2f\n Area: %.2f\n perimetro: %.2f\n ", raio, calcularArea(), calcularPerimetro());
    }

}
