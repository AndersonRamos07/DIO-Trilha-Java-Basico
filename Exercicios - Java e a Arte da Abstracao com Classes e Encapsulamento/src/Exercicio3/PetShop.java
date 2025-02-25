package Exercicio3;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        int teste = 1;
        
        MaquinaDeBanho petMachine = new MaquinaDeBanho();

        do{
            showMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    petMachine.petBanho();
                    break;
                case 2:
                    petMachine.petAbastecimento2L(1);
                    break;
                case 3:
                    petMachine.petAbastecimento2L(2);
                    break;
                case 4:
                    petMachine.getAgua();
                    break;
                case 5:
                    petMachine.getShampoo();
                    break;
                case 6:
                    petMachine.getBanheiraBusy();
                    break;
                case 7:
                    petMachine.petHandle(false);
                    break;
                case 8:
                    petMachine.petHandle(true);
                    break;
                case 9:
                    petMachine.petLimpeza();
                    break;
                // default:
                //     showMenu();
                //     break;
            }
        }while(teste >= 1);
        scanner.close();

    }
    public static void showMenu()
    {
        System.out.println("\n---------------------------------"
        + "\n	       MENU   	          |"
        + "\n---------------------------------"
        + "\n-1) Dar banho no pet:             |"
        + "\n-2) Abastecer com agua:           |"
        + "\n-3) Abastecer com shampoo:	  |"
        + "\n-4) Verificar nivel de agua:      |"
        + "\n-5) Verificar nivel de shampoo:   |"
        + "\n-6) Verificar se tem pet no banho:|"
        + "\n-7) Colocar pet na maquina:       |"
        + "\n-8) Tirar pet da maquina:         |"
        + "\n-ou 9) Limpar maquina.            |"
        + "\n---------------------------------"
        + "\n_");
    }
}


//teste
// petMachine.getBanheiraBusy();
// petMachine.petHandle();
// petMachine.getAgua();
// petMachine.getShampoo();
// petMachine.getBanheiraBusy();
// petMachine.petHandle();
// petMachine.petLimpeza();
// petMachine.petLimpeza();
// petMachine.petLimpeza();
// petMachine.getAgua();
// petMachine.getShampoo();
// petMachine.petAbastecimento2L(1);
// petMachine.petAbastecimento2L(2);
// petMachine.petAbastecimento2L(2);
// petMachine.getAgua();
// petMachine.getShampoo();