package shuffler;

import card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class BasicSuffler extends CardShuffler {
    @Override
    public ArrayList<Card> shuffle(ArrayList<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }
}
