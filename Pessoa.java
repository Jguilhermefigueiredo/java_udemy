package exercicio.getset;


public class Pessoa {
    public String nome;
    private int idade;
    protected String endereço;
    int telefone;
    
    Pessoa(){
    }

    public Pessoa (String nomeInit, int idadeInit, String endInit, int telInit) {
        nome = nomeInit;
        idade = idadeInit;
        endereço = endInit;
        telefone = telInit;
    }

    public void setIdade (int idade) { //para "setar" alguma objeto
        this.idade = idade;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() { //deve-se ter um método para puxar o set
        return idade;
    }
    public String getInfo() {
        return "NOME: " + nome + " IDADE: " + idade + " ENDEREÇO: " + endereço + " TELEFONE: " + telefone;
    }

}
