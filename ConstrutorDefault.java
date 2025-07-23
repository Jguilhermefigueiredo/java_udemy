public class ConstrutorDefault {

            String nome;
            String cargo;
            int idade;
            //com este contrutor, necessáriamente deve-se relacionar valores às variaveis declaradas
            ConstrutorDefault(String nomeInit, String cargoInit, int idadeInit){
                nome = nomeInit;
                cargo = cargoInit;
                idade = idadeInit;
            }
            ConstrutorDefault(){ // quando se cria um construtor vazio (default), pode-se declarar os valores das variáveis
                                // da mesma maneira que se não tivesse-mos um

            },

    public static void main(String[] args) {
        
        // ConstrutorDefault funcionario = new Construtor("José" , "Desenvolvedor" , 39); aqui seria declarado usando o construtor

        ConstrutorDefault funcionario = new ConstrutorDefault(); //aqui ignoramos o contrutor e por termos um default podemos declarar cada valor para as
        funcionario.nome = "José";

        System.out.println("Nome :" + funcionario.nome);
        System.out.println("Cargo :" + funcionario.cargo); //pelo fato de não termos declarado nem cargo e idade nesse exemplo
        System.out.println ("Idade: " + funcionario.idade); //o retorno do print será null para a string e 0 para o valor int
        System.out.println("--------------------------");
}
}
