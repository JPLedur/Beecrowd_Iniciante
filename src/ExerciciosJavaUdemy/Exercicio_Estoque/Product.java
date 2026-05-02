package ExerciciosJavaUdemy.Exercicio_Estoque;

public class Product {
    String nome;
    double preco;
    int quantidade;

    public double valorTotal(){
        return quantidade * preco;
    }

    public void EntradaEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void SaidaEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void MostrarDados(){
        System.out.printf("Produto: %s\n", nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Quantidade: %d unidades\n", quantidade);
        System.out.printf("Valor Total: R$ %.2f\n", valorTotal());
    }
}