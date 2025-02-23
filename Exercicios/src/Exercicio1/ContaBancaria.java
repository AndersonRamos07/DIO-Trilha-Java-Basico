package Exercicio1;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um saldo inicial para sua conta:");
        double saldoInicial = scanner.nextDouble();
        scanner.close();

        int opcao = 10;
       
        
        Conta novaConta = new Conta(saldoInicial);
        do{
            opcao = showMenu(novaConta);
        }while(opcao != 0);
        
        /* Conta minha = new Conta(saldoInicial);

        // minha.depositar(250.00);
        // minha.sacar(75.00);
        // minha.getSaldo();
        // minha.getChequeEspecial(1);
        // minha.pagarBoleto(35.00);
        // minha.sacar(25.00);
        // minha.sacar(120.00);
        // minha.getSaldo();
        // minha.sacar(600.00);
        // minha.getSaldo();
        // minha.getTaxasCobradas();
        // minha.getChequeEspecial(0);
        // minha.getChequeEspecial(1);
        */
    }
    public static int showMenu(Conta pConta)
    {
        int resposta = 0;
        System.out.println("\n------------------------------"
                + "\n	      MENU   		|"
                + "\n------------------------------"
                + "\n-1) Consultar saldo:   	        |"
                + "\n-2) Consultar cheque especial:  |"
                + "\n-3) Depositar dinheiro:	        |"                    
                + "\n-4) Sacar dinheiro:    	        |"
                + "\n-5) Pagar um boleto:	        |"
                + "\n-6) Verificar se a conta está   |"
                + "\n usando cheque especial:        |"
                + "\n-ou 7) para sair.               |"
                + "\n------------------------------"
                + "\n_");
        return resposta;
        }

        // System.out.println("---MENU---\n"+
        //     "1) Consultar saldo: \n"+   //getSaldo()
        //     "2) consultar cheque especial: \n"+ //getChequeEspecial()
        //     "3) Depositar dinheiro: \n"+    //depositar()
        //     "4) Sacar dinheiro: \n"+    //sacar()
        //     "5) Pagar um boleto: \n"+   //pagarBoleto()
        //     "6) Verificar se a conta está usando cheque especial:\n"+   //getChequeEspecial(1)
        //     "ou 7) para sair.");
        // System.out.println("Escolha uma das opcoes:");
        // resposta = terminal.nextInt();
        // selecionarOpcao(resposta, pConta);
        // terminal.close();
   // }
    public static void hiddenMenu(Conta pConta)
    {        
        int resposta2 = 0;
        Scanner terminal2 = new Scanner(System.in);
        System.out.println("---OBRIGADO POR UTILIZAR NOSSOS SERVICOS---\n"+
            "8) Retornar ao menu: \n"+   //getSaldo()
            "9) Sair do programa: \n");
            System.out.println("Escolha uma das opcoes:");
            resposta2 = terminal2.nextInt();
            if(resposta2 == 8)
            {
                showMenu(pConta);
            }
            terminal2.close();        
    }
    public static void selecionarOpcao (int pOpcao, Conta pNovaConta)
    {
        switch (pOpcao) {
            case 1:
                pNovaConta.getSaldo();
                break;
            case 2:
                pNovaConta.getChequeEspecial(0);
                break;
            case 3:
                double valorDeposito = getValor();
                pNovaConta.depositar(valorDeposito);
                break;
            case 4:
                double valorSaque = getValor();
                pNovaConta.sacar(valorSaque);
                break;
            case 5:
                double valorBoleto = getValor();
                pNovaConta.pagarBoleto(valorBoleto);
                break;
            case 6:
                pNovaConta.getChequeEspecial(1);
                break;
            case 7:
                hiddenMenu(pNovaConta);        
                break;
        
            default:
                break;
        }
    }
    public static double getValor ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seria o valor? R$");
        double valor = scan.nextDouble();
        scan.close();
        return valor;
    }
}

//todo
/*
 *  - Consultar saldo
    - consultar cheque especial
    - Depositar dinheiro;
    - Sacar dinheiro;
    - Pagar um boleto.
    - Verificar se a conta está usando cheque especial.
 */