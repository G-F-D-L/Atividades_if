package atividade_conta;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public Conta(int numero, String titular, double saldo, boolean ativa) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public void depositar(double   dinheiro){
        if (dinheiro <= saldo && ativa == true){
            saldo = saldo + dinheiro;
        }
    }

    public void sacar(double   dinheiro){
        if (dinheiro <= saldo && ativa == true){
            saldo = saldo - dinheiro;
        }
    }

    public void desativar(){
        if (ativa == true){
            ativa = false;
        }
    }

    public void ativar(){
        if (ativa == false){
            ativa = true;
        }
    }

    //getters e setters
    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean getAtiva(){
        return ativa;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    //exibir
    public void exibir(){
        System.out.println("conta de número: " + numero + 
        " Titular: " + titular +
        " Saldo: " + saldo +
        " Ativa? " + ativa );
    }

    public String toString(){
        return "conta de número: " + numero + 
        " Titular: " + titular +
        " Saldo: " + saldo +
        " Ativa? " + ativa ;
    }
}