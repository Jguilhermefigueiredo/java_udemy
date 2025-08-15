import java.util.*;
public class ProdutosMap {
    
    public static void main (String[] args){
        Map<String,Integer> produtosQuantObj = new HashMap<>();
        produtosQuantObj.put("Arroz", 20);
        produtosQuantObj.put("Feijão", 20);
        produtosQuantObj.put("Farinha", 10);
        produtosQuantObj.put("Ovos", 100);
        produtosQuantObj.put("Leite", 0);
        produtosQuantObj.put("Café", 1);

        System.out.println("A lista de produtos e suas quantodades é: " + produtosQuantObj);

        produtosQuantObj.computeIfPresent("Arroz", (key, val) -> val + 5);// jeito mais recente, a partir java8+. Só fundiona se apresentar a chave
        produtosQuantObj.computeIfPresent("Feijão", (key, val) -> val - 10);// jeito mais recente, a partir java8+. Só fundiona se apresentar a chave
        
        
        produtosQuantObj.replace("Farinha", 30); // altera diretamente para 30

        int quantidadeAtual = produtosQuantObj.get("Café"); // pega 1
        produtosQuantObj.put("Café", quantidadeAtual + 5);   // agora vale 6

        produtosQuantObj.put("Ovos", 25); // Substitui o valor antigo por 25 - sobreescreve

        System.out.println("A nova lista de produtos e suas quantodades é: " + produtosQuantObj);
    }

}

