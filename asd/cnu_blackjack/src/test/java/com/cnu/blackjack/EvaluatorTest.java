package com.cnu.blackjack;

import org.junit.Test;

public class EvaluatorTest {

    @Test
    public void 게임초기화시_모든플레이어는_2장의카드를_받는다() {

    }

    @Test
    public void 각_플레이어는_16이하면_히트한다() {

    }

    @Test
    public void 블랙잭이나오면_2배로_보상받고_해당_플레이어의_턴은_끝난다() {

    }

    @Test
    public void 각_플레이어는_17이상이면_스테이한다() {
	Deck deck = new Deck(1);
	Hand hand = new Hand(deck);
	int result = 0;
	Player player = new Player(5000, hand);
	for(int i = 0; i < hand.getHandList().size(); i++){
		result += hand.getHandList().get(i).getRank();
	}
	if(result >= 17){
		player.stay();
	}
	assertTrue(result < 17);
    }
}
