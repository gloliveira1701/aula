import java.util.Scanner;

public class Ler {
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);

        leitor.useDelimiter("[\r\n]+");

        System.out.println("Entre com seu nome completo: ");
        String nomeCompleto = leitor.next();
        System.out.println(" Seu nome completo é : ");
        System.out.println(nomeCompleto);
        System.out.println(" FIM");

    
        leitor.close();

    }
}
