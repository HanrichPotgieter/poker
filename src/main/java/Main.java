
import Hand.Hand;
import deck.Deck;
import shuffler.BasicSuffler;

public class Main extends DefaultSetup {

    public static final String SHUFFLING = "Shuffling...";
    private static Deck deck;

    public static void main(String[] args){

        setupDefaults();
        buildDeck();
        deck.setSuffler(new BasicSuffler());
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

}