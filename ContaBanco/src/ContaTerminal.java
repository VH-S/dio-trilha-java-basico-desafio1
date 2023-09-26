import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número de sua agência");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome+ " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}