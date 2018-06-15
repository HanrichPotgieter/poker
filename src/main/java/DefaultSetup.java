import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;

import java.util.ArrayList;

public class DefaultSetup {

    protected static final ArrayList<CardColor> cardColors = new ArrayList<>();
    protected static final ArrayList<CardRank> cardRank = new ArrayList<>();
    protected static final ArrayList<CardSuit> cardSuit = new ArrayList<>();

    protected static void setupDefaults() {
        //Colors
        cardColors.add(CardColor.RED);
        cardColors.add(CardColor.BLACK);
        //Rank
        cardRank.add(CardRank.ACE);
        cardRank.add(CardRank.TWO);
        cardRank.add(CardRank.THREE);
        cardRank.add(CardRank.FOUR);
        cardRank.add(CardRank.FIVE);
        cardRank.add(CardRank.SIX);
        cardRank.add(CardRank.SEVEN);
        cardRank.add(CardRank.EIGHT);
        cardRank.add(CardRank.NINE);
        cardRank.add(CardRank.TEN);
        cardRank.add(CardRank.JACK);
        cardRank.add(CardRank.QUEEN);
        cardRank.add(CardRank.KING);
        //Suits
        cardSuit.add(CardSuit.CLUBS);
        cardSuit.add(CardSuit.DIAMONDS);
        cardSuit.add(CardSuit.HEARTS);
        cardSuit.add(CardSuit.SPADES);

    }

}
