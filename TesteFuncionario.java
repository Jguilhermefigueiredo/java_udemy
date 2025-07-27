public class TesteFuncionario {
    public static void main (String[]args) {
        Assistente assis = new Assistente ("João", 3000.00);

        System.out.println(assis.nome);
        System.out.println(assis.ganhoAnual());
        assis.addAumento(1000.00);
        System.out.println(assis.ganhoAnual());

    }

}

class Funcionario {
    public String nome;
    public double salario;
   
        public void addAumento(double valor){
        salario += valor;
        System.out.println("Salario com aumento é: " + salario);
        }
        public double ganhoAnual(){
        return (salario*12);
        }
}

class Assistente extends Funcionario{
    public Assistente (String nome, double salario){
            this.nome = nome;
            this.salario = salario;
    
    
    public ganhoAnual(){
    return salario *12 + 1000.00;
    }
    }
}

