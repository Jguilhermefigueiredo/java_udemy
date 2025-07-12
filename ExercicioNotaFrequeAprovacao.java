public class ExercicioNotaFrequeAprovacao {
    public static void main(String[] args) {
        int nota1 = 3;
        int nota2 = 3;
        int nota3 = ((nota1 + nota2)/2);
        String resultado = (nota3 >= 6) ? "Aprovado por nota" : "Reprovado por nota";

        System.out.print("O Aluno foi: " + resultado);

        int frequencia = 80;
        if (frequencia >= 75) {
            System.out.println(" e aprovado por frequência.");
        }
            else {
                System.out.println(" e reprovado por frequência.");   
            };
        
        }
    }


