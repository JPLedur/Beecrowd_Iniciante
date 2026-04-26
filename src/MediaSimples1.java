

import java.util.Scanner;

public class MediaSimples1 {
    public static void main(String[] args) {
        double media;
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            media = ((3.5 * a) / 11) + ((7.5 * b) / 11);
        }

        System.out.printf("MEDIA = %.5f\n", media);

    }
}
