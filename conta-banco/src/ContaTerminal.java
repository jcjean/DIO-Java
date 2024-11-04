import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ola! Por favor, digite o seu nome:");
        String NomeCliente = scan.nextLine();

        System.out.println("Digite o número da conta:");
        int Numero = scan.nextInt();

        System.out.println("Digite o número da agencia:");
        String Agencia = scan.nextLine();

        System.out.println("Quanto gostaria de depositar?");
        float Saldo = scan.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque", NomeCliente, Agencia, Numero, Saldo);

        scan.close();
    }
}
