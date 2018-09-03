package testing;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Testing2 {

	public static void main( String[] args ) throws FileNotFoundException
    {
    	final String a ="Hello World";
    	//System.setOut(new PrintStream(a));
        System.out.println( "Hello World!" );
    }
    
    public static String calculate()
    {
    	return "Hello World";
    }
}
