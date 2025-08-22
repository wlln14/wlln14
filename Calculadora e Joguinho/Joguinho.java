import java.util.Scanner;
import java.util.Random;

public class Joguinho {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Random rd = new Random();
    int numero100 = rd.nextInt(100);


    int adivinha = 0, contador = 1;
      
    while(numero100 != adivinha){ 
     System.out.println("Digite um número para adivinhar (0-100)");
     adivinha = sc.nextInt();

        if (adivinha < numero100) {
            System.out.println("O número é maior");
            contador++;
        } 
        
        if (adivinha > numero100) {
            System.out.println("O número é menor");
            contador++;
        } 
        if (adivinha == numero100) {
            System.out.println("Você acertou!");
        }
        }

        System.out.println("O número era: " + numero100);
        System.out.println("Tentativas necessarias: " + contador);
}
}
