import java.util.Scanner;

public class ExibeMenu {
    public void mostraMenu(){
        
        SmartTV smartTv = new SmartTV();
        Scanner scan = new Scanner(System.in);
        int op;
        do{
            System.out.println("---------------------------");
            System.out.println("1 - Aumentar o Volume.    |");
            System.out.println("2 - Diminuir o Volume.    |");
            System.out.println("3 - Mudar de canal.       |");
            System.out.println("4 - Desligar a Tv.        |");
            System.out.println("5 - Fechar o menu.        |");
            System.out.println("---------------------------");
            
            op = scan.nextInt();
            switch (op) {
                case 1:
                    smartTv.aumentarVolume();
                    System.out.println("A Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                case 2:
                    smartTv.diminuirVolume();
                    System.out.println("A Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                case 3:
                    System.out.println("indisponivel");
                    break;
                case 4:
                    System.out.println("Ok! A Tv será desligada!");
                    smartTv.desligarTv();
                    break;
                case 5:
                    System.out.println("Ok! Aproveite bem sua programação!");
                    System.out.println("A Tv está ligada!\nVolume: " +smartTv.volume+ "\ncanal: " + smartTv.canal);
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }while(op!=4);
        scan.close();
    }
}
