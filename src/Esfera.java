import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        int raio;
        try (Scanner sc = new Scanner(System.in)) {
            raio = sc.nextInt();
        }
        double esfera;

        esfera = (4*3.14159 * raio * raio * raio) / 3;

        System.out.printf("VOLUME = %.3f\n", esfera);
    }
}
