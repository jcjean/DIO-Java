import java.util.Scanner;

public class ExibeMenu {
    public void mostraMenu(){
        
        SmartTV smartTv = new SmartTV();
        Scanner scan = new Scanner(System.in);
        int op;
        do{
            System.out.print("\n");
            System.out.println("==========MENU=============");
            System.out.println("1 - Aumentar o Volume.    |");
            System.out.println("2 - Diminuir o Volume.    |");
            System.out.println("3 - Mudar de canal.       |");
            System.out.println("4 - Desligar a Tv.        |");
            System.out.println("---------------------------");
            
            op = scan.nextInt();
            switch (op) {
                case 1:
                    smartTv.aumentarVolume();
                    System.out.println("\nA Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                case 2:
                    smartTv.diminuirVolume();
                    System.out.println("\nA Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                case 3:
                    smartTv.mudarCanal();
                    System.out.println("\nA Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                case 4:
                    smartTv.desligarTv();
                    System.out.println("\nDesligando TV...");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }while(op!=4);
        scan.close();
    }
}
