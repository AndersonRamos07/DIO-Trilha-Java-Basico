package Exercicio1;

public class Conta {
   
   private double saldo = 0.00;
   private double chequeEspecial = 0.00;
   public double taxasCobradas = 0.00;
   public double saldoTotal = 0.00;
   private boolean isUsingChequeEspecial = false;

   public Conta(double pSaldo)     //OK
   {
        this.saldo = pSaldo;
        if(pSaldo <= 500.00)
        {
            this.chequeEspecial = 50.00;
        } else{
            this.chequeEspecial = pSaldo * 0.5;
        }
        this.saldoTotal = saldo + chequeEspecial; //soma o valor do saldo com o valor do cheque especial
        System.out.println("\n       Conta criada!\n - Saldo: R$"+String.format("%.2f",saldo)+";"+"\n - Cheque Especial: R$"+String.format("%.2f",chequeEspecial)+".\n");
   }

   public void getSaldo()     //OK
   {
        System.out.println("Saldo: R$"+String.format("%.2f",saldo));
   }
   public void getSaldoTotal()     //OK
   {
        System.out.println("Saldo Total: R$"+String.format("%.2f",saldoTotal));
   }
   public void getChequeEspecial(int pTipo)  //OK
   {
        if(pTipo == 0)    // tipo 0: informa no terminal o saldo do Cheque Especial
        {
            System.out.println("Cheque Especial: R$"+String.format("%.2f",chequeEspecial));
        }else if(pTipo == 1)  // tipo 1: informa no terminal se o Cheque Especial esta em uso ou nao
        {
            System.out.println(this.isUsingChequeEspecial? "O Cheque Especial esta sendo utilizado!":"O Cheque Especial NAO esta sendo utilizado!");
        }
   }
   public void getTaxasCobradas()
   {
    System.out.println("Total de taxas: R$"+String.format("%.2f",taxasCobradas));
   }

   public void depositar (double pValor)     //OK
   {
        this.saldo += pValor;
        this.saldoTotal += pValor;
        System.out.println("Foi realizado o deposito no valor de: R$"+String.format("%.2f",pValor));
   }
   public void sacar (double pValor, String pObservacao)    //OK
   {
     boolean resposta = false;
     if((this.saldoTotal) >= pValor){
          this.saldo -= pValor;
          this.saldoTotal -= pValor;
          resposta = true;
     } else if(this.saldo < 0.00 && this.chequeEspecial >= pValor){
          this.chequeEspecial -= pValor;
          this.saldoTotal -= pValor;
          resposta = true;
     } else{
          resposta = false;
     }
     if(resposta)
     {
          if(pObservacao != "")
          System.out.println("Foi realizado o saque no valor de: R$"+String.format("%.2f",pValor));
          else
          System.out.println("Foi realizado o pagamento no valor de: R$"+String.format("%.2f",pValor));
     } else{
          System.out.println("Operacao nao realizada.");
     }
     usarChequeEspecial();
   }
   public void pagarBoleto (double pValor)   //OK
   {
        sacar(pValor, "Modalidade: Pagamento");
   }
   
   public void checarContaNegativa ()   //OK
   {
        if(this.saldo < 0.00 && this.isUsingChequeEspecial == false)
        {
            this.isUsingChequeEspecial = true;
        }
   }
   public void cobrarTaxa (double pValor)    //OK
   {
        double taxa = pValor * 0.2;
        this.taxasCobradas += taxa;
        System.out.println("Foi cobrado a taxa no valor de: R$"+String.format("%.2f",taxa)+",\n com base no valor de: R$"+String.format("%.2f",pValor)+".");
   }
   public void usarChequeEspecial ()    //OK
   {
        checarContaNegativa();
        if(this.saldo < 0.00 && this.isUsingChequeEspecial == true)
        {
            this.chequeEspecial += this.saldo;
            cobrarTaxa(this.saldo * -1);
        }
   }
}
