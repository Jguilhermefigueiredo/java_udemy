public class ExercicioComplementarPrecedencia {

    //Exercício para praticar o comportamento de precedência de operadores.
    public static void main(String[] args) {
        
        int numero = 5;
        //pré-incremento (++variável)
        System.out.println("Valor inicial: " + numero);
        System.out.println("Novo valor pré-incremento: " + ++numero);

        //pós-incremento (variavel++)
        //o valor da variável se não for novamente declarado, será usado o resultado anterior
        System.out.println("Valor pós-incremento: " + numero++);
        System.out.println("Novo valor: " + numero);

        //pré-decremento (--variável)
        System.out.println("Valor pré-decremento: " + --numero);

        //pós-decremento (--variável)
        System.out.println("Valor pós-decremento: " + numero--);

        //valor final
        System.out.println("Valor final de 'numero' : " + numero);

    }

}


