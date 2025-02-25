package Exercicio2;

public class Carro {
    
    private boolean isLigado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public boolean acionar(boolean pDesligar)    //ligar ou desligar
    {
        if(this.marcha == 0 && this.velocidade == 0)
        {

            this.isLigado = pDesligar? false: true;
        } else{
            System.out.println("E necessario estar em marcha Neutra (0) para desligar o carro.");
        };
        return this.isLigado;
    }

    public int cambiar(String pMarcha)    //trocar a marcha
    {
        if(isLigado)
        {
            if(pMarcha == "aumentar" && this.marcha != 6)
            {
                this.marcha++;
            } else if(pMarcha == "reduzir" && this.marcha != 0){
                this.marcha--;
            } 

        }
       else{
            System.out.println("Impossivel realizar essa operacao!");
        }
        return this.marcha;
    }

    public int acelerar(int pMarcha)
    {
        int vMarcha = 0;
        if(isLigado)
        {

            switch (pMarcha) {
                case 1:
                    vMarcha = this.velocidade >= 0 && this.velocidade <= 20?
                            this.velocidade++ : -1;
                    break;
                case 2:
                    vMarcha = this.velocidade >= 21 && this.velocidade <= 40?
                            this.velocidade++ : -1;
                    break;
                case 3:
                    vMarcha = this.velocidade >= 41 && this.velocidade <= 60?
                            this.velocidade++ : -1;
                    break;
                case 4:
                    vMarcha = this.velocidade >= 61 && this.velocidade <= 80?
                            this.velocidade++ : -1;
                    break;
                case 5:
                    vMarcha = this.velocidade >= 81 && this.velocidade <= 100?
                            this.velocidade++ : -1;
                    break;
                case 6:
                    vMarcha = this.velocidade >= 101 && this.velocidade <= 120?
                            this.velocidade++ : -2;
                    break;
                default:
                    break;
            }
            if(vMarcha == -1)
            {
                System.out.println("Troque a marcha!");
            } else if(vMarcha == -2)
            {
                System.out.println("O carro esta no limite de velocidade!");
            }
        } else{
            System.out.println("Impossivel realizar essa operacao!");
        }
        return this.velocidade;
    }

    public int desacelerar(int pMarcha)
    {
        int vMarcha = 0;
        if(isLigado)
        {

            switch (pMarcha) {
                case 1:
                    vMarcha = this.velocidade >= 0 && this.velocidade <= 20?
                            this.velocidade-- : -1;
                    break;
                case 2:
                    vMarcha = this.velocidade >= 21 && this.velocidade <= 40?
                            this.velocidade-- : -1;
                    break;
                case 3:
                    vMarcha = this.velocidade >= 41 && this.velocidade <= 60?
                            this.velocidade-- : -1;
                    break;
                case 4:
                    vMarcha = this.velocidade >= 61 && this.velocidade <= 80?
                            this.velocidade-- : -1;
                    break;
                case 5:
                    vMarcha = this.velocidade >= 81 && this.velocidade <= 100?
                            this.velocidade-- : -1;
                    break;
                case 6:
                    vMarcha = this.velocidade >= 101 && this.velocidade <= 120?
                            this.velocidade-- : -2;
                    break;
                default:
                    break;
            }
            if(vMarcha == -1)
            {
                System.out.println("Troque a marcha!");
            } else if(vMarcha == -2)
            {
                System.out.println("O carro esta no limite de velocidade!");
            }
        } else{
            System.out.println("Impossivel realizar essa operacao!");
        }
        return this.velocidade;
    }

    public void direcionar (String pDirecao)   //esquerda ou direita
    {
        if(isLigado)
        {
            if(this.velocidade <= 40 && this.velocidade != 0)
            {
                System.out.println("Virando para a "+ pDirecao);
            } else if(this.velocidade <= 120 && this.velocidade != 0){
                System.out.println("Reduza a velocidade para a sua seguranca");
            }
        } else{
            System.out.println("Impossivel realizar essa operacao!");
        }
    }

    public int getVelocidade ()
    {
        System.out.println("A velocidade atual do carro e de: "+this.velocidade+"km.");
        return this.velocidade;
    }
    public int getMarcha ()
    {
        System.out.println(this.marcha != 0?"A marcha atual do carro e a: "+this.marcha+"a marcha": "O carro esta em marcha Neutra.");
        return this.marcha;
    }
    public boolean getIsLigado ()
    {
        return this.isLigado;
    }

    public void checarPainel()
    {
        System.out.println(":::::::PAINEL:::::::");
        System.out.println("O carro esta:");
        System.out.println(this.isLigado? "- Ligado;":"- Desligado;");
        System.out.println("- "+this.velocidade+"km;");
        System.out.println(this.marcha == 0? "- Neutro (P).":"- Na "+this.marcha+" marcha.");
        System.out.println(":::::::*******:::::::");
    }
}

//todo
/*
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
 */