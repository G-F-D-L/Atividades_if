public class controleRemoto{
    public Televisor televisor;

    public controleRemoto(Televisor televisor){
        this.televisor = televisor;
    }

    public void ligar(){
        televisor.Ligar();
    }

    public void desligar(){
        televisor.Desligar();
    }

    public void aumentarVolume(int qtd){
    televisor.aumentarVolume(qtd);
    }

    public void diminuirVolume(int qtd){
        televisor.aumentarVolume(qtd);
    }

    public void trocarCanal(double escolheCanal){
        televisor.trocarCanal(escolheCanal);
    }

    public String toString(){
        return televisor.toString();
    }
}