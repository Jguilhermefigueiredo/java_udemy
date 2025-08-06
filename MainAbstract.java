
public class MainAbstract extends Retangulo {

    public static void main(String[] args) {
        Retangulo retanguloObj = new Retangulo(3, 5);
        System.out.println("O valor da área é : " + retanguloObj.calcularArea());
        System.out.println("O valor do perimetro é : " + retanguloObj.calcularPerimetro());
    }

}

abstract class FiguraGeometrica {

    abstract int calcularArea();
        
    abstract int calcularPerimetro();

}

class Retangulo extends FiguraGeometrica {

    int base;
    int altura;
    public Retangulo(){

    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    int calcularArea() {
        return base * altura;

    }

    @Override
    int calcularPerimetro() {
        return 2 * (base + altura);

    }
}
