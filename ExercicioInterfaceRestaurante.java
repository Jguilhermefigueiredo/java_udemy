public class ExercicioInterfaceRestaurante extends Pedido{
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Hamburger", 2.50);
        pedido.adicionarItem("Hamburger", 2.50);
        Pedido pedido2 =new Pedido("Batata", 1.50);
        pedido2.adicionarItem("Batata", 1.50);
        Pedido pedido3 = new Pedido("Refrigerante", 1.00);
        pedido3.adicionarItem("Refrigerante", 1.00);
        
        System.out.println("O cardápio do dia é: ");
        System.out.print (pedido.item);   System.out.println(" " + pedido.preco); 
        System.out.print (pedido2.item);  System.out.println(" " + pedido2.preco);
        System.out.print (pedido3.item);  System.out.println(" " + pedido3.preco);
        //System.out.println(pedido); aqui retorna o objeto da classe e o endereço do container
        //System.out.println(pedido2);aqui retorna o objeto da classe e o endereço do container
        //System.out.println(pedido3);aqui retorna o objeto da classe e o endereço do container

        System.out.print("Pedido feito: "); System.out.print(pedido.item); System.out.println(" " + pedido.preco); 
        System.out.print("--------------"); System.out.print(pedido3.item); System.out.println(" " + pedido3.preco);
        double setPreco1 = pedido.preco;
        double setPreco2 = pedido3.preco;
        System.out.println("Valor dos pedidos " + setPreco1 + " " + setPreco2);
        //System.out.println(setPreco1); só exibe o valor adicionado
        //System.out.println(setPreco2); só exibe o valor adicionado

        public double calcularTotal(){ //erro por só aceitar valor FINAL
        return resultado = (setPreco1 + setPreco2);
        System.out.println("Valor total do pedido é: " + resultado);
        }
        
    }
    
}

interface Restaurante {
    public abstract String adicionarItem();
    public abstract double calcularTotal();    
}

class Pedido implements Restaurante{
    String item;
    double preco;
    double total;
    public Pedido(){

    }
    public Pedido(String item){
        this.item = item;
    }
    public Pedido(double preco){
        this.preco = preco;
    }
    public Pedido(String item, double preco){
        this.item = item;
        this.preco = preco;
    }
    public String adicionarItem(String item, double preco){
        this.item =  item;
        this.preco = preco;
        return item + preco;
    }
    public double calcularTotal(double preco, double preco1){
        this.preco = preco;
        this.preco = preco1;
        return preco + preco1;

    }

}

