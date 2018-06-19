package card;


import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;

public class Card {
    private static final char INVALID_CHAR = '0';
    private CardColor cardColor;
    private CardRank cardRank;
    private CardSuit cardSuit;

    private Card(CardBuilder cardBuilder){
        this.cardColor = cardBuilder.getCardColor();
        this.cardRank = cardBuilder.getCardRank();
        this.cardSuit = cardBuilder.getCardSuit();
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public char getSuitToChar(){
        switch (cardSuit){
            case CLUBS:
                return 'c';
            case SPADES:
                return 's';
            case DIAMONDS:
                return 'd';
            case HEARTS:
                return 'h';
            default:
                return INVALID_CHAR;
        }
    }

    public char getValueToChar(){
        switch (cardRank){
            case ACE:
                return 'A';
            case TWO:
                return '2';
            case THREE:
                return '3';
            case FOUR:
                return '4';
            case FIVE:
                return '5';
            case SIX:
                return '6';
            case SEVEN:
                return '7';
            case EIGHT:
                return '8';
            case NINE:
                return '9';
            case TEN:
                return 'T';
            case JACK:
                return 'J';
            case QUEEN:
                return 'Q';
            case KING:
                return 'K';
        }
        return INVALID_CHAR;
    }

    @Override
    public boolean equals(Object obj) {
        Card card = (Card) obj;
        return card.getCardRank() == getCardRank()
                && card.getCardColor() == getCardColor()
                && card.getCardSuit() == getCardSuit();
    }

    @Override
    public String toString() {
        return "\tRank: " + cardRank.toString() + "\tSuit: " + cardSuit.toString();
    }

    public static class CardBuilder {
        public CardColor getCardColor() {
            return cardColor;
        }

        public CardRank getCardRank() {
            return cardRank;
        }

        public CardSuit getCardSuit() {
            return cardSuit;
        }

        private CardColor cardColor;
        private CardRank cardRank;
        private CardSuit cardSuit;

        public CardBuilder(){}

        public CardBuilder setCardColor(CardColor cardColor){
            this.cardColor = cardColor;
            return this;
        }

        public CardBuilder setCardRank(CardRank cardRank){
            this.cardRank = cardRank;
            return this;
        }

        public CardBuilder setCardSuit(CardSuit cardSuit){
            this.cardSuit = cardSuit;
            return this;
        }

        public Card build() throws Exception {
            if(this.cardRank == null || this.cardSuit == null || this.cardColor == null)
                throw new Exception("Could not build card");
            return new Card(this);
        }
    }

}
