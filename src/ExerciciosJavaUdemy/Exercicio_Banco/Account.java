package ExerciciosJavaUdemy.Exercicio_Banco;

public final class Account {
    private final int id;
    private String name;
    private double balance;

    public Account(int id,String name, double balance){
        this.id = id;
        this.name = name;
        depositoConta(balance);
    }

    public Account(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void saqueConta(double balance){
        this.balance -= balance + 5;
    }

    public void depositoConta(double balance){
        this.balance += balance;
    }

    public void mostrarDados(){
        System.out.printf("Conta: %d\n", id);
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Saldo: R$ %.2f\n", balance);
    }
}
