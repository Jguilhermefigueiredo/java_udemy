public class ExercicioConstrutorCarro {

    String carro;
    String marca;
    int ano;

    ExercicioConstrutorCarro(){

    }

    ExercicioConstrutorCarro(String modeloDoCarro, String marcaDoCarro) {
        carro = modeloDoCarro;
        marca = marcaDoCarro;
        
    }

    ExercicioConstrutorCarro(String modeloDoCarro, String marcaDoCarro, int anoDoCarro) {
        carro = modeloDoCarro;
        marca = marcaDoCarro;
        ano = anoDoCarro;
    }

        public static void main(String[] args) {
            ExercicioConstrutorCarro carro1 = new ExercicioConstrutorCarro();

            ExercicioConstrutorCarro carro2 = new ExercicioConstrutorCarro("Megane" , "Renaut" , 2020);

            ExercicioConstrutorCarro carro3 = new ExercicioConstrutorCarro();
            carro3.carro = "Ka";
            carro3.marca = "Ford";

        System.out.println("Modelo :" + carro1.carro);
        System.out.println("Marca :" + carro1.marca); 
        System.out.println ("Ano: " + carro1.ano);
        System.out.println("-----------------------------");
        System.out.println("Modelo :" + carro2.carro);
        System.out.println("Marca :" + carro2.marca); 
        System.out.println ("Ano: " + carro2.ano);
        System.out.println("-----------------------------");
        System.out.println("Modelo :" + carro3.carro);
        System.out.println("Marca :" + carro3.marca); 
        System.out.println ("Ano: " + carro3.ano);
        }


}


