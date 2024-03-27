//Escreva um algoritmo que leia 3 números a partir do teclado.algoritmo deve apresentar:. O maior número. O menor número.. A média aritmética dos três números.

import java.util.Scanner;
public class Programa01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double n3 = scanner.nextDouble();


        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior numero é: " + n1);

        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior numero é: " + n2);

        } else {
            System.out.println("O maior numero é: " + n3);
        }
        
        if (n1 < n2 && n1 < n3) {
            System.out.println("O menor numero é: " + n1);

        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O menor numero é: " + n2);

        } else {
            System.out.println("O menor numero é: " + n3);
        }

        double media = (n1 + n2 + n3) / 3;

        System.out.println("A media aritmetica dos tres numeros: " + media);

        scanner.close();
    }
}