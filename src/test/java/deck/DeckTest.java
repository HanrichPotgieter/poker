package deck;

import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class DeckTest {
    private static final ArrayList<CardColor> cardColors = new ArrayList<>();
    private static final ArrayList<CardRank> cardRank = new ArrayList<>();
    private static final ArrayList<CardSuit> cardSuit = new ArrayList<>();
    public static final int EMPTY_CARD_COUNT = 0;
    private static final int DECK_LENGTH = 2;

    @Before
    public void setupTest(){
        setupDefaults();

    }

    @Test
    public void checkDeckCreationEmpty(){
        Deck deck = new Deck.DeckBuilder().build();
        assertEquals(deck.cardCount(), EMPTY_CARD_COUNT);
    }

    @Test
    public void checkDeckCreation(){
        Deck deck = new Deck.DeckBuilder().setColors(cardColors).setRanks(cardRank).setSuits(cardSuit).build();
        assertEquals(deck.cardCount(), DECK_LENGTH);

    }

    private static void setupDefaults() {
        cardColors.clear();
        cardRank.clear();
        cardSuit.clear();
        //Colors
        cardColors.add(CardColor.RED);
        //Rank
        cardRank.add(CardRank.ACE);
        //Suits
        cardSuit.add(CardSuit.CLUBS);
        cardSuit.add(CardSuit.DIAMONDS);
        cardSuit.add(CardSuit.HEARTS);
        cardSuit.add(CardSuit.SPADES);
    }

}