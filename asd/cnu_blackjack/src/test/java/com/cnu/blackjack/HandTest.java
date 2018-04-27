package com.cnu.blackjack;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HandTest {

    @Test
    public void 핸드는_카드를_한장씩_받을수_있다() {
        Hand hand = new Hand(new Deck(1));
        hand.drawCard();
        List<Card> currentCardList = hand.getCardList();
        assertThat(currentCardList.size(), is(1));

        hand.drawCard();
        currentCardList = hand.getCardList();
        assertThat(currentCardList.size(), is(2));
    }
}
