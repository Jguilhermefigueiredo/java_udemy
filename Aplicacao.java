import editora.biblioteca.Livro;

public class Aplicacao {
    public static void main(String[] args) {
        
    Livro livro1 = new Livro();
    Livro livro2 = new Livro ("Livro de Java" , "Jose");
    Livro livro3 = new Livro("Java vol.2", "José", 2025, 55.00);
    System.out.println(livro1.obterLivro());
    System.out.println(livro2.obterLivro());
    System.out.println(livro3.obterLivro());

    }


}
