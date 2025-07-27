class Funcionario {
    private String nome;
    private double salario;

    public void addAumento(){
        salario = (salario + 500.00);

    }
    Public void ganhoAnual(){
        salario = (salario*12);

    }
}

class Assistente extends Funcionario{
    public String Assistente (String nome, int salario){
        this.nome = nome;
        this.salario = salario;
}
    super.ganhoAnual;
    ganhoAnual += 1000;
}

public class TesteHeranca {
    public static void main (String[]args) {
        Assistente assis = new Assistente ("João", 3000);
        System.out.println(assis.Assistente);
        System.out.println(assis.addAumento);
        System.out.println(assis.ganhoAnual);

    }

}
