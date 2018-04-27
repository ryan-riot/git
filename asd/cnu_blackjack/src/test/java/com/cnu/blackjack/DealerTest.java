package com.cnu.blackjack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;

public class DealerTest {

    @Test
    public void 딜러는_17에서_24사이가_나온다() {
        Dealer dealer = new Dealer();
        int dealerScore = dealer.getDealerScore();
        assertThat(dealerScore, lessThan(24));
        assertThat(dealerScore, greaterThanOrEqualTo(17));
    }
}
