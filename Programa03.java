import java.util.Scanner;
public class Programa03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor do coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do coeficiente B: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor do coeficiente C: ");
        double c = scanner.nextDouble();


        double delta = (b * b) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if ( a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        }

        if (a == 0 && b != 0) {
            System.out.println("Essa é uma equacao de primeiro grau");
            
        }

        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        }

        if (delta == 0) {
            System.out.println("Esta equacao possui duas raizes reais iguais");
            System.out.println("RAIZES = " + x1);
        }

        if (delta > 0) {
            System.out.println("Esta equacao possui duas raizes reais diferentes");
            System.out.println("RAIZ 1 = " + x1);
            System.out.println("RAIZ 2 = " + x2);
        }

        scanner.close();
    }
}