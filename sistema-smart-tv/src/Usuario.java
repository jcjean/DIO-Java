import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        SmartTV smartTv = new SmartTV();
        ExibeMenu menu = new ExibeMenu();

        int vol = smartTv.volume;
        int canal = smartTv.canal;
        
        if(smartTv.ligada){
            System.out.println("A Tv está ligada!\nVolume: " +vol+ "\ncanal: " + canal);
            System.out.println("O que deseja fazer agora?");
            menu.mostraMenu();
        }else{
            System.out.println("A Tv está desligada no momento!\nDeseja ligá-la? Sim/Nao");
            String resposta = scan.next();
            
            if(resposta.equalsIgnoreCase("sim")){
                smartTv.ligarTV();

                System.out.println("\nA Tv está ligada!\nVolume: " +vol+ "\ncanal: " + canal);
                menu.mostraMenu();
            }else{
                System.out.println("Ok! A Tv permanecerá desligada.");
            }
        }
        scan.close();
    }
}
