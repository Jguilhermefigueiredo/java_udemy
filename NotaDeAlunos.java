public class NotaDeAlunos {
    public static void main(String[] args) {
        
        double notaAluno [];

        notaAluno = new double[]{5.3, 6.0, 4.5, 9.0, 7.5};
        /*System.out.print(notaAluno[0]); 
        System.out.print(notaAluno[1]);
        System.out.print(notaAluno[2]);
        System.out.print(notaAluno[3]);
        System.out.print(notaAluno[4]);*/
       System.out.print("As notas em sequência são: "); 
        for (double elemento : notaAluno) {
            System.out.print(elemento + ", ");
            
        }
    }

}
