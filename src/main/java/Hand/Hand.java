package Hand;

import card.Card;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

import static codes.derive.foldem.Poker.board;
import static codes.derive.foldem.Poker.evaluator;
import static codes.derive.foldem.Poker.hand;

import codes.derive.foldem.board.Board;
import codes.derive.foldem.eval.Evaluator;


public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){

    }

    public void AddCard(Card card){
        cards.add(card);
    }

    public boolean isEmpty(){
        return cards.size() < 1;
    }

    public Card RemoveCard(int i){ return cards.get(i); }

    public String evaluate(){
        Evaluator eval = evaluator();

        String handShortCode = buildHandString();
        System.out.println(handShortCode.substring(0,4));
        System.out.println(handShortCode.substring(4,handShortCode.length()));


        Board board = board(handShortCode.substring(0,6));
        codes.derive.foldem.Hand hand = hand(handShortCode.substring(6,handShortCode.length()));

        return eval.value(hand, board).toString();
    }

    private String buildHandString() {
        AtomicReference<String> handShortCode = new AtomicReference<>("");
        cards.forEach((card)->{
            handShortCode.updateAndGet(v -> v + card.getValueToChar() + card.getSuitToChar());
        });
        return handShortCode.get();
    }

}
