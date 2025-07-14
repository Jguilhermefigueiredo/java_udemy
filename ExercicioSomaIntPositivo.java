public class ExercicioSomaIntPositivo {
    public static void main(String[] args) {
        
        int numero = 10; //ponto de partida                             //10  9  8  7  6  5  4  3  2  1
        int numeroOriginal = numero;//acumudaor da soma feita           //10  9  8  7  6  5  4  3  2  1
        int soma = 0;                                                   //0  10 19 27 34 40 45 49 52 54 51
            do { soma += numero;
                 numero--;

                 
                
            } while (numero >= 0);

            System.out.println(soma);      
    }

}
/*
 * Este programa tem como objetivo calcular a soma de todos os números inteiros
 * positivos menores ou iguais a um número definido pelo programador. Para isso,
 * foi utilizado o laço de repetição do-while, que garante que o bloco de instruções
 * seja executado pelo menos uma vez, mesmo que a condição seja falsa na primeira verificação.
 *
 * O funcionamento do programa é simples e pode ser dividido em etapas claras:
 * Primeiramente, é declarada uma variável que armazena o número inicial a partir
 * do qual a soma será feita. Em seguida, outra variável é utilizada para guardar
 * o valor original desse número, já que dentro do laço de repetição a variável principal
 * será decrementada a cada iteração até chegar a zero.
 *
 * Para acumular o resultado parcial da soma, é criada uma terceira variável que inicia
 * com valor zero e recebe, em cada repetição, o valor atual do número a ser somado.
 * Assim, o laço do-while adiciona o número atual ao total, diminui o valor do número
 * em uma unidade, e repete o processo enquanto ainda existirem números inteiros positivos
 * a serem somados.
 *
 * Por fim, ao término das iterações, o programa exibe o resultado final, mostrando ao usuário
 * a soma de todos os números inteiros positivos até o número inicial definido. Dessa forma,
 * o código demonstra de forma prática o uso de variáveis de controle, de um acumulador e
 * de um laço de repetição do-while para resolver um problema simples de cálculo incremental.
 */