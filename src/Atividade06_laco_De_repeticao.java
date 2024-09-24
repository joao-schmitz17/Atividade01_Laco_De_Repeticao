import java.util.Scanner;

public class Atividade06_laco_De_repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / n;
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}