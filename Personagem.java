public class Personagem {
    private String nome;
    private int nivelPoder;

    public Personagem(){

    }
    public Personagem(int poderPer){
        nivelPoder = poderPer;
    }
    
    public Personagem(String nomePer){
        nome = nomePer;
    }

    public Personagem (String nomePer, int poderPer) {
        nome = nomePer;
        nivelPoder = poderPer;
    }

    public String getPersonagem(){
        return "Nome: " + nome + "  Nivel de poder: " + nivelPoder;
    }
    
    public void aumentarPoder  (int morePower){ //passagem por valor
        nivelPoder = morePower;
        //morePower += 10;
   
    }
    public String mudancaNome(String novoPer){
         return this.nome = novoPer;

    }
  
        public static void main (String[] args) {

            Personagem p1 = new Personagem("Goku ", 0);
            Personagem p2 = new Personagem("Vegeta",0 );
            System.out.println(p1.getPersonagem());
            System.out.println(p2.getPersonagem());
            System.out.println("--------------------");
            p1.aumentarPoder(10);
            p2.aumentarPoder(50);
            System.out.println(p1.getPersonagem());
            System.out.println(p2.getPersonagem());
            System.out.println("--------------------");
            p1.nivelPoder = 2500; //pode-se alterar o valor da variável fora do método, a última alteração que vale
            p2.mudancaNome("Picollo");
            System.out.println(p1.getPersonagem());
            System.out.println(p2.getPersonagem());
            
    }


}

