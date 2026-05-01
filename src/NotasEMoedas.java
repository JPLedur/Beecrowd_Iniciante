import java.util.Scanner;

public class NotasEMoedas{
    public static void main(String[] args) {
        double valor;
        try (Scanner sc = new Scanner(System.in)) {
            valor = sc.nextDouble();
        }
        int dinheiro = (int) Math.round(valor * 100);

        int cem = dinheiro / 10000;
        dinheiro %= 10000;

        int cinquenta = dinheiro / 5000;
        dinheiro %= 5000;
        
        int vinte = dinheiro / 2000;
        dinheiro %= 2000;

        int dez = dinheiro / 1000;
        dinheiro %= 1000;

        int cinco = dinheiro / 500;
        dinheiro %= 500;

        int dois = dinheiro / 200;
        dinheiro %= 200;

        int um = dinheiro / 100;
        dinheiro %= 100;

        int cinquentaCentavos = dinheiro / 50;
        dinheiro %= 50;

        int vinteCincoCentavos = dinheiro / 25;
        dinheiro %= 25;

        int dezCentavos = dinheiro / 10;
        dinheiro %= 10;

        int cincoCentavos = dinheiro / 5;
        dinheiro %= 5;

        int umCentavo = dinheiro;

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", cem);
        System.out.printf("%d nota(s) de R$ 50.00\n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20.00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10.00\n", dez);
        System.out.printf("%d nota(s) de R$ 5.00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2.00\n", dois);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", um);
        System.out.printf("%d moeda(s) de R$ 0.50\n", cinquentaCentavos);
        System.out.printf("%d moeda(s) de R$ 0.25\n", vinteCincoCentavos);
        System.out.printf("%d moeda(s) de R$ 0.10\n", dezCentavos);
        System.out.printf("%d moeda(s) de R$ 0.05\n", cincoCentavos);
        System.out.printf("%d moeda(s) de R$ 0.01\n", umCentavo);

    }
}