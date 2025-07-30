public class ExercicioWarning extends ExemploDepreciado{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado depre = new ExemploDepreciado();
        System.out.println(depre.metodoObsoleto());
        
    }

}
class ExemploDepreciado{
    @Deprecated
    public String metodoObsoleto(){
       return "Método obsoleto.";
    
    }
}
