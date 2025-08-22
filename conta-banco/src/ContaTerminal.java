import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo atual");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero
        + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

        //TODO: Conhecer e importar a classe Scanner

        // exibir as msg pro usuario

        // obter pela scanner os valores digitados no terminal

        // exibir a msg conta criada
    }
}
