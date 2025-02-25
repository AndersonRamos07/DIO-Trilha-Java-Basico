package curso_dio;

public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void aumentarVolume ()
    {
        volume++;
    }    public void diminuirVolume ()
    {
        volume--;
    }    public void aumentarCanal ()
    {
        canal++;
    }    public void diminuirCanal()
    {
        canal--;
    }
        public void mudarCanal (int novoCanal)
        {
            canal = novoCanal;
        }
    public void ligar ()
    {
        ligada = true;
    }
    public void desligar ()
    {
        ligada = false;
    }
}
