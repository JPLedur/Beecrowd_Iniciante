package ExerciciosJavaUdemy.Exercicio_Banco;

import java.util.Scanner;

public class Consulting {
    public static void main(String[] args) {
        Account x;
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o número de conta: ");
            int id = sc.nextInt();
            
            System.out.print("Digite o seu nome completo: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Deseja realizar seu primeiro depósito? (Y/N): ");
            char resposta = sc.next().charAt(0);
            if('Y' == resposta){
                System.out.print("Digite o valor a ser depositado: ");
                double deposito = sc.nextDouble();
                x = new Account(id,name,deposito);
            }
            else{
                x = new Account(id,name);
            }

        x.mostrarDados();

        System.out.println("Digite o valor do seu saque: ");
        double deposito = sc.nextDouble();
        x.saqueConta(deposito);

        x.mostrarDados();

        System.out.println("Digite o valor do seu depósito: ");
        deposito = sc.nextDouble();
        x.depositoConta(deposito);

        x.mostrarDados();        
        }
    }
}
