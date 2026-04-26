

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        int produto;
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            produto = a * b;
        }

        System.out.printf("PROD = %d\n", produto);

    }
}
