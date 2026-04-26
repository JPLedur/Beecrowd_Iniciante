import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        String nome;
        double salarioFixo;
        double salarioComissao;
        try (Scanner sc = new Scanner(System.in)) {
            nome = sc.nextLine();
            salarioFixo = sc.nextDouble();
            salarioComissao = sc.nextDouble();
        }
        double salario;

        salario = salarioFixo + (salarioComissao * 0.15);
        System.out.printf("NOME = %s\n", nome);
        System.out.printf("TOTAL = R$ %.2f\n", salario);
        
    }    
}
