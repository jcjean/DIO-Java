import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametro1 = scan.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametro2 = scan.nextInt();

        try{
            Contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

        scan.close();
    }

    static void Contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1<parametro2){
            int cont = parametro2-parametro1;
            for(int i=0;i<cont;i++){    //irá começar a imprimir a partir de zero (0)
                System.out.println("Imprimindo o número " +i);
            }
        }else{
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
        }
    }

    static class ParametrosInvalidosException extends Exception{    //exceção customizada
        public ParametrosInvalidosException(String msg){
            super(msg);
        }
    }
}
