import java.util.*;

public class SetExercise {
    public static void main(String[] args){
        Set<Integer> numeros =new HashSet<>();
        numeros.add(2);
        numeros.add(7854);
        numeros.add(56);
        numeros.add(9);
        numeros.add(3);
        System.out.println("Contem o número 7854? " + numeros.contains(7854));
        System.out.println("Números do conjunto: " + numeros);

        numeros.remove(56);
        System.out.println("Números atualizados: " + numeros);

        boolean novoNumero = numeros.add(12);
        System.out.println("O número 12 foi adicionado no conjunto? " + novoNumero);

        System.out.println("Novos números: " + numeros);

        numeros.clear();
        System.out.println("E por fim: " + numeros);
    }

}
