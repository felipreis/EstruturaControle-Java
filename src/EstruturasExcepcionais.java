import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class EstruturasExcepcionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            String nome;
            int idade;
            double altura;
            
            System.out.println("Digite seu nome :");
            nome = scanner.next(); 
            
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            altura = scanner.nextDouble();

            System.out.println("Seu nome é " + nome + " tem " + idade + " anos e " + altura + " de altura");
        }
        catch(InputMismatchException e){
            System.out.println("a idade e a altura deve ser composta por números");
        }

        scanner.close();
    }
}