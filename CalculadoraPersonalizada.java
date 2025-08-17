
public class CalculadoraPersonalizada {
    public static void main(String[] args) {
        OperacaoMatematica calculadoraObj = (a,b) -> Math.pow(a,b);
        System.out.println("A potência entre so dois números: " + calculadoraObj.executar(4.0,5.0));
        OperacaoMatematica calculadora1Obj = (a,b) -> Math.sqrt(a+b);
        System.out.println("A raiz quadrada da soma dos dois números: " + calculadora1Obj.executar(4.0,5.0));
    }

}
@FunctionalInterface
interface OperacaoMatematica{
    public double executar(double a, double b);
}


