
import java.util.*;
import java.util.Arrays;

public class LambdaNomes {
    public static void main(String[] args) {
        List<String> nomesObj = new ArrayList<>(
                Arrays.asList(new String[] { "José", "João", "Maria", "Natália", "Alberto", "Regina" }));
        nomesObj.removeIf(s -> s.length() < 5);
        System.out.println(nomesObj);
        System.out.println("-------------------------------------------------");
        System.out.println("Adicionando um nome a primeira posição da lista.");
        System.out.println("-------------------------------------------------");

        nomesObj.add(0, "Márcia");
        nomesObj.forEach(nome -> System.out.print(nome + " "));

    }
}
//troquei a verificação do tamanho da string de maior para menor -- não é erro.

/*O objetivo deste exercício é praticar o uso de expressões lambda em Java para manipular listas.

Passos para fazer o exercício
Criação da Lista:

Objetivo: Inicializar uma lista de strings e adicionar elementos a ela.

Instruções:

Use apenas o método main (se quiser pode criar mais métodos).

Crie uma instância de ArrayList do tipo String.

Utilize o método add para adicionar strings à lista.

List<String> minhaLista = new ArrayList<>();
minhaLista.add("maça");
minhaLista.add("banana");
minhaLista.add("cereja");
minhaLista.add("abacaxi");
Explicação: Aqui, estamos criando uma lista chamada minhaLista e adicionando quatro frutas a ela.

Remoção de Elementos:

Objetivo: Remover strings da lista que tenham mais de 5 caracteres.

Instruções:

Utilize o método removeIf com uma expressão lambda que verifica o comprimento das strings.

Código:

minhaLista.removeIf(s -> s.length() > 5);
Explicação: A expressão lambda s -> s.length() > 5 verifica se o comprimento da string s é maior que 5. Se for, a string é removida da lista.

Adição de Elemento:

Objetivo: Adicionar uma nova string no início da lista.

Instruções:

Utilize o método add com o índice 0 para inserir a string na primeira posição.

Código:

minhaLista.add(0, "uva");
Explicação: A string "grape" é adicionada na posição 0 da lista, ou seja, no início da lista.

Impressão da Lista:

Objetivo: Iterar sobre a lista e imprimir cada elemento.

Instruções:

Utilize o método forEach com uma referência ao método println de System.out.

Código:

minhaLista.forEach(System.out::println);
Explicação: O método forEach itera sobre cada elemento da lista e imprime cada um deles no console. */
