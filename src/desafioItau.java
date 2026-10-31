import java.util.Scanner;

public class desafioItau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a OPERAÇÃO desejada:");
        String operacao = scanner.hasNext() ? scanner.next() : "";

        boolean operacaoValida = false;

        if (operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")) {
            operacaoValida = true;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}