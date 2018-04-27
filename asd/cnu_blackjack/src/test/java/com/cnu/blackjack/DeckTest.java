package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoMoreCardException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeckTest {

    @Test
    public void Deck2개_총카드수는_104장의카드_성공() {
        Deck deck = new Deck(2);
        assertThat(deck.getTotalCard(), is(104));
    }

    @Test
    public void Deck5개_총카드수는_260장의카드_성공() {
        Deck deck = new Deck(5);
        assertThat(deck.getTotalCard(), is(260));
    }

    @Test
    public void Deck1개_하나의카드뽑으면_51장의카드남음_성공() {
        Deck deck = new Deck(1);
        deck.drawCard();
        assertThat(deck.getTotalCard(), is(51));
    }

    @Test(expected = NoMoreCardException.class)
    public void Deck1개_카드가_없으면_NoMoreCardException() {
        Deck deck = new Deck(1);
        int count = deck.getTotalCard();
        for (int i = 0; i < count; i++) {
            System.out.println(deck.drawCard());
        }
        deck.drawCard();
    }
}
