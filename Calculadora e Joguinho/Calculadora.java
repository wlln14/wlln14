import java.util.Scanner;


public class Calculadora {
public static void main(String[] args) {
int somatodos = 0;
        Scanner sc = new Scanner (System.in);
        int[] soma = new int[10];

        System.out.println("Qual operação você deseja? (+ | - | * | /)");
        String operacao = sc.next();

        switch (operacao) {
            case "+":

                System.out.println("Quantos números você deseja somar?");
                int numeros = sc.nextInt();

                for (int i = 0; i < numeros; i++) {


                System.out.println("Digite o número" + (i+1));
                soma[i] = sc.nextInt();

                
                somatodos = somatodos += soma[i];
                }
                System.out.println("Resultado: " + (somatodos));
                break;

            case "-":
                System.out.println("Digite o primeiro número");
                int Pnum = sc.nextInt();

                System.out.println("Digite o segundo número");
                int Snum = sc.nextInt();

                System.out.println("Resultado: " + (Pnum - Snum));
                break;

            case "*": 
                System.out.println("Digite o primeiro número");
                Pnum = sc.nextInt();

                System.out.println("Digite o segundo número");
                Snum = sc.nextInt();

                System.out.println("Resultado: " + (Pnum * Snum));
                break;

            case "/":
                System.out.println("Digite o primeiro número");
                Pnum = sc.nextInt();

                System.out.println("Digite o segundo número");
                Snum = sc.nextInt();
                
                if (Snum == 0) {
                    System.out.println("Não é possivel dividir por 0");
                } else {

                System.out.println("Resultado: " + (Pnum / Snum));
            }
                break;
                    
                    
        
            default:
                break;
        }
        
    }
}
