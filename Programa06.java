import java.util.Scanner;
import java.util.Random;
public class Programa06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();


        int menorNumero = Math.min(n1, n2);
        int maiorNumero = Math.max(n1, n2);

        int numeroSorteado = random.nextInt((maiorNumero - menorNumero) + 1) + menorNumero; 

        System.out.println("O numero sorteado foi: " + numeroSorteado);
        if (numeroSorteado % 2 != 0) {
            System.out.println("Este numero é impar");
        } else {
            System.out.println("Esta número é par");
        }

        scanner.close();
    }

}
