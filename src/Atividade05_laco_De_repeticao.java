import java.util.Random;
import java.util.Scanner;

public class Atividade05_laco_De_repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("Adivinhe o número entre 1 e 100!");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            }
        }

        System.out.println("Parabéns! Você acertou!");
        scanner.close();
    }
}