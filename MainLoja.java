
public class MainLoja {

    public static void main(String[] args) {
        LojaComercial lojaObj = new LojaComercial("Lujinha do Said", 123456789, "Aberto");
        System.out.println("Nome da loja: " + lojaObj.getRazaoSocial());
        System.out.println("Registro: " + lojaObj.getCnpj());
        System.out.println("A loja está: " + lojaObj.getEstadoLoja());
    }

}

abstract class Loja {

    abstract long getCnpj();

    abstract String getRazaoSocial();

    abstract String getEstadoLoja();
}

class LojaComercial extends Loja {

    private String razaoSocial;
    private long cnpj;
    public String estadoLoja;

    public LojaComercial(String razaoSocial, long cnpj, String estadoLoja) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.estadoLoja = estadoLoja;

    }

    @Override
    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public long getCnpj() {
        return cnpj;
    }

    @Override
    public String getEstadoLoja() {
        return estadoLoja;
    }

}
