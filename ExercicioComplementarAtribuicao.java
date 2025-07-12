public class ExercicioComplementarAtribuicao {
    //exercício para manipular uma variável inteira através de operadores de atribuição

    public static void main(String[] args) {
        
        int numero = 5;

        numero +=3;
        System.out.print("Variável inicial com valor de 5. Acrescido 3. ");
        System.out.println("Valor da variável após a atribuição de soma é: " + numero);

        numero -= 2;
        System.out.print("Variável com valor do resultado anterior e decrescido de 2. ");
        System.out.println("Valor da variável após a atribuição de subtração é: " + numero);

        numero *=4;
        System.out.print("Variável com valor do resultado anterior e multiplicado por 4. ");
        System.out.println("Valor da variável após a atribuição de multiplicação é: " + numero);

        numero /= 2;
        System.out.print("Variável com valor do resultado anterior e dividido por 2. ");
        System.out.println("Valor da final da variável após a atribuição de divisão é: " + numero);
    }

}
