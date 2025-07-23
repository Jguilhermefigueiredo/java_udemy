package empresa.dados; //local, pasta onde serão salvos os dados

public class AulaPacotesJava { //construtor que será usado dentro do pacote e será importado por qquer outro programa necessário
    String nome;
    double salario;

    public AulaPacotesJava(String nomeIniti, double salarioIOnit){
        nome = nomeIniti;
        salario = salarioIOnit;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

}
