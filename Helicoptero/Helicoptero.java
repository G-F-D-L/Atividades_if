public class Helicoptero{
    private int capacidade;
    private boolean ligado;
    private int pessoas;
    private double altitude;

    //construtor
    public Helicoptero( int capacidade){
        this.capacidade = capacidade;
    }
    //adicionar pessoas
    public void adicionaPessoa(){
        if (pessoas < capacidade){
            pessoas = pessoas + 1;
        }
        else{
            System.out.println("Não é possível adicionar mais pessoas");
        }
    }
    //remover pessoas
    public void removePessoa(){
        if (pessoas >= 1){
            pessoas = pessoas - 1;
        }
    }
    //liga helicóptero
    public void ligaHelicoptero(){
        if (ligado == false){
            ligado = true;
        }
    }
    //decola helicóptero
    public void helicopteroDecola(double altura){
        if (altitude <= 0 && ligado == true){
            altitude = altitude + altura;
        }
    }
    //aterrissar helicóptero
    public void helicopteroAterrissar(double altura){
        if (altitude >= 1){
            altitude = altitude - altura;
        }
    }
    //desligar o helicóptero
    public void helicopteroDesliga(){
        if (altitude <= 0 && ligado == true){
            ligado = false;
        }
    }
    //getters
    public int getCapacidade(){
        return capacidade;
    }
    public boolean getLigado(){
        return ligado;
    }
    public int getPessoas(){
        return pessoas;
    }
    public double getAltitude(){
        return altitude;
    }
    //setters
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }
    public void setAltitude(double altitude){
        this.altitude = altitude;
    }
    //toString
    public String toString(){
        return " ------------Capacidade do helicóptero é: " + capacidade + ";\n Está ligado? " + ligado + ";\n Existem " + pessoas + " pessoas no helicóptero;" + "\n Atualmente a " + altitude + " metros de altura";
    }
}
