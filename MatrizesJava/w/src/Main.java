import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int soma2 = 0;

        int[][] matriz = new int[3][3];
        int[][] matrizB = new int[3][3];


        //preenchendo a matriz com multiplicação dos índices
        //ex 1x1, 1x2,... etc
        System.out.println("Matriz One");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (i+1) * (j+1);

                System.out.printf("Valor para posição[%d] [%d]", i,j);
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz Two");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {

                matrizB[i][j] = (i+1) * (j+1);

                System.out.printf("Valor para posição[%d] [%d]", i,j);
                matrizB[i][j] = sc.nextInt();
                soma2 += matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz One: " + soma);
        System.out.println("Matriz Two: " + soma2);
        System.out.println("Soma das duas matrizes: " + (soma + soma2));


    }
}