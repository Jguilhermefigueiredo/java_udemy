public class ExercicioFinalMetodo {
    int a;
    int b;
    int soma;

    final int somar(int a, int b){
        return soma = a + b;
    }

}
class CalcutaldoraCientifica extends ExercicioFinalMetodo{
    final int somar (int a, int b){
        return soma = a + b;
    }
}
//ao compilar gera o erro, pois não pode se sobre escrever um métoo final.