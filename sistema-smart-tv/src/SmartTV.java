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
}

/*
 *  public boolean ligada(boolean state){
        return state;
    }

    public int aumentarVolume(int vol){
        return vol++;
    }

    public int diminuirVolume(int vol){
        return vol--;
    }

    public int mudarCanal(int channel){
        return channel;
    }
 */
