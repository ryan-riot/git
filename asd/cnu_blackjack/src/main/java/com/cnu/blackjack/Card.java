package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoSuchRankException;
import lombok.Data;

@Data
public class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        if (rank > 13) {
            throw new NoSuchRankException();
        }
        this.rank = rank;
        this.suit = suit;
    }
}
