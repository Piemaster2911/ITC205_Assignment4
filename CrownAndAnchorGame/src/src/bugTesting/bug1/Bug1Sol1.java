package bugTesting.bug1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import diceProjectOriginal.Dice;
import diceProjectOriginal.DiceValue;
import diceProjectOriginal.Player;

public class Bug1Sol1 {
    
    Player player;
    DiceValue pick;
    int bet;
    
    List<Dice> dice;

    @Before
    public void setUp() throws Exception {
        player = new Player("Bob", 100);
        bet = 5;
        
    }

    

    @Test
    public void test() throws IOException {
        for(int i = 0; i < 20; i++) {
            pick = DiceValue.getRandom();
            dice = new ArrayList<Dice>();
            
            Dice d1 = new Dice();
            Dice d2 = new Dice();
            Dice d3 = new Dice();
            
            dice.add(d1);
            dice.add(d2);
            dice.add(d3);
            
            if (player == null) throw new IllegalArgumentException("Player cannot be null.");
            if (pick == null) throw new IllegalArgumentException("Pick cannot be negative.");
            if (bet < 0) throw new IllegalArgumentException("Bet cannot be negative.");
    
            
            System.out.println("Player preparing to place bet! Balance: " + player.getBalance());
            
            player.takeBet(bet);
            
            System.out.println("Player places bet! Balance (including bet reduction): " + player.getBalance());
                
            int matches = 0;
            for ( Dice d : dice) {
                d.roll();
                if (d.getValue().equals(pick)) { 
                    matches += 1;
                }
            }
            
            System.out.println("Player picks " + pick.toString() + ", dice result values: " 
            + dice.get(0).getValue() + ", " + dice.get(1).getValue() + ", " + dice.get(2).getValue());
            
            int winnings = matches * bet;
    
            if (matches > 0) {          
                player.receiveWinnings(winnings);
            }
            
            // the solution line
            winnings -= bet;
            
            System.out.println("Winnings: " + winnings + ", balance: " + player.getBalance());
            }
    }

}
