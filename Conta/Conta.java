public class Conta {

    private int n_Conta;
    private String Nome;
    private double Saldo;
    private boolean Ativa;

    public Conta(int n_Conta,String Nome){
        this.n_Conta = n_Conta;
        this.Nome = Nome;
    }

    public int getnConta(){
        return n_Conta;
    }

    public void setnConta(int n_Conta){
    this.n_Conta = n_Conta;
    }   

    public String getNome(){
    return Nome;
    }

    public void setNome(String Nome){
    this.Nome = Nome;
    }

    public double getSaldo(){
    return Saldo;
    }

    public void setSaldo(Double Saldo){
    this.Saldo = Saldo;
    }

    public Boolean getAtiva(){
    return Ativa;
    }

    public void setAtiva(Boolean Ativa){
    this.Ativa = Ativa;
    }

    public void depositar( double valor){
    if ( Ativa == true && valor > 0) {
            Saldo = Saldo + valor;
        }
    }

    public void sacar(double valor){
    if (Ativa == true &&  valor <= Saldo && valor > 0) {
            Saldo = Saldo - valor;
        }
    }

    public void desativar(){
    if (Ativa == true){
        Ativa = false;
        }
    }

    public void ativar(){
    if (Ativa == false){
        Ativa = true;
        }
    }

    public void exibir(){
    System.out.println(toString());
    }

    public String toString(){ //retorna as informações do objeto como texto(string)
    return " Número da conta: " + n_Conta +
    "\n Nome da conta: " + Nome +
    "\n Saldo: " + Saldo +
    "\n Ativa? " + Ativa + "\n ---------------------";
    }   
}