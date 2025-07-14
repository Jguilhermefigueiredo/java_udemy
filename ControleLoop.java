public class ControleLoop {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5; i++) {
            if (i==5) {
                break; //para o loop quando a variável é igual o valor
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++ ){;
            if (j==5){
                continue; // pula a interação j é igual a 5
            }
            
            System.out.print(j);
        }

    }

}
