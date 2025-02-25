package Exercicio2;

import java.util.Scanner;

public class TesteDrive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVamos iniciar o Teste Drive:");
        System.out.println("O que deseja fazer?");
        System.out.println("\nPS: Lembre-se que para fazer qualquer coisa, \n"
                            +"  aconselhamos ligar o carro primeiro!");
        
        int opcao;
        boolean executando = true;
        
        Carro meuCarro = new Carro();

        do{
            showMenu();
            meuCarro.checarPainel();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    meuCarro.acionar(false);
                    break;
                case 2:
                    meuCarro.acionar(true);
                    break;
                case 3:
                    meuCarro.acelerar(meuCarro.getMarcha());
                    break;
                case 4:
                    meuCarro.desacelerar(meuCarro.getMarcha());
                    break;
                case 5:
                    String direcao = escolherDirecao();
                    meuCarro.direcionar(direcao);
                    break;
                case 6:
                    meuCarro.getVelocidade();
                    break;
                case 7:
                    String trocaDeMarcha = trocarMarcha();
                    meuCarro.cambiar(trocaDeMarcha);
                    break;
                case 0:
                    executando = false;
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
        + "\n-1) Ligar o carro:   	        |"
        + "\n-2) Desligar o carro:           |"
        + "\n-3) Acelerar:	                |"
        + "\n-4) Diminuir velocidade:    	|"
        + "\n-5) Virar:	                |"
        + "\n-6) Verificar velocidade:       |"
        + "\n-7) trocar a marcha:            |"
        + "\n-ou 0) para sair do teste.      |"
        + "\n------------------------------"
        + "\n_");
    }

    public static String escolherDirecao ()
    {
        int resposta = 0;
        System.out.println("Virar para qual lado?");
        System.out.println("-1) Esquerda ou 2) Direita?");
        resposta = scanner.nextInt();

        return resposta == 1? "esquerda":"direita";
    }
    public static String trocarMarcha ()
    {
        int resposta = 0;
        System.out.println("-1) Aumentar ou 2) Reduzir?");
        resposta = scanner.nextInt();

        return resposta == 1? "aumentar":"reduzir";
    }
}

// trash
    //teste
    /*
    // meuCarro.checarPainel();
    // meuCarro.acionar();
    // meuCarro.acionar();
    // meuCarro.cambiar("aumentar");
    // meuCarro.acelerar(meuCarro.getMarcha());
    // meuCarro.cambiar("aumentar");
    // meuCarro.cambiar("aumentar");
    // meuCarro.acelerar(meuCarro.getMarcha());
    // meuCarro.direcionar("direita");
    // meuCarro.checarPainel();
    // meuCarro.acelerar("aumentar");
     */