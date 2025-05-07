//classe
public class Quadrado {
    private int lado;

    //construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

    public int calcularPerimetro(){
        return 4 * lado;
    }

    public void imprimir(){
        System.out.printf(" lado %d;\n area %d;\n perimetro %d;\n", lado, calcularArea(), calcularPerimetro());
    }

}