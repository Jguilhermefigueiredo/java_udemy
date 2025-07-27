import exercicio.getset.Pessoa;

public class AplicacaoPessoa {
    public static void main(String[] args) {
        
    
    Pessoa p1 = new Pessoa("Natália" , 34 , "Rua Fulano", 99999999);
    System.out.println(p1.getInfo());

    p1.setNome("José");
    p1.setIdade(39);

    System.out.println("----------------------");
    System.out.println(p1.getNome());
    System.out.println(p1.getIdade());
    }
}
