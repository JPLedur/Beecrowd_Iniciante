package ExerciciosJavaUdemy.Exercicio_Notas;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        
        Notas nota = new Notas();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nome do Aluno: ");
            nota.nome = sc.next();
            
            System.out.println("Digite a nota 1: ");
            nota.N1 = sc.nextInt();
            
            System.out.println("Digite a nota 2: ");
            nota.N2 = sc.nextInt();
            
            System.out.println("Digite a nota 31: ");
            nota.N3 = sc.nextInt();
        }

        if(nota.N1 > 30){
            System.out.println("Valor da Nota 1 é incongruente!\n");
        }
        else if(nota.N2 > 35 || nota.N3 > 35){
            System.out.println("Valor da Nota 2 ou 3 é incongruente!\n");
        }
        else{
            nota.teste();
        }
    }
}
