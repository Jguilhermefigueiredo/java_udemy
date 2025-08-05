public class ProdutoImpl implements IProduto {
    private String nome;
    private int quantidade;
    int novaQuantidade;

    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        // this.quantidade = this.quantidade + quantidade;
        this.quantidade += quantidade;
        System.out.println("Nova quantidade: " + this.quantidade);
    }

    public void removerQuantidade(int quantidade) {
        // this.quantidade = this.quantidade - quantidade;
        if (quantidade > this.quantidade) {
            System.err.println("Quantidade insuficiente. ");
        

        } else {
            this.quantidade -= quantidade;
            System.out.println("Nova quantidade: " + this.quantidade);

        }
    }

    public static void main(String[] args) {
        ProdutoImpl produtoObj = new ProdutoImpl("Borracha", 100);
        System.out.println("Produtos: " + produtoObj.nome);
        System.out.println("Quantidades: " + produtoObj.quantidade);

        produtoObj.adicionarQuantidade(30);
        produtoObj.removerQuantidade(70);
        produtoObj.removerQuantidade(100);
        System.out.println("quantidade atual: " + produtoObj.getQuantidade());

    }

}

interface IProduto {
    String getNome();

    int getQuantidade();

    void adicionarQuantidade(int quantidade);

    void removerQuantidade(int quantidade);
}


