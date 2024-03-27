import java.util.Scanner;
public class Programa02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (valorPago < valorCompra) {
            System.out.println("ERRO: Valor pago insuficiente");
        }

        int[] notas = {50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];


        quantidadeNotas[0] = (int) (troco / 50);
        troco %= 50;
        quantidadeNotas[1] = (int) (troco / 20);
        troco %= 20;
        quantidadeNotas[2] = (int) (troco / 10);
        troco %= 10;
        quantidadeNotas[3] = (int) (troco / 5);
        troco %= 5;
        quantidadeNotas[4] = (int) (troco / 2);
        troco %= 2;
        quantidadeNotas[5] = (int) (troco / 1);


        System.out.println("Troco: R$" + troco);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas de R$" + notas[i] + ": " + quantidadeNotas[i]);
    
        scanner.close();
    }
}
}