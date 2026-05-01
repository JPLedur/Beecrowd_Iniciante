import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        double valor;
        try (Scanner sc = new Scanner(System.in)) {
            valor = sc.nextDouble();
        }

        if(0 <= valor && valor <= 25){
            System.out.printf("Intervalo [0,25]\n");
        }
        else if(25 <= valor && valor <= 50){
            System.out.printf("Intervalo (25,50]\n");
        }
        else if(50 <= valor && valor <= 75){
            System.out.printf("Intervalo (50,75]\n");
        }
        else if(75 <= valor && valor <= 100){
            System.out.printf("Intervalo (75,100]\n");
        }
        else{
            System.out.printf("Fora de intervalo\n");
        }
    }
}
