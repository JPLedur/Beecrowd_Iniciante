import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        int horas = 0, minutos, segundos;

        if(n >= 3600){
            horas = n / 3600;
        }
        minutos = (n - (horas * 3600)) / 60;
        segundos = n - (horas * 3600)- (minutos * 60);

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}
