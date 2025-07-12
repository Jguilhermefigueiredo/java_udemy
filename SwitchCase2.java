public class SwitchCase2 {
    //switch case inicialization
    public static void main(String[]args) {
        String dia = "Ter";

        String tipoDeDia = switch (dia){

            case "Seg" , "Ter" , "Qua", "Qui", "Sex" -> "Dia útil";
            case "Sab" , "Dom" -> "Fim de semana";
            default -> "Desconhecido";
        };

            System.out.println(tipoDeDia);
        
    }


}
