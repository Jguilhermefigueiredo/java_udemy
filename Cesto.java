public class Cesto<T>{
    private T  conteudo;

    public  void guardar (T animal){
        this.conteudo = animal;

    }
    public T pegar (){
        return conteudo;
    }
    public static void main(String[] args) {
        Cesto <Peixe> cestoPeixes = new Cesto<>();
        cestoPeixes.guardar(new Peixe("Lambari", 2.5));
        Cesto<Polvo> cestoPolvo = new Cesto<>();
        cestoPolvo.guardar(new Polvo("Polvinho", 8));

        Peixe peixinho = cestoPeixes.pegar();
        Polvo polvinho = cestoPolvo.pegar();

        System.out.println(peixinho.toString());
        System.out.println(polvinho.toString());

    }

}
class Peixe {
    String nome;
    double tamanho;
    public Peixe(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }
    @Override
    public String toString() {
    return "Peixe: Nome: " + this.nome + ", tamanho: " + this.tamanho;
}
 
}
class Polvo{
    String nome;
    int tentaculo;
    public Polvo (String nome, int tentaculo){
        this.nome = nome;
        this.tentaculo = tentaculo;

    }
    @Override
    public String toString() {
    return "Polvo: Nome: " + this.nome + ", tentáculos: " + this.tentaculo;
}

}