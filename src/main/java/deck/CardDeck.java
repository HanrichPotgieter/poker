package deck;

import card.Card;
import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;

public class CardDeck {
    private ArrayList<Card> cards;


    public void PrintDeck(){
        cards.forEach((card)->{
            System.out.println(card.toString());
        });
        System.out.println("Deck Size: " + cardCount());
    }

    private CardDeck(CardDeckBuilder cardDeckBuilder){
        this.cards = cardDeckBuilder.cards;

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

    public static class CardDeckBuilder {
        public ArrayList<Card> getCards() {
            return cards;
        }

        private ArrayList<Card> cards = new ArrayList<Card>();
        private ArrayList<CardSuit> cardSuits;
        private ArrayList<CardColor> cardColors;
        private ArrayList<CardRank> cardRanks;

        public ArrayList<CardSuit> getCardSuits() {
            return cardSuits;
        }

        public ArrayList<CardColor> getCardColors() {
            return cardColors;
        }
        public ArrayList<CardRank> getCardRanks() {
            return cardRanks;
        }

        public CardDeckBuilder() {}

        public CardDeckBuilder setSuits(ArrayList<CardSuit> cardSuits){
            this.cardSuits = cardSuits;
            return this;
        }

        public CardDeckBuilder setColors(ArrayList<CardColor> cardColors){
            this.cardColors = cardColors;
            return this;
        }

        public CardDeckBuilder setRanks(ArrayList<CardRank> cardRanks){
            this.cardRanks = cardRanks;
            return this;
        }

        public CardDeck build(){
            addCardsForSuit();
            return new CardDeck(this);
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