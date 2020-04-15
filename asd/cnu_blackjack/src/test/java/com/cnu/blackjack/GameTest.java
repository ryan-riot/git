package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NotEveyonePlacedBetException;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameTest {

    @Test
    public void 게임은_플레이어를_추가할수_있어야한다() {
        Game game = new Game(new Deck(2));
        game.addPlayer("conch", 5000);
        game.addPlayer("ian", 10000);

        Map<String, Player> playerList = game.getPlayerList();
        assertThat(playerList.size(), is(2));
    }

    @Test(expected = Exception.class)
    public void 게임은_동일이름의_플레이어를_추가할수없다() {
        Game game = new Game(new Deck(2));
        game.addPlayer("conch", 5000);
        game.addPlayer("conch", 5000);
    }

    @Test
    public void 게임은_플레이어생성후_배팅을_할수_있어야한다() {
        Game game = new Game(new Deck(2));
        game.addPlayer("conch", 5000);
        game.placeBet("conch", 3000);

        int playerBalance = game.getPlayerList().get("conch").getBalance();
        assertThat(playerBalance, is(2000));
    }

    @Test(expected = NotEveyonePlacedBetException.class)
    public void 게임은_모든플레이어가_베팅하지않으면_시작할수없다() {
        Game game = new Game(new Deck(2));
        game.addPlayer("conch", 5000);
        game.addPlayer("ian", 5000);
        game.placeBet("conch", 3000);
        game.start();
    }
}
