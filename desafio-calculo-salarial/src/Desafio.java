import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        float salarioBruto = scan.nextFloat();
        System.out.println("Informe os beneficios à receber: ");
        float beneficios = scan.nextFloat();

        float imposto = 0;

        if((salarioBruto >= 0) && (salarioBruto <= 1100.00)){
            imposto = 0.05f * salarioBruto;
        }else if((salarioBruto >= 1100.01) && (salarioBruto <= 2500)){
            imposto = 0.10f * salarioBruto;
        }else{
            imposto = 0.15f * salarioBruto;
        }
        float salarioFinal = (salarioBruto - imposto) + beneficios;

        System.out.printf("O salário do funcionario é: R$%.2f", salarioFinal);

        scan.close();
    }
}
