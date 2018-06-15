package shuffler

import card.Card
import java.util.*

class BasicSuffler : CardShuffler() {
    override fun shuffle(cards: ArrayList<Card>?): ArrayList<Card> {
        Collections.shuffle(cards)
        return cards!!;
    }

}