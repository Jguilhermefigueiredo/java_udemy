public class Construtor {

            String nome;//string é uma classe dentro de java
            String cargo;
            int idade;
            //sequência a seguir é o construtor, onde declaramos dee maneira mais consisa nosso código
            Construtor(String nomeInit, String cargoInit, int idadeInit){
                nome = nomeInit;
                cargo = cargoInit;
                idade = idadeInit;
            }

    public static void main(String[] args) {
        
        Construtor funcionario1 = new Construtor("José" , "Desenvolvedor" , 39);

        Construtor funcionario2 = new Construtor("Natália" , "Arquuiteta" , 34);


        System.out.println("Nome :" + funcionario1.nome);
        System.out.println("Cargo :" + funcionario1.cargo);
        System.out.println ("Idade: " + funcionario1.idade);
        System.out.println("--------------------------");
        System.out.println("Nome :" + funcionario2.nome);
        System.out.println("Cargo :" + funcionario2.cargo);
        System.out.println ("Idade: " + funcionario2.idade);
    }
}


