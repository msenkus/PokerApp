package org.example;

import org.junit.jupiter.api.Test;

class TexasHoldemTest {

    @Test
    public void test(){
        Player p1 = new Player();
        Player p2 = new Player();
        TexasHoldem game = new TexasHoldem(p1, p2);
    }

}