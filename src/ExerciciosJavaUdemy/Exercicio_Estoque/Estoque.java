package ExerciciosJavaUdemy.Exercicio_Estoque;

import java.util.Scanner;

public class Estoque{
    public static void main(String[] args) {
        int entrada,saida;
        try (Scanner sc = new Scanner(System.in)) {
            Product x = new Product();
            System.out.println("Digite o nome do produto: ");
            x.nome = sc.next();
            System.out.println("Digite o preço do produto: ");
            x.preco = sc.nextDouble();
            System.out.println("Digite a quantidade: ");
            x.quantidade = sc.nextInt();
            
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