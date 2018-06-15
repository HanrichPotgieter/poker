package card;

import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void checkCardCreation() throws Exception {
        CardColor cardColor = CardColor.RED;
        CardRank cardRank = CardRank.ACE;
        CardSuit cardSuit = CardSuit.CLUBS;

        Card card = new Card.CardBuilder()
                .setCardColor(cardColor)
                .setCardRank(cardRank)
                .setCardSuit(cardSuit)
                .build();

        assertEquals(cardColor, card.getCardColor());
        assertEquals(cardRank, card.getCardRank());
        assertEquals(cardSuit, card.getCardSuit());
    }

}