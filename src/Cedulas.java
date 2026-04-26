import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        int valor;
        try (Scanner sc = new Scanner(System.in)) {
            valor = sc.nextInt();
        }
        int cem,cinquenta,vinte,dez,cinco,dois,um;
        int dinheiro = valor;

            cem = dinheiro / 100;
            dinheiro = dinheiro % 100;

            cinquenta = dinheiro / 50;
            dinheiro = dinheiro % 50;

            vinte = dinheiro / 20;
            dinheiro = dinheiro % 20;

            dez = dinheiro / 10;
            dinheiro = dinheiro % 10;

            cinco = dinheiro / 5;
            dinheiro = dinheiro % 5;

            dois = dinheiro / 2;
            dinheiro = dinheiro % 2;

            um = dinheiro / 1;

        System.out.printf("%d\n",valor);
        System.out.printf("%d nota(s) de R$ 100,00\n",cem);
        System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n",dez);
        System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n",dois);
        System.out.printf("%d nota(s) de R$ 1,00\n",um);
    }
}
