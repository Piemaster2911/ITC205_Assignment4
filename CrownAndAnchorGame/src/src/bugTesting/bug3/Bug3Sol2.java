package bugTesting.bug3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import diceProjectOriginal.Dice;
import diceProjectOriginal.DiceValue;
import diceProjectOriginal.Game;

public class Bug3Sol2 {
    Dice d1;
    Dice d2;
    Dice d3;
    
    Game game;

    List<DiceValue> cdv;

    @Test
    public void test() {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
        
        game = new Game(d1, d2, d3);
        
        cdv = game.getDiceValues();
        
        System.out.println("\nTest Starting...");
        
        for(int i = 0; i < 10; i++) {
            d1 = new Dice();
            d2 = new Dice();
            d3 = new Dice();
            
            game = new Game(d1, d2, d3);
            
            cdv = game.getDiceValues();
            
            System.out.printf("Rolled %s, %s, %s\n",
                    cdv.get(0), cdv.get(1), cdv.get(2));
        }
        
        System.out.println("Test Ending...\n");
    }

}
