public class ExercicioSomaIntPositivo {
    public static void main(String[] args) {
        
        int numero = 10; //ponto de partida                             //10  9  8  7  6  5  4  3  2  1
                
        int soma = 0;                                                   //0  10 19 27 34 40 45 49 52 54 51
            do { soma += numero;
                 numero--;

                 
                
            } while (numero >= 0);

            System.out.println(soma);      
    }

}
