public class ExercicioDeprecated extends MinhaClasse{
    public static void main(String[] args) {
        MinhaClasse teste = new MinhaClasse();
        int resultado = teste.calcularSoma(2, 3);
        System.out.println(resultado);
        int resultadoP = teste.calcularProduto(7, 3);
        System.out.println(resultadoP);
        }
}
class MinhaClasse{
    public int a;
    public int b;
    public int soma;
       
    public int calcularSoma(int a , int b){
        return a + b;
       }
    @Deprecated
    public int calcularProduto(int a , int b){
        return a + b;
       }
}
      
    

