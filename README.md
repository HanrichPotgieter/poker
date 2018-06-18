## This application has the following features.
1.  Simulate suffling a standard deck of 52 cards
2.  Deals a hand of 5 cards to the player.
3.  Evaluates the players hand.

## Creating a cards.

```java
  Card card = new Card.CardBuilder().setCardColor(cardColor).setCardRank(cardRank).setCardSuit(cardSuit).build();
```

## Creating a deck of cards

```java
    private static final ArrayList<CardColor> cardColors = new ArrayList<>();
    private static final ArrayList<CardRank> cardRank = new ArrayList<>();
    private static final ArrayList<CardSuit> cardSuit = new ArrayList<>();
    //Colors
    cardColors.add(CardColor.RED);
    //Rank
    cardRank.add(CardRank.ACE);
    //Suits
    cardSuit.add(CardSuit.CLUBS);
    
   Deck deck = new Deck.DeckBuilder().setColors(cardColors).setRanks(cardRank).setSuits(cardSuit).build();
```

This will create a deck with only one card.