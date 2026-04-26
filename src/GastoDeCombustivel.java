import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {

        int tempo, velocidade;
        try (Scanner sc = new Scanner(System.in)) {
            tempo = sc.nextInt();
            velocidade = sc.nextInt();
        }
        double distancia = (velocidade * tempo);
        double combustivelTotal = distancia / 12;

        System.out.printf("%.3f\n",combustivelTotal);
    }
}
