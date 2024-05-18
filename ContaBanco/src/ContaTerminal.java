import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agência: ");
        String agencia = scanner.next();

        System.out.println("Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
