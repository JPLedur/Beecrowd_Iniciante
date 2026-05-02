package ExerciciosJavaUdemy.Exercicio_Dolar;

import java.util.Scanner;

public class ComprandoDolar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Valor do dolar autualmente: ");
            CurrencyConverter.dolar = sc.nextDouble();
            System.out.println("Valor de compra: ");
            CurrencyConverter.valorCompra = sc.nextDouble();
        }

        CurrencyConverter.CalculaValor();

        System.out.printf("Valor dolar = %.2f\n",CurrencyConverter.dolar);
        System.out.printf("Valor a Comprar = %.2f\n",CurrencyConverter.valorCompra);
        System.out.printf("Valor a Pagar = %.2f\n",CurrencyConverter.valorPagar);

    }
}
