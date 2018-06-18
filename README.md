## This application has the following features.
1.  Simulate suffling a standard deck of 52 cards
2.  Deals a hand of 5 cards to the player.
3.  Evaluates the players hand.

## Creating a cards.

```java
  Card card = new Card.CardBuilder()
                .setCardColor(cardColor)
                .setCardRank(cardRank)
                .setCardSuit(cardSuit)
                .build();
```
