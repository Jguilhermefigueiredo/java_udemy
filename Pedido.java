public class Pedido implements PedidoRestaurnte {
    String item;
    double preco;

    public Pedido(){

    }
    public Pedido (double preco){
        this.preco = preco;
    }
    public Pedido(String item, double preco){
       this.item = item;
       this.preco = preco;
    }
    public void adicionarItem(){
        System.out.println("Item e valor do cardápio: " + item + " " + preco);
    }
    public double getPreco(){
        return preco;
    }
    public static double calcularTotal(Pedido p1Pedido, Pedido p2Pedido){
        return p1Pedido.getPreco() + p2Pedido.getPreco();
        
        }

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Hamburger", 2.50);
        Pedido pedido1 = new Pedido("Batata", 1.50);
        Pedido pedido2 = new Pedido("Refrigerante", 2.00);
        pedido.adicionarItem();
        pedido1.adicionarItem();
        pedido2.adicionarItem();
        pedido.getPreco();
        pedido2.getPreco();

        double soma = calcularTotal(pedido, pedido2);
        
        System.out.println("Valor final do pedido é : " + soma);
        
        


    }


}
interface PedidoRestaurnte {
    void adicionarItem();
    //double calcularTotal(); <-como resolver isso?

}
