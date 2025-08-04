public class ProdutoImpl implements Produto{

    int novaQuantidade;
    public ProdutoImpl(String NOME, int QUANTIDADE){
    }
    public String produtoImpl (String NOME, int QUANTIDADE){
        return NOME + QUANTIDADE;
    }
    public String getString(){
        return NOME;
    }
    public int getInt(){
        return QUANTIDADE;
    }
    public void setQuantidade(int novaQuantidade){
    this.novaQuantidade = novaQuantidade;
    }
    public int getQuantidade(){
        return novaQuantidade;
    }
    public int adicionarQuantidade(){
        return QUANTIDADE + novaQuantidade;
    }
    public int removerQuantidade(){
        return QUANTIDADE - novaQuantidade;
    }
    
    public static void main(String[] args) {
        ProdutoImpl produto = new ProdutoImpl(NOME, QUANTIDADE);
        System.out.println("O produto " + produto.getString());
        System.out.println("Tem a quantidade de:  " + produto.getInt());
        produto.setQuantidade(20);
        System.out.println("Com a chegada do carregamento, a nova quantidade é :" + produto.adicionarQuantidade());

        produto.setQuantidade(30);
        System.out.println("Foram vendidos: " + produto.getQuantidade());
        int novoEstoque = produto.removerQuantidade();
        if (novoEstoque<=0) {
            System.out.println("Acabou o estoque.");
            
        } else {
            System.out.println("A nova quantidade é: " + produto.removerQuantidade());
            
        }
        
    


    }

}
interface Produto{
    public final static String  NOME = "Borracha";
    public final static int QUANTIDADE = 10;
}
