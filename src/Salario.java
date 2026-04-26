import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int numero, horasTrabalhadas;
        double salarioPorHora;
        try (Scanner sc = new Scanner(System.in)) {
            numero = sc.nextInt();
            horasTrabalhadas = sc.nextInt();
            salarioPorHora = sc.nextDouble();
        }
        double salario;

        salario = salarioPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
    }    
}
