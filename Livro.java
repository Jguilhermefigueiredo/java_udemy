package editora.biblioteca;

public class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    public Livro(){
    }
    
    public Livro (String tituloInit, String autorInit){
        titulo = tituloInit;
        autor = autorInit;
    }

    public Livro (String tituloInit, String autorInit, int anoNovo, double precoInit){
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = anoNovo;
        preco = precoInit;    
    }

    public String obterLivro() {
        return "Título: " + titulo + "Autor: " + autor + anoPublicacao + preco;
    }


}
