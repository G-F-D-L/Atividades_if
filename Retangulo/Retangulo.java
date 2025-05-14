public class Retangulo{
    //atributos
    private int comprimento;
    private int largura;

    //construtor
    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    //métodos
    public int calcularArea(){
        return comprimento * largura;
    }
    public int calcularPerimetro(){
        return (comprimento * 2) + (largura * 2);
    }
    public void imprimir(){
        System.out.printf(" comprimento: %d\n largura: %d\n area: %d\n perimetro: %d\n", comprimento, largura, calcularArea(), calcularPerimetro());
    }
}
