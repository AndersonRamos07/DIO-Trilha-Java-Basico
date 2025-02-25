package Exercicio3;

public class MaquinaDeBanho {

    private int reservatorioAgua = 30;
    private int reservatorioShampoo = 10;
    private boolean isBanheiraBusy = false;

    public void petHandle (boolean pTirar)
    {
        this.isBanheiraBusy = pTirar? false : true;
        System.out.println(this.isBanheiraBusy?"A maquina esta ocupada!":"A maquina esta livre!");
    }

    public void petBanho ()
    {
        this.reservatorioAgua -= 10;
        this.reservatorioShampoo -= 2;
        System.out.println("Mais um banho de pet para conta.");
    }

    public void petLimpeza ()
    {
        this.reservatorioAgua -= 3;
        this.reservatorioShampoo -= 1;
        System.out.println("Foi realizado a limpeza da maquina");
    }

    public void petAbastecimento2L (int pReservatorio)
    {
        boolean isAbastecido = false;
        if(pReservatorio == 1)
        {
            if(this.reservatorioAgua <= 28){
                this.reservatorioAgua += 2;
                isAbastecido = true;
            }
        } else if(pReservatorio == 2)
        {
            if(this.reservatorioShampoo <= 8){
                this.reservatorioShampoo += 2;
                isAbastecido = true;
            }
        }
        System.out.println(isAbastecido?"Foi realizado o abastecimento com mais 2l.":"Tente realizar mais um banho antes de reabastecer a maquina.");
    }

    public int getAgua ()
    {
        System.out.println("O nivel do reservatorio esta marcando: "+this.reservatorioAgua+"l.");
        return this.reservatorioAgua;
    }
    public int getShampoo ()
    {
        System.out.println("O nivel do reservatorio esta marcando: "+this.reservatorioShampoo+"l.");
        return this.reservatorioShampoo;
    }
    public boolean getBanheiraBusy ()
    {
        System.out.println(this.isBanheiraBusy?"A maquina esta ocupada!":"A maquina esta livre!");
        return this.isBanheiraBusy;
    }
}

//todo
// Dar banho no pet;
// Abastecer com água;
// Abastecer com shampoo;
// verificar nivel de água;
// verificar nivel de shampoo;
// verificar se tem pet no banho;
// colocar pet na maquina;
// retirar pet da máquina;
// limpar maquina.