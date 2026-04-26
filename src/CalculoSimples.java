import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int peca1 = sc.nextInt(),numeroPeca1 = sc.nextInt();
            double valorPeca1 = sc.nextDouble();
            int peca2 = sc.nextInt(),numeroPeca2 = sc.nextInt();
            double valorPeca2 = sc.nextDouble();
            double valorAPagar;

            valorAPagar = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

            System.out.printf("CÓDIGO(S): %d e %d\n",peca1,peca2);
            System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorAPagar);
        }
    }
}
