import java.util.ArrayList;
import java.util.List;

public class Stack {
    String stackName = "";
    List<Card> stackOfCards= new ArrayList<>();

    public Stack(String stackName) {
        this.stackName = stackName;
    }

    public List<Card> getStackOfCards() {
        return stackOfCards;
    }

    public void setStackOfCards(List<Card> stackOfCards) {
        this.stackOfCards = stackOfCards;
    }
}
