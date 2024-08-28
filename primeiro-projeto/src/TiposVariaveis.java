import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        byte idade = scan.nextByte();

        System.out.println("Qual o ano atual: ");
        short anoAtual = scan.nextShort();

        System.out.println("Digite seu cep: ");
        int cep = scan.nextInt();

        System.out.println("Digite seu cpf: ");
        long cpf = scan.nextLong();

        System.out.println("Digite seu salario: ");
        float salario = scan.nextFloat();   //float ou double

        System.out.printf("Nome: " + nome 
                                    + "\nIdade: " + idade 
                                    + "\nAno atual: " + anoAtual 
                                    + "\nCEP: " + cep 
                                    + "\nCPF: " + cpf 
                                    + "\nSalário: " + salario);
        
        scan.close();
    }
}
