package bugTesting.bug6;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Bug6Test1 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        int testInt = 5;
        
        boolean b1 = function1(testInt);
        boolean b2 = function2(testInt);
        
        assertEquals(b1, b2);
    }
    
    public boolean function1(int i) {
        if(i > 1)
            return true;
        else
            return false;
    }
    
    public boolean function2(int i) {
        if(i > 1)
            return true;
        else
            return false;
    }

}
