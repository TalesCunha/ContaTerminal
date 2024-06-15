import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitação dos dados ao usuário
    System.out.print("Por favor, digite o número da Agência: ");
    String agencia = scanner.nextLine();

    System.out.print("Digite o número da conta: ");
    int numero = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Digite o nome do cliente: ");
    String nomeCliente = scanner.nextLine();

    System.out.print("Digite o saldo da conta: ");
    double saldo = scanner.nextDouble();

    // Exibição da mensagem personalizada
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
    System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);

    scanner.close();
  }
}
