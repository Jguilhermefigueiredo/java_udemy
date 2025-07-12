public class OperadorTenario {
    public static void main(String[] args) {
        /*
         * operador tenário é uma forma de escrever o comando "if-else" de uma forma mais consisa
         */
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        //usando '?' e ':' faz-se a verificação da condição (%==0) e entrega o resultado

        System.out.println("O resultado é: " + resultado);

    }

}
