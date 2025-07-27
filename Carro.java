class Veiculo {
    public String acelerar;
    public void acelerar(){
    System.out.println("Veículo acelerando! ");
    }
}

class Carro extends Veiculo{
   super.acelerar = acelerar;
}
public class TesteCarro
    public static void main (String[] args) {
        TesteCarro car = new TesteCarro ();
        System.out.println(car.acelerar);

    }