
import Hand.Hand;
import deck.Deck;
import shuffler.BasicSuffler;

public class Main extends DefaultSetup {

    private static final String SHUFFLING = "Shuffling...";
    private static final int TIMES_TO_SUFFLE = 3;
    private static final int CARDS_TO_DRAW = 5;
    private static final int START_INDEX = 0;
    private static Deck deck;
    private static Hand hand;

    public static void main(String[] args){

        setupDefaults();
        buildDeck();
        suffleDeck(deck);
        hand = new Hand();
        addCardsToPlayerHand();
        System.out.println("CARDS IN DECK");
        deck.printDeck();
        System.out.println("CARDS IN HAND");
        System.out.println(hand.toString());
        System.out.println("YOU HAVE A");
        System.out.println(hand.evaluate());

    }

    private static void addCardsToPlayerHand() {
        for(int i = START_INDEX; i < CARDS_TO_DRAW; i++){ Main.hand.addCard(Main.deck.drawCard()); }
    }

    private static void suffleDeck(Deck deck) {
        deck.setSuffler(new BasicSuffler());
        for(int i = 0; i < TIMES_TO_SUFFLE; i++){
            System.out.println(SHUFFLING);
            deck.shuffle();
        }
    }

    private static void buildDeck() {
        try {
            deck = new Deck.DeckBuilder().setColors(cardColors).setSuits(cardSuit).setRanks(cardRank).build();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}