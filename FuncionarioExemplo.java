public class FuncionarioExemplo {

            String nome;//string é uma classe dentro de java
            String cargo;
            int idade;

    public static void main(String[] args) {
        
        FuncionarioExemplo funcionario1 = new FuncionarioExemplo();

        funcionario1.nome = "José";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.idade = 39;

        FuncionarioExemplo funcionario2 = new FuncionarioExemplo();

        funcionario2.nome = "Natália";
        funcionario2.cargo = "Arquiteta";
        funcionario2.idade = 34;

        System.out.println("Nome :" + funcionario1.nome);
        System.out.println("Cargo :" + funcionario1.cargo);
        System.out.println ("Idade: " + funcionario1.idade);

        System.out.println("Nome :" + funcionario2.nome);
        System.out.println("Cargo :" + funcionario2.cargo);
        System.out.println ("Idade: " + funcionario2.idade);
    }
}
