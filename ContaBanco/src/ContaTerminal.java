import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite qual é a sua a Agência: ");
        String Agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double Saldo = scanner.nextDouble();

        String mensagem = "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
}