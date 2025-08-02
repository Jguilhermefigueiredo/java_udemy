public class ExercicioFinalVariables {
   final  int NUMERO_MAXIMO = 100;
   final String MENSAGEM = "HELLO WORLD ";
 

   public static void main(String[] args) {
       ExercicioFinalVariables imprimirValoresFinais = new ExercicioFinalVariables();
       int NUMERO_MAXIMO = 50;
       System.out.println("o novo valora da variável será: " + imprimirValoresFinais.NUMERO_MAXIMO);
       String MENSAGEM = "Olá mundo";
       System.out.println("Nova frase será: " + imprimirValoresFinais.MENSAGEM);
   }
}
// o valor que retorna é o definido pela declaração final.
   