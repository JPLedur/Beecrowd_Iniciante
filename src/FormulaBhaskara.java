import java.util.Scanner;

public class FormulaBhaskara{
    public static void main(String[] args) {
        double a,b,c;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }

        double delta = (b*b) - (4 * a * c);
        double resultado1 = (- b + Math.sqrt(delta)) / (2 * a) ;
        double resultado2 = (- b - Math.sqrt(delta)) / (2 * a) ;


        if(delta < 0){
            System.out.printf("Impossivel calcular\n");
        }
        else if(2 * a == 0){
            System.out.printf("Impossivel calcular\n");
        }
        else{
            System.out.printf("R1 = %.5f\n",resultado1);
            System.out.printf("R2 = %.5f\n",resultado2);
        }
    }
}