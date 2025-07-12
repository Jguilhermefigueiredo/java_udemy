public class OperadoresUnarios {
    public static void main(String[] args) {
/*
 * Os operadores unários são usados para operar em um único operando:
Incremento (++)
Decremento (--)
Positivo (+)
Negativo (-)
Negação lógica (!)

Exemplo:
int a = 10;
a++; // Equivalente a a = a + 1;
System.out.println(a); // Saída: 11

int a = 5;
// Pré-incremento int b = ++a; // Agora, a é 6 e b também é 6
// Pós-incremento int c = a++; // Agora, a é 7, mas c é 6 (porque o
valor antigo de a foi usado)

// Pré-decremento int d = --a; // Agora, a é 6 e d também é 6
// Pós-decremento int e = a--; // Agora, a é 5, mas e é 6 (porque o
valor antigo de a foi usado)
 */
        int a = 10;
        int b = 10;

        a++; // equivalente a = a + 1
        b--; // equivalente b = b - 1
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b); 

        int c = 20;
        System.out.println("Valor de c: " + c);
        int d = c--; // d vai receber o valor de c antes de executar a equação c-1  PÓS-INCREMENTO  
        System.out.println("Valor de d: " + d);

        int e = 30;
        System.out.println("Valor de e: " + e);
        int f = ++e; // f vai receeber o valor de e após ser ser realizada a equação e+1 PRÉ-INCREMENTO
        System.out.println("Valor de f: " + f);



    }
    
}
