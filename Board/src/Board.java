import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Column> columns;

    public Board() {
        columns = new ArrayList<>();
        columns.add(new Column("To Do"));
        columns.add(new Column("In Progress"));
        columns.add(new Column("Done"));
    }

    public void addCard(String title, String description) {
        Card newCard = new Card(title, description);
        columns.get(0).addCard(newCard); // Always add to "To Do"
        System.out.println("Card criado com sucesso!");
    }

    public void moveCard(int cardId, int toColumnIndex) {
        Card cardToMove = null;
        for (Column column : columns) {
            cardToMove = column.removeCard(cardId);
            if (cardToMove != null) break;
        }

        if (cardToMove != null && toColumnIndex >= 0 && toColumnIndex < columns.size()) {
            columns.get(toColumnIndex).addCard(cardToMove);
            System.out.println("Card movido com sucesso!");
        } else {
            System.out.println("Falha ao mover o card. Verifique o ID e coluna.");
        }
    }

    public void displayBoard() {
        for (Column column : columns) {
            column.displayCards();
            System.out.println();
        }
    }

    public void showColumnOptions() {
        for (int i = 0; i < columns.size(); i++) {
            System.out.println(i + " - " + columns.get(i).getName());
        }
    }
}

