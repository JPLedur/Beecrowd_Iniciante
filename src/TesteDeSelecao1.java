import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        int A,B,C,D;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
        }

        int AB = A + B;
        int CD = C + D;

        if(B <= C){
            System.out.printf("Valores nao aceitos\n");
        }
        else if(A >= D){
            System.out.printf("Valores nao aceitos\n");
        }
        else if(CD <= AB){
            System.out.printf("Valores nao aceitos\n");
        }
        else if(C < 0 || D < 0){
            System.out.printf("Valores nao aceitos\n");
        }
        else if(A % 2 != 0){
            System.out.printf("Valores nao aceitos\n");
        }
        else{
            System.out.printf("Valores aceitos\n");
        }
    }
}

/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/