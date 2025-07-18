public class ExercicioloopBreakJava {
    public static void main(String[] args) {

        int codigoDeSaida = 9; // Código que irá encerrar o laço se for encontrado

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

            // Verifica se o código é igual ao código de saída
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Código de saída encontrado: " + codigoCarteirinha + ". Encerrando o processo.");
                break; // Encerra o laço imediatamente
            }

            // Verifica se o código é aceito pelo hospital Santa Clara
            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("Código " + codigoCarteirinha + " aceito pelo hospital Santa Clara.");
                continue; // Pula o restante da iteração e vai para a próxima
            }

            // Mensagem para códigos não aceitos
            System.out.println("Código " + codigoCarteirinha + " NÃO é aceito pelo hospital Santa Clara.");
        }
    }
}
