
import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        int A, B, x;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            
            x = A + B;
            
            System.out.println("X = " + x);
        }
    }
}
