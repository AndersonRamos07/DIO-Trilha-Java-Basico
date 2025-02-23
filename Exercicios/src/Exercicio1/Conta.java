package Exercicio1;

public class Conta {
   
   private double saldo = 0.00;
   private double chequeEspecial = 0.00;
   public double taxasCobradas = 0.00;
   public double saldoTotal = saldo + chequeEspecial;
   private boolean isUsingChequeEspecial = false;

   public Conta(double pSaldo)
   {
        this.saldo = pSaldo;
        if(pSaldo <= 500.00)
        {
            this.chequeEspecial = 50.00;
        } else{
            this.chequeEspecial = pSaldo * 0.5;
        }
        System.out.println("       Conta criada!\n - Saldo: R$"+String.format("%.2f",saldo)+";"+"\n - Cheque Especial: R$"+String.format("%.2f",chequeEspecial)+".");
   }

   public void getSaldo()
   {
        System.out.println("Saldo: R$"+String.format("%.2f",saldo));
   }
   public void getChequeEspecial(int pTipo)
   {
        if(pTipo == 0)
        {
            System.out.println("Cheque Especial: R$"+String.format("%.2f",chequeEspecial));
        }else if(pTipo == 1)
        {
            System.out.println(this.isUsingChequeEspecial? "O Cheque Especial esta sendo utilizado!":"O Cheque Especial NAO esta sendo utilizado!");
        }
   }
   public void getTaxasCobradas()
   {
    System.out.println("Total de taxas: R$"+String.format("%.2f",this.taxasCobradas));
   }

   public void depositar (double pValor)
   {
        this.saldo += pValor;
        System.out.println("Foi realizado o deposito no valor de: R$"+String.format("%.2f",pValor));
   }
   public void sacar (double pValor)
   {
        this.saldo -= pValor;
        System.out.println("Foi realizado o saque no valor de: R$"+String.format("%.2f",pValor));
        usarChequeEspecial();
   }
   public void pagarBoleto (double pValor)
   {
        this.saldo -= pValor;
        System.out.println("Foi pago o boleto no valor de: R$"+String.format("%.2f",pValor));
        usarChequeEspecial();
   }
   
   public void checarContaNegativa ()
   {
        if(this.saldo < 0.00 && this.isUsingChequeEspecial == false)
        {
            this.isUsingChequeEspecial = true;
        }
   }
   public void cobrarTaxa (double pValor)
   {
        double taxa = pValor * 0.2;
        this.taxasCobradas += taxa;
        System.out.println("Foi cobrado a taxa no valor de: R$"+String.format("%.2f",taxa)+",\n com base no valor de: R$"+String.format("%.2f",pValor)+".");
   }
   public void usarChequeEspecial ()
   {
        checarContaNegativa();
        if(this.saldo < 0.00 && this.isUsingChequeEspecial == true)
        {
            this.chequeEspecial += this.saldo;
            cobrarTaxa(this.saldo * -1);
        }
        // if(saldoTotal <= chequeEspecial)
        // {
        //     cobrarTaxa(pValor);
        // } else{
        //     this.isUsingChequeEspecial = false;
        // }
   }
}
