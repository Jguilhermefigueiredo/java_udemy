import java.util.*;

public class ArrayListFilmes {
    public static void main(String[] args) {
        List<String> listaFilmes = new ArrayList<>();
        
        listaFilmes.add("American Pie");
        listaFilmes.add("A ilha do medo");
        listaFilmes.add("Magnólia");

        System.out.println("Os filmes da lista são: " + listaFilmes);

        System.out.println("Nesta lista contém 'O poderoso chefão'?" + listaFilmes.contains("O poderoso chefão"));


    }

}
