import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        int distancia;
        try (Scanner sc = new Scanner(System.in)) {
            distancia = sc.nextInt();
        }

        int tempo = distancia * 2;

        System.out.printf("%d minutos\n", tempo);
    }
}
