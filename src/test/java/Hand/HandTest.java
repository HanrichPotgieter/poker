package Hand;

import card.Card;
import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    public static final String STRAIGHT_FLUSH = "STRAIGHT_FLUSH";
    public static final String FOUR_OF_A_KIND = "FOUR_OF_A_KIND";
    public static final String FULL_HOUSE = "FULL_HOUSE";
    Hand hand = new Hand();
    @Before
    public void setupHand() throws Exception {
        hand = new Hand();

    }
    public void setupStraightFlush() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.JACK).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.TEN).setCardSuit(CardSuit.CLUBS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.NINE).setCardSuit(CardSuit.CLUBS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.EIGHT).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.CLUBS).build();

        hand.AddCard(jackOfClubs);
        hand.AddCard(tenOfClubs);
        hand.AddCard(nineOfClubs);
        hand.AddCard(eightOfClubs);
        hand.AddCard(sevenOfClubs);
    }

    public void setupFourOfAKind() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.DIAMONDS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.SPADES).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.HEARTS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.CLUBS).build();

        hand.AddCard(jackOfClubs);
        hand.AddCard(tenOfClubs);
        hand.AddCard(nineOfClubs);
        hand.AddCard(eightOfClubs);
        hand.AddCard(sevenOfClubs);
    }

    public void setupFullHouse() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.SPADES).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.HEARTS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.KING).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.KING).setCardSuit(CardSuit.HEARTS).build();

        hand.AddCard(jackOfClubs);
        hand.AddCard(tenOfClubs);
        hand.AddCard(nineOfClubs);
        hand.AddCard(eightOfClubs);
        hand.AddCard(sevenOfClubs);
    }

    @Test
    public void checkStraightFlush() throws Exception{
        setupStraightFlush();
        assertEquals(STRAIGHT_FLUSH, hand.evaluate());

    }

    @Test
    public void checkFourOfAKind() throws Exception{
        setupFourOfAKind();
        assertEquals(FOUR_OF_A_KIND, hand.evaluate());

    }

    @Test
    public void checkFullHouse() throws Exception{
        setupFullHouse();
        assertEquals(FULL_HOUSE, hand.evaluate());

    }

}