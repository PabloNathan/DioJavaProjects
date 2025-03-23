public class ProjectOne{

    public static void main(String [] args){

        String primeiroNome = "pablo";
        String segundoNome = "Nathan";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resulstado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}