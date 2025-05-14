public class PrincipalPessoa {
    public static void main(String args[]) {
        Pessoa p = new Pessoa("João", 18);
        p.falar();

          //toString
        System.out.println(p);
        //não precisa ser p.toString()
    }
}
