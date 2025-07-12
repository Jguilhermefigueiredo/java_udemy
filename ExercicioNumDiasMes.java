public class ExercicioNumDiasMes {
    
    public static void main(String[]args) {
        String mes = "Jul";

        String numDiasMes = switch (mes){

            case "Jan" , "Mar" , "Mai", "Jul", "Ago", "Out", "Dez" -> "31";
            case "Abr", "Jun" , "Set", "Nov" -> "30";
            case "Fev" -> "28";
            default -> "Mês desconhecido";
        };

            System.out.println(numDiasMes + mes);
        
    }


}


