
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
        }

        int diferenca = (a * b - c * d);
    
        System.out.printf("DIFERENCA = %d\n",diferenca);
    }
}
