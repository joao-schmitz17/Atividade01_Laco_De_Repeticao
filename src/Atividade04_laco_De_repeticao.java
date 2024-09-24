import java.util.Scanner;

public class Atividade04_laco_De_repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade > 0) {
                System.out.println("Idade válida: " + idade);
                break;
            } else {
                System.out.println("Idade inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
