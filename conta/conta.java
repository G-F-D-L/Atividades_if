package conta;

public class conta {
    private int numero;
    private String titular;
    private double saldo;
    private boolean ativa;

    public conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
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
        " Ativa? " + ativa + "\n";
    }
}
