import java.time.LocalDate;
import java.util.Scanner;

/**
 * hello
 */
public class hello {
    public static void main(String[] args){
        try(Scanner entrada = new Scanner(System.in);){
            //rest of your code    
            int ano = entrada.nextInt();
            LocalDate c1 = LocalDate.now();
            int anoAtual = c1.getYear();
            System.out.println("Sua idade é "+(anoAtual - ano));
        }
    }   
}