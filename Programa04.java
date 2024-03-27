import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR");
        System.out.println("1: calcular e imprimir o perímetro do círculo.");
        System.out.println("2: calcular e imprimir a área do círculo.");
        System.out.println("3: calcular e imprimir o volume da esfera.");

        int valorInicial = scanner.nextInt();

        System.out.println("Digite o raio do circulo ou da esfera: ");
        double raio = scanner.nextDouble();

        if (valorInicial != 1 || valorInicial != 2 || valorInicial != 3) {
            System.out.println("Codigo para operação inválido");
        }

        if (valorInicial == 1) {
            double perimetro = 2 * 3.141592 * raio;
            System.out.println("PERIMETRO DO CIRCULO = " + perimetro);
        }

        if (valorInicial == 2) {
            double areaCirculo = 3.141592 * (raio * raio);
            System.out.println("AREA DO CIRCULO = " + areaCirculo);
        }

        if (valorInicial == 3) {
            double volumeEsfera = 4/3 * 3.141592 * (raio * raio * raio);
            System.out.println("VOLUME DA ESFERA = " + volumeEsfera); 
        }

        scanner.close();
    }
}
