
import Hand.Hand;
import deck.Deck;
import shuffler.BasicSuffler;

public class Main extends DefaultSetup {

    public static final String SHUFFLING = "Shuffling...";
    public static final int TIMES_TO_SUFFLE = 3;
    public static final int CARDS_TO_DRAW = 5;
    public static final int START_INDEX = 0;
    private static Deck deck;

    public static void main(String[] args){

        setupDefaults();
        buildDeck();
        deck.setSuffler(new BasicSuffler());
        for(int i = 0; i < TIMES_TO_SUFFLE; i++){
            System.out.println(SHUFFLING);
            deck.shuffle();
        }

        Hand hand = new Hand();

        for(int i = START_INDEX; i < CARDS_TO_DRAW; i++){ hand.addCard(deck.drawCard()); }

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

}