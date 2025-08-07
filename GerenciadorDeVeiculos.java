
public class GerenciadorDeVeiculos {

    public static void main(String[] args) {
        Onibus onibusObj = new Onibus("obj-0001", 1986, 52);
        Caminhao caminhaoObj = new Caminhao("obj-0002", 1988, 8);
        System.out.print("O ônibus tem como informações: " + onibusObj.exibirInformacoes());
        System.out.println(" e " + onibusObj.obterInfOnibus() + " assentos.");
        System.out.print("O caminhão tem como informações: " + caminhaoObj.exibirInformacoes());
        System.out.println(" e " + caminhaoObj.obterInfCaminhao() + " eixos.");

    }

}

abstract class Veiculo {

    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String exibirInformacoes() {
        return placa + " " + ano;
    }

}

class Onibus extends Veiculo {

    private int assentos;

    public Onibus(String placa, int ano) {
        super(placa, ano);

    }

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int obterInfOnibus() {
        return assentos;

    }
}

class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, int ano) {
        super(placa, ano);

    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int obterInfCaminhao() {
        return eixos;
    }
}
