
import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import deck.CardDeck;

import java.util.ArrayList;

public class Main {
    private static final ArrayList<CardColor> cardColors = new ArrayList<>();
    private static final ArrayList<CardRank> cardRank = new ArrayList<>();
    private static final ArrayList<CardSuit> cardSuit = new ArrayList<>();

    public static void main(String[] args){
        setupDefaults();
        buildDeck();
        System.out.println("Poker Application");
    }

    private static void buildDeck() {
        try {
            CardDeck deck = new CardDeck.CardDeckBuilder().setColors(cardColors).setSuits(cardSuit).setRanks(cardRank).build();
            deck.orderBySuit();
            deck.orderByColor();
            deck.PrintDeck();
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