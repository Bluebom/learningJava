import java.util.Scanner;

public class trecho {
    public static void main(String[] args){
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Digite um número");
            int n1 = entrada.nextInt();
            System.out.println("Digite agora um nome");
            entrada.nextLine();
            String nome1 = entrada.nextLine();
            System.out.println("O numero digitado foi " + n1 + " e o nome foi " + nome1);
            entrada.close();
        }
    }
}
