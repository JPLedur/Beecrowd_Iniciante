package ExerciciosJavaUdemy.Exercicio_Notas;

public class Notas {
    String nome;
    double N1;
    double N2;
    double N3;
    
    public void teste(){
        if(N1 + N2 + N3 >= 60){
            System.out.printf("NAME: %s\n", nome);
            System.out.printf("FINAL GRADE = %.2f\n", N1 + N2 + N3);
            System.out.println("PASS!\n");
        }
        else{
            System.out.printf("NAME: %s\n", nome);
            System.out.printf("FINAL GRADE = %.2f\n", N1 + N2 + N3);
            System.out.println("FAILED!\n");
            System.out.printf("MISSING %.2f POINTS\n", (60.00 - N1 + N2 + N3));
        }
    }
}

