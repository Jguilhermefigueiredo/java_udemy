package escola.sala;

public class SalaDeAula {

    public static int aluno = 0;

    public SalaDeAula(){
        aluno++;
    }

    public  static String obterInfo() {
        return "Quantidade de alunos são: " + aluno;
    }
    
}
