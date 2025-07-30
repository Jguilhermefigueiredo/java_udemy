public class ExercicioOverride {
    public static void main(String[] args) {
        MinhaClasse classe =new MinhaClasse();
        classe.imprime();
    }

}
class SuperClasse{
    
    public void imprime(){
        System.out.println("imprime");
    }
}
class MinhaClasse extends SuperClasse{
    @Override
    public void imprime(){
        System.out.println("imprime diferente");

    }
}