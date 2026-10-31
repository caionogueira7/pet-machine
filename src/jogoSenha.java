import java.util.Scanner;

public class jogoSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tentativas = 1;

        System.out.println("*** JOGO DA SENHA ***");
        System.out.println("Digite uma senha(5 Números): ");
        int senha = scanner.nextInt();

        while (senha != 12345) {
            System.out.println("Senha INCORRETA! tente novamente. \n");
            System.out.println("Digite outra senha(5 Números): ");
            senha = scanner.nextInt();
            tentativas++;
        }

        System.out.println("Senha CORRETA***  Tentativa(s):"+tentativas);

        scanner.close();
    }
}