package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	assertEquals("Hello World",testing.Testing2.calculate());
    	
        //assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithfalse()
    {
    	assertEquals("Hello World1",testing.Testing2.calculate());
    	
        //assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithfalse2()
    {
    	assertEquals("Hello World1",testing.Testing2.calculate());
    	
        //assertTrue( true );
    }
}
