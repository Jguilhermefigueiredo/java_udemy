class Veiculo{
    public void acelerar(){
        System.out.println("Veículo acelerando!");
    }
}
class Carro extends Veiculo{
    public void acelerar(){
        super.acelerar();
        System.out.println ("Veículo não acelera...");
    }
}

public class TesteCarro2 {
    public static void main (String[] args){
        Carro car = new Carro();
        car.acelerar();
    }    
}
