public class OperadoresAtribuicao {
    /*
     * atribuição (=)
     * atribuição de adição (+=)
     * atribuição de subtração (-=)
     * atribuição de divisão (/=)
     * atribuição de módulo (%=)
     */
    public static void main(String[] args) {
        int a = 10;
        a += 2; //equivalente a (a = a+2)
        System.out.println(a);// até aqui a resposta seria 12

        a-= 2;
        System.out.println(a); /*ao fazer nova atribuição, a persiste o valor 12 e não a variável declarada, 
                                ou seja a agora vale 10 e não 8 */
    }

}
