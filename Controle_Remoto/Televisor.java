public class Televisor {

    private double Canal;
    private boolean Ligado;
    private int Volume;

    public Televisor(double Canal, boolean Ligado, int Volume){
        this.Canal = Canal;
        this.Ligado = Ligado;
        this.Volume = Volume;
    }

    public void Ligar(){
        if (Ligado == false){
            Ligado = true;
        }
    }

    public void Desligar(){
        if (Ligado == true){
            Ligado = false;
        }
    }

    public void aumentarVolume(int qtd){
        if (Volume >= 0 && Ligado == true){
            Volume = Volume + qtd;
            if(Volume > 100){
                Volume = 100;
            }
        }
    }

    public void diminuirVolume(int qtd){
        if (Volume >= 0 && Ligado == true){
            Volume = Volume - qtd;
            if(Volume < 0){
                Volume = 0;
                
            }
        }
    }

    public void trocarCanal(double escolheCanal){
        if (Ligado == true){
            Canal = escolheCanal;
        }
    }

    public double getCanal() {
        return Canal;
    }
    public void setCanal(double canal) {
        Canal = canal;
    }

    public boolean getLigado() {
        return Ligado;
    }
    public void setLigado(boolean ligado) {
        Ligado = ligado;
    }

    public int getVolume() {
        return Volume;
    }
    public void setVolume(int volume) {
        Volume = volume;
    }
    
    public String toString(){ //retorna as informações do objeto como texto(string)
        return "A tv está ligada? " + Ligado +
        "\n Volume atual: " + Volume +
        "\n no canal: " + Canal;
    }
}