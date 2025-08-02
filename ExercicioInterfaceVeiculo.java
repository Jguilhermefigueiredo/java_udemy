public class ExercicioInterfaceVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        //carro.iniciar();

        System.out.print("Neste momento:  "); carro.iniciar();
        System.out.print("Neste momento:  "); caminhao.iniciar();
        System.out.print("Neste momento:  "); carro.parar();
        System.out.print("Neste momento:  "); caminhao.parar();
        System.out.print("O carro está:  "); carro.buzinar();
        System.out.print("O caminhão está:  "); caminhao.buzinar();

    }
    
}

interface Veiculo{
    public abstract void iniciar();
    public abstract void parar();
    default void buzinar(){
        System.out.println("Buzinando.");
    }

}
class Carro implements Veiculo{
    @Override
    public void iniciar(){
        System.out.println("O carro liga. ");
    }
    @Override
    public void parar(){
        System.out.println("O carro para. ");
    }
}
class Caminhao implements Veiculo{
    @Override
    public void iniciar(){
        System.out.println("O caminhão liga. ");
    }
    @Override
    public void parar(){
        System.out.println("O caminhão para. ");
    }
}


