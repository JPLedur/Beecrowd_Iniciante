import java.util.Scanner;

public class MediaSimples2{
    public static void main(String[] args) {
        double media;
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            media = (a*0.2) + (b*0.3) + (c*0.5);
        }

        System.out.printf("MEDIA = %.1f\n",media);
    }
}