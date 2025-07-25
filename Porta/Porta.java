package porta;

public class Porta {
    private String cor;
    private double altura;
    private double largura;
    private boolean estaAberta;

    public Porta(String cor, double altura, double largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor(){
        return cor;
    }
    public double getAltura(){
        return altura;
    }
    public double getLargura(){
        return largura;
    }
    public boolean getEstaAberta(){
        return estaAberta;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public void setEstaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }

    //toString
    public String toString(){
        return " Porta de cor: " + cor + ";\n com altura de: " + altura + ";\n largura: " + largura + ";\n está aberta?: " + estaAberta;
    }
}
