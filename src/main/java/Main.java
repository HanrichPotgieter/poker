
import Hand.Hand;
import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import deck.Deck;

import java.util.ArrayList;

public class Main {
    private static final ArrayList<CardColor> cardColors = new ArrayList<>();
    private static final ArrayList<CardRank> cardRank = new ArrayList<>();
    private static final ArrayList<CardSuit> cardSuit = new ArrayList<>();
    public static final String SHUFFLING = "Shuffling...";
    private static Deck deck;

    public static void main(String[] args){

        setupDefaults();
        buildDeck();
        System.out.println(SHUFFLING);
        deck.shuffle();
        System.out.println(SHUFFLING);
        deck.shuffle();
        System.out.println(SHUFFLING);
        deck.shuffle();
        Hand hand = new Hand();
        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());
        hand.addCard(deck.drawCard());
        System.out.println("CARDS IN DECK");
        deck.printDeck();
        System.out.println("CARDS IN HAND");
        System.out.println(hand.toString());
        System.out.println("YOU HAVE A");
        System.out.println(hand.evaluate());

    }

    private static void buildDeck() {
        try {
            deck = new Deck.DeckBuilder().setColors(cardColors).setSuits(cardSuit).setRanks(cardRank).build();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setupDefaults() {
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