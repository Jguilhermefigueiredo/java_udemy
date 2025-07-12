public class SwitchCase {
//switch pode ser usado com variáveia primitivas (ex.: int) qto com variáveis mais modernas (ex.: String)
    public static void main(String[] args) {
        
        int day = 9;
            switch (day) {
                //o switch verifica a variável declarada entre parentes e compara com os casos apresentados
                case  1 -> System.out.println("Segunda");
                case  2 -> System.out.println("Terça");
                case  3 -> System.out.println("Quarta");
                case  4 -> System.out.println("Quinta");
                case  5 -> System.out.println("Sexta");
                case  6 -> System.out.println("Sábado");
                case  7 -> System.out.println("Domingo");
                default -> System.out.println("Desconhecido");
            }
    }
}
