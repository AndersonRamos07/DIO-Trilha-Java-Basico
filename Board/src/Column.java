import java.util.ArrayList;
import java.util.List;

public class Column {
    private String name;
    private List<Card> cards;

    public Column(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard(int cardId) {
        for (Card card : cards) {
            if (card.getId() == cardId) {
                cards.remove(card);
                return card;
            }
        }
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void displayCards() {
        System.out.println("=== " + name + " ===");
        if (cards.isEmpty()) {
            System.out.println("Nenhum card.");
        } else {
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }
}
