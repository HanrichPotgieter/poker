package card;


import card.detials.CardColor;
import card.detials.CardRank;
import card.detials.CardSuit;

public class Card {
    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public void setCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    private CardColor cardColor;
    private CardRank cardRank;
    private CardSuit cardSuit;

    private Card(CardBuilder cardBuilder){
        this.cardColor = cardBuilder.getCardColor();
        this.cardRank = cardBuilder.getCardRank();
        this.cardSuit = cardBuilder.getCardSuit();
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
        return "\tColor: " +  cardColor.toString() + "\tRank: " + cardRank.toString() + "\tSuit: " + cardSuit.toString();
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
