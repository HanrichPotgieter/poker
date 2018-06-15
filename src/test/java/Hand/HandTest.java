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
    public static final String FLUSH = "FLUSH";
    public static final String STRAIGHT = "STRAIGHT";
    public static final String THREE_OF_A_KIND = "THREE_OF_A_KIND";
    public static final String TWO_PAIR = "TWO_PAIR";
    public static final String ONE_PAIR = "PAIR";
    public static final String HIGH_CARD = "HIGH_CARD";

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

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupFourOfAKind() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.DIAMONDS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.SPADES).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FIVE).setCardSuit(CardSuit.HEARTS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.CLUBS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupFullHouse() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.SPADES).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.HEARTS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SIX).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.KING).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.KING).setCardSuit(CardSuit.HEARTS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupFlush() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.JACK).setCardSuit(CardSuit.DIAMONDS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.NINE).setCardSuit(CardSuit.DIAMONDS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.EIGHT).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.FOUR).setCardSuit(CardSuit.DIAMONDS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.THREE).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupStraight() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.JACK).setCardSuit(CardSuit.HEARTS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.TEN).setCardSuit(CardSuit.DIAMONDS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.NINE).setCardSuit(CardSuit.CLUBS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.EIGHT).setCardSuit(CardSuit.DIAMONDS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupThreeOfAKind() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.HEARTS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.EIGHT).setCardSuit(CardSuit.DIAMONDS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupTwoPair() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.HEARTS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.THREE).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.THREE).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }

    public void setupOnePair() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.CLUBS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.HEARTS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.TWO).setCardSuit(CardSuit.DIAMONDS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.THREE).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
    }


    public void setupHighCard() throws Exception{
        hand = new Hand();
        Card jackOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.NINE).setCardSuit(CardSuit.HEARTS).build();
        Card tenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.QUEEN).setCardSuit(CardSuit.CLUBS).build();
        Card nineOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.TWO).setCardSuit(CardSuit.HEARTS).build();
        Card eightOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.THREE).setCardSuit(CardSuit.CLUBS).build();
        Card sevenOfClubs = new Card.CardBuilder().setCardColor(CardColor.BLACK).setCardRank(CardRank.SEVEN).setCardSuit(CardSuit.DIAMONDS).build();

        hand.addCard(jackOfClubs);
        hand.addCard(tenOfClubs);
        hand.addCard(nineOfClubs);
        hand.addCard(eightOfClubs);
        hand.addCard(sevenOfClubs);
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

    @Test
    public void checkFlush() throws Exception{
        setupFlush();
        assertEquals(FLUSH, hand.evaluate());

    }

    @Test
    public void checkStraight() throws Exception{
        setupStraight();
        assertEquals(STRAIGHT, hand.evaluate());

    }

    @Test
    public void checkThreeOfAKind() throws Exception{
        setupThreeOfAKind();
        assertEquals(THREE_OF_A_KIND, hand.evaluate());

    }


    @Test
    public void checkTwoPair() throws Exception{
        setupTwoPair();
        assertEquals(TWO_PAIR, hand.evaluate());

    }

    @Test
    public void checkOnePair() throws Exception{
        setupOnePair();
        assertEquals(ONE_PAIR, hand.evaluate());

    }

    @Test
    public void checkHighCard() throws Exception{
        setupHighCard();
        assertEquals(HIGH_CARD, hand.evaluate());

    }


}