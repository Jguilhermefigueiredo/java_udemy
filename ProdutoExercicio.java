package produto.exercicio;

public class ProdutoExercicio {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

        public ProdutoExercicio(String nomeInit, double precoInit, int qtInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = qtInit;
        }
        public String obterInfoString() {
            return "Nome: " + nome + ", Preço: " + preco + "Estoque: " + quantidadeEmEstoque;
        }
        

    }

