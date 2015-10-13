package bugTesting.bug7;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Bug7Test1 {
    
    int totalWins;
    int totalLosses;
    int winCount;
    int loseCount;
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    @Before
    public void setUp() throws Exception {
        winCount = 4;
        loseCount = 6;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IOException {
        System.out.println(String.format("Win count = %d, Lose Count = %d, %.2f", winCount, loseCount, (float) winCount/(winCount+loseCount)));
        totalWins += winCount;
        totalLosses += loseCount;
        
        boolean isValid = false;
        
        while(isValid != true) {
            String ans = console.readLine();
            if (ans.equals("q")) {
                System.out.println(String.format("Overall win rate = %.1f%%", (float)(totalWins * 100) / (totalWins + totalLosses))); 
                isValid = true;
            }
            else {
                isValid = false;
            }
        }
        if(isValid)
            System.out.println("Program successfully shut down!");
        assertTrue(isValid);
    }

}
