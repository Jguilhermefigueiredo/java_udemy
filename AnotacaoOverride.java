public class AnotacaoOverride{
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.fazerSom();
    }

}
class Animal{
    public void fazerSom(){
        System.out.println("Animal faz som. ");
    }
}
class Cachorro extends Animal{
    @Override // informa o compilador que esse método sofre override
    public void fazerSom(){
        System.out.println("Cachorro late. ");
    }
}