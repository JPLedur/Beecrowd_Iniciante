import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        int A, B, C;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
        }

        int maior = A;

        if(maior < B ){
            maior = B;
        }
        if(maior < C){
            maior = C;
        }
        
        System.out.printf("%d eh o maior\n",maior);
    }
}
