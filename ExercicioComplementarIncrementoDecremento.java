public class ExercicioComplementarIncrementoDecremento {
    //Praticar o uso dos operadores de incremento (++) e decremento (--) em Java.
    public static void main(String[] args) {
        
        int contador = 5;
        System.out.println("Contador inicial valendo: " + contador);
        
        contador = ++contador;
        System.out.println("Contador agora vale: " + contador);

        contador = --contador;
        System.out.println("Contador final vale:  " + contador);
    }

}
