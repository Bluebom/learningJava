import java.util.Locale;
import java.util.Scanner;

public class Desafio0116mar {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double n1 = entrada.nextDouble();
        System.out.println("Digite sua altura");
        entrada.nextLine();
        double n2 = entrada.nextDouble();
        System.out.println("O seu peso é: " + n1 + " e a sua altura é: " + n2);
        entrada.close();
    }
}
