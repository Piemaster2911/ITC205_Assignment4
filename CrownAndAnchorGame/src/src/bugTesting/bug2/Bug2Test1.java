package bugTesting.bug2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Bug2Test1 {
    int amount;
    int balance;
    int limit;

    @Before
    public void setUp() throws Exception {
        amount = 5;
        balance = 5;
        limit = 0;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAmountAt5() {
        // Let's replicate the balanceExceedLimitBy(int amount) function
        System.out.println("Balance: " + balance + ", amount: " + amount + ", limit: " + limit);
        
        System.out.println("Now checking boolean state if balance is above limit");
        if(balance > limit)
            System.out.println("Balance is above limit");
        else
            System.out.println("Balance is not above limit");
        
        System.out.println("Now performing balance - amount...");
        
        balance -= amount;
        
        System.out.println("Balance: " + balance);
        
        System.out.println("Now checking boolean state if balance is above limit");
        
        boolean isValid = false;
        
        if(balance > limit)
            System.out.println("Balance is above limit");
            
        else {
            System.out.println("Balance is not above limit");
            isValid = true;
        }
        
        System.out.println("Test ended...\n");
        
        assertTrue(isValid);
        
    }
    
    @Test
    public void testAmountAt0() {
        amount = 0;
        // Let's replicate the balanceExceedLimitBy(int amount) function
        System.out.println("Balance: " + balance + ", amount: " + amount + ", limit: " + limit);
        
        System.out.println("Now checking boolean state if balance is above limit");
        if(balance > limit)
            System.out.println("Balance is above limit");
        else
            System.out.println("Balance is not above limit");
        
        System.out.println("Now performing balance - amount...");
        
        balance -= amount;
        
        System.out.println("Balance: " + balance);
        
        System.out.println("Now checking boolean state if balance is above limit");
        
        boolean isValid = false;
        
        if(balance > limit) {
            System.out.println("Balance is above limit");
            isValid = true;
        }
        else
            System.out.println("Balance is not above limit");

        
        System.out.println("Test ended...\n");
        
        assertTrue(isValid);
        
    }

}
