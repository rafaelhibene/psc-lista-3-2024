import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NUMERO REAL: ");
        double n1 = scanner.nextDouble();
        System.out.println("DIGITE O SEGUNDO NUMERO REAL: ");
        double n2 = scanner.nextDouble();
        System.out.println("DIGITE UM DOS SIMBOLOS DE OPERAÇÃO: +, -, *, / OU ^");
        char simbolo = scanner.next().charAt(0);


        if (simbolo == '+') {
            double resultado = n1 + n2;
            System.out.println("RESULTADO DA OPERAÇÃO = " + resultado);
        } 
        else if (simbolo == '-') {
            double resultado = n1 - n2;
            System.out.println("RESULTADO DA OPERAÇÃO = " + resultado);
        }
        else if (simbolo == '*') {
            double resultado = n1 * n2;
            System.out.println("RESULTADO DA OPERAÇÃO = " + resultado);
        }
        else if (simbolo == '/') {
            double resultado = n1 / n2;
            System.out.println("RESULTADO DA OPERAÇÃO = " + resultado);
        }
        else if (simbolo == '^') {
            double resultado = Math.pow(n1, n2);
            System.out.println("RESULTADO DA OPERAÇÃO = " + resultado);
        }
        else {
            System.out.println("SIMBOLO DA OPERAÇÃO INVÁLIDO");
        }




        scanner.close();
    }
}
