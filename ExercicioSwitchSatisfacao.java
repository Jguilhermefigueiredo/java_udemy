public class ExercicioSwitchSatisfacao {
    //este exercício é criar um programa em Java que, com base em um número 
    //fornecido pelo usuário (representando o nível de satisfação), determine e exiba o feedback correspondente.
    public static void main(String[] args) {
        
        int nivel = 5;
        String feedback = switch (nivel) {

            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito Satisfeito";
            default -> "Opção inválida";
         };
        System.out.println(feedback);

    }
}