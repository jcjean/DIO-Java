import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salario desejado: ");
        double salarioPretendido = scan.nextDouble();

        analisarCandidato(salarioPretendido);

        scan.close();
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidado com contra proposta.");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
