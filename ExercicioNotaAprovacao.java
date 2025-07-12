public class ExercicioNotaAprovacao {

    public static void main(String[] args) {
        int nota1 = 3;
        int nota2 = 3;
        int nota3 = ((nota1 + nota2)/2);
        String resultado = (nota3 >= 6) ? "Aprovado" : "Reprovado";

        System.out.println("O Aluno foi: " + resultado);
    }
       
}
