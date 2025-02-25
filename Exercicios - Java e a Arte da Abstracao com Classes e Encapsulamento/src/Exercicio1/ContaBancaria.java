package Exercicio1;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um saldo inicial para sua conta:");
        double saldoInicial = scanner.nextDouble();
        
        int opcao;
        boolean executando = true;
        
        Conta novaConta = new Conta(saldoInicial);
        do{
            showMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    novaConta.getSaldo();
                    break;
                case 2:
                    novaConta.getChequeEspecial(0);
                    break;
                case 3:
                double valorDeposito = getValor("Deposito");
                    novaConta.depositar(valorDeposito);
                    break;
                case 4:
                    double valorSaque = getValor("Saque");
                    novaConta.sacar(valorSaque, "");
                    break;
                case 5:
                    double valorBoleto = getValor("Pagamento");
                    novaConta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    novaConta.getChequeEspecial(1);
                    break;
                case 7:
                    executando = hiddenMenu();
                    break;
                // default:
                //     showMenu();
                //     break;
            }
        }while(executando);
        scanner.close();
        
    }
    public static void showMenu()
        {
            System.out.println("\n------------------------------"
            + "\n	      MENU   		|"
            + "\n------------------------------"
            + "\n-1) Consultar saldo:   	        |"
            + "\n-2) Consultar cheque especial:  |"
            + "\n-3) Depositar dinheiro:	        |"
            + "\n-4) Sacar dinheiro:    	        |"
            + "\n-5) Pagar um boleto:	        |"
            + "\n-6) Verificar se a conta está   |"
            + "\n       usando cheque especial:  |"
            + "\n-ou 7) para sair.               |"
            + "\n------------------------------"
            + "\n_");
        }
        
        public static boolean hiddenMenu()
        {
            System.out.println("---OBRIGADO POR UTILIZAR NOSSOS SERVICOS---");
            return false;
        };
        
        public static double getValor (String pModalidade)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Modalidade: "+pModalidade);
            System.out.println("Qual seria o valor? R$");
            double valor = scan.nextDouble();
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
    
    //trash
    /*
    /*
    Conta minha = new Conta(saldoInicial);
    
    minha.depositar(250.00);
    minha.sacar(75.00, "");
    minha.getSaldo();
    minha.getChequeEspecial(1);
    minha.getSaldoTotal();
    minha.pagarBoleto(35.00);
    minha.getSaldoTotal();
    minha.sacar(25.00, "");
    minha.sacar(120.00, "");
    minha.getSaldo();
    minha.sacar(600.00, "");
    minha.getSaldo();
    minha.getTaxasCobradas();
    minha.getChequeEspecial(0);
    minha.getSaldoTotal();
    minha.getChequeEspecial(1);
    -/-
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
    
    //public static void selecionarOpcao (int pOpcao, Conta pNovaConta){}
    //selecionarOpcao(opcao, novaConta);
    //hiddenMenu();
    */