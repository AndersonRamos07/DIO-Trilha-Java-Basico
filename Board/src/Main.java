import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        int option;

        do {
            System.out.println("\n===== Menu Board =====");
            System.out.println("1. Criar Card");
            System.out.println("2. Mover Card");
            System.out.println("3. Ver Board");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Título: ");
                    String title = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();
                    board.addCard(title, desc);
                    break;

                case 2:
                    board.displayBoard();
                    System.out.print("ID do Card a mover: ");
                    int cardId = scanner.nextInt();
                    System.out.println("Mover para qual coluna?");
                    board.showColumnOptions();
                    int column = scanner.nextInt();
                    board.moveCard(cardId, column);
                    break;

                case 3:
                    board.displayBoard();
                    break;

                case 0:
                    System.out.println("Encerrando o board...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (option != 0);
    }
}