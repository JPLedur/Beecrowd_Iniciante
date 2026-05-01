import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        int d;
        try (Scanner sc = new Scanner(System.in)) {
            d = sc.nextInt();
        }

        int ano, mes, dia;

        if(d >= 365){
            ano = d /365;
        }
        else{
            ano = 0;
        }
        mes = (d - (ano * 365)) / 30;
        dia = (d - (ano * 365) - (mes * 30));

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

    }
}
