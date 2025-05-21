package Professor;

public class Professor {
    private int matricula;
    private String nomeProf;
    private String nomeDep;

    //construtor
    public Professor(int matricula, String nomeprof, String nomedep){
        this.matricula = matricula;
        this.nomeProf = nomeprof;
        this.nomeDep = nomedep;
    }

    //getters
    public int getMatricula(){
        return matricula;
    }
    public String getNomeProf(){
        return nomeProf;
    }
    public String getNomeDep(){
        return nomeDep;
    }
    //setters
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }
    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    //método
    public void imprimir(){
        System.out.println(" Professor: " + nomeProf + "\n Matrícula: " + matricula + "\n Departamento: " + nomeDep);
    }
}
