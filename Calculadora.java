public class Calculadora {

    public static void main(String[] args) {
        Operacao somaObj = new Soma(2.0, 3.0);
        Operacao subObj = new Subtracao(2.5, 3.5);
        Operacao divisaoObj = new Divisao(0, 3.5);
        Operacao multiObj = new Multiplicacao(2.5, 3.5);
        System.out.println("A soma é: " + somaObj.setCalcular());
        System.out.println("A diferenca é: " + subObj.setCalcular());
        System.out.println("A divisão é " + divisaoObj.setCalcular());
        System.out.println("A multiplicação é: " + multiObj.setCalcular());

    }

}

abstract class Operacao {

    double a;
    double b;

    public abstract double setCalcular();// não setar valores, deixar valor vazio

    public Operacao(double a, double b) {//aqui que recebe os valores
        this.a = a;
        this.b = b;
    }
}

class Soma extends Operacao {
    public Soma(double a, double b) {
        super(a, b);

    }

    @Override
    public double setCalcular() {
        return this.a + this.b;

    }

}

class Divisao extends Operacao {

    @Override
    public double setCalcular() {
        if (a == 0) {
            System.out.println("Não é possivel calcular.");

        }
        if (b == 0) {
            System.out.println("Não é possivel calcular.");

        } else {

        }
        return this.a / this.b;

    }

    public Divisao(double a, double b) {
        super(a, b);
    }
}

class Subtracao extends Operacao {

    @Override
    public double setCalcular() {
        return this.a - this.b;

    }

    public Subtracao(double a, double b) {
        super(a, b);
    }
}

class Multiplicacao extends Operacao {

    @Override
    public double setCalcular() {
        return this.a * this.b;

    }

    public Multiplicacao(double a, double b) {
        super(a, b);
    }
}
