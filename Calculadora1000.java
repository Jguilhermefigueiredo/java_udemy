public class Calculadora1000 {
    
    public static void main(String[] args) {
        int minhaCalc[];
        int soma = 0;
        minhaCalc = new int[1000];
            for (int i = 0; i <= minhaCalc.length; i++) {
                soma += i;
            }
            
            
           System.out.println("A soma dos números inteiros é: " + soma);
      
        }
        
    }


