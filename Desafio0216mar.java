import java.util.Locale;
import java.util.Scanner;

public class Desafio0216mar {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        // abre Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro número");
        int n1 = entrada.nextInt();
        System.out.println("Digite seu segundo número");
        int n2 = entrada.nextInt();
        
        int soma = n1 + n2;
        int sub = n1 - n2;
        
        System.out.println("A soma desses números é: " + soma);
        System.out.println("A subtração desses números é: " + sub); 
        
        // fecha Scanner
        entrada.close();
    }
}
