import java.util.Scanner;

public class SmartTV{
    boolean ligada = false;
    int volume = 20;
    int canal = 1;

    public void ligarTV(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(){
        Scanner scan = new Scanner(System.in); 

        System.out.println("Digite o canal: ");
        canal = scan.nextInt();
    }
}
