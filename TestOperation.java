import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOperation {

    @Test
    public  void testDivision(){
        Operation obj = new Operation();
        assertEquals(2, obj.division(20,10));
    }

    @Test
    public void testAddition(){
        Operation obj = new Operation();
        assertEquals(10, obj.addition(5,5));
    }
  
}
