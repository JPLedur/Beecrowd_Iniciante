package ExerciciosJavaUdemy.Exercicio_Estoque;

import java.util.Scanner;

public class Estoque{
    public static void main(String[] args) {
        int entrada,saida;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            
            Product x = new Product(nome, preco, quantidade);

            x.valorTotal();
            
            x.MostrarDados();
            
            System.out.println("Digite a quantidade de produtos que você quer adicionar ao estoque: ");
            entrada = sc.nextInt();
            x.EntradaEstoque(entrada);
            x.MostrarDados();
                      
            System.out.println("Digite a quantidade de produtos que você quer adicionar ao estoque: ");
            saida = sc.nextInt();
            x.SaidaEstoque(saida);
            x.MostrarDados();
        }
    }
}