import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        int distancia;
        double gasolina;
        try (Scanner sc = new Scanner(System.in)) {
            distancia = sc.nextInt();
            gasolina = sc.nextDouble();
        }

        double media = distancia/gasolina;

        System.out.printf("%.3f km/l\n",media);
    }
}
