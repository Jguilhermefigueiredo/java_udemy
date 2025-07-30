public class AnotacaoDeprecated {
    @SuppressWarnings("deprecation") //suprime os avisos do "deprecated" - deve-se usar com parcimonia
    public static void main(String[] args){
       
        InformaRegras regras = new InformaRegras();
        //uso do método obsoleto (deprecated)
         
        regras.mostrarRegrasParaAposentadoria();

        //uso do novo método
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}
class InformaRegras{
    @Deprecated //cria uma nota na compilação
    public void mostrarRegrasParaAposentadoria(){
        System.out.println("Regras aposentadoria. ");
    }
    public void mostrarNovasRegrasParaAposentadoria(){
        System.out.println("NOVAS regras aposentadoria .");
    }
}

