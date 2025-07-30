
import java.lang.classfile.Superclass;

public class Escola {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.getAluno();
        aluno.setMat();
        System.out.println(aluno.getAluno());
        System.out.println(aluno.getMat());
    }
}
class Pessoa{
    public String nome;
    public int idade;
    
    public Pessoa(String nome, int idade){
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public String getAluno(){
        return "NOME: " + nome + "IDADE:" + idade;
    }
}
class Estudante extends Pessoa{
    public int matricula;

    @Override
    public String getAluno() {
        return super.getAluno();
    }
    
    Pessoa novoAluno = new Pessoa("José", 39);
    public void Estudante(int matricula) {
    }
    public void setMat(){
        this.matricula = matricula;
    }
    public int getMat(){
        return matricula;
    }
}
    

