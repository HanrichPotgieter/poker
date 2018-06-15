package deck;

import card.Card;
import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;
import shuffler.BasicSuffler;
import shuffler.CardShuffler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;

public class Deck {
    private ArrayList<Card> cards;
    private CardShuffler suffler = new BasicSuffler();


    public void printDeck(){
        cards.forEach((card)->{
            System.out.println(card.toString());
        });
        System.out.println("Deck Size: " + cardCount());
    }

    private Deck(DeckBuilder cardDeckBuilder){
        this.cards = cardDeckBuilder.getCards();

    }

    public Card drawCard(){
        if(cards.size() > 0){
            return cards.remove(0);
        } else {
            return null;
        }

    }

    public void orderBySuit(){
        Collections.sort(cards, Comparator.comparing(Card::getCardRank));

    }

    public void orderByColor(){
        Collections.sort(cards, Comparator.comparing(Card::getCardColor));

    }

    public int cardCount(){
        return cards.size();
    }

    public void setSuffler(CardShuffler suffler) { this.suffler = suffler; }

    public void shuffle(){ cards = this.suffler.shuffle(cards); }

    public static class DeckBuilder {
        public ArrayList<Card> getCards() {
            return cards;
        }

        private ArrayList<Card> cards = new ArrayList<>();
        private ArrayList<CardSuit> cardSuits = new ArrayList<>();
        private ArrayList<CardColor> cardColors = new ArrayList<>();
        private ArrayList<CardRank> cardRanks = new ArrayList<>();

        public DeckBuilder() {}

        public DeckBuilder setSuits(ArrayList<CardSuit> cardSuits){
            this.cardSuits = cardSuits;
            return this;
        }

        public DeckBuilder setColors(ArrayList<CardColor> cardColors){
            this.cardColors = cardColors;
            return this;
        }

        public DeckBuilder setRanks(ArrayList<CardRank> cardRanks){
            this.cardRanks = cardRanks;
            return this;
        }

        public Deck build(){
            addCardsForSuit();
            return new Deck(this);
        }

        private void addCard(Card card){
            AtomicBoolean contains = new AtomicBoolean(false);
            cards.forEach((cardInList)->{
                if(cardInList.equals(card)){
                    contains.set(true);
                }
            });
            if(!contains.get()){
                cards.add(card);
            }
        }

        private CardColor getColor(CardSuit cardSuit){
            if(cardSuit == CardSuit.CLUBS || cardSuit == CardSuit.SPADES){
                return CardColor.BLACK;
            }else {
                return CardColor.RED;
            }
        }

        private void addCardsForSuit() {
            cardRanks.forEach((r)->{
                cardSuits.forEach((s)->{
                    try {
                        CardColor cardColor = getColor(s);
                        if(cardColors.contains(cardColor)) {
                            Card card = new Card.CardBuilder().setCardColor(getColor(s)).setCardRank(r).setCardSuit(s).build();
                            addCard(card);
                        }
                    } catch (Exception e){
                        System.out.println(e.getLocalizedMessage());
                    }
                });
            });

        }

    }

}