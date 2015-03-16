package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzzImpl();
    }

    @Test
    public void testFizzify() throws Exception {
        assertEquals("1", fizzBuzz.fizzify(1));
        assertEquals("2", fizzBuzz.fizzify(2));
        assertEquals("Fizz", fizzBuzz.fizzify(3));
        assertEquals("4", fizzBuzz.fizzify(4));
        assertEquals("Buzz", fizzBuzz.fizzify(5));
        assertEquals("Buzz", fizzBuzz.fizzify(10));
        assertEquals("FizzBuzz", fizzBuzz.fizzify(15));
    }
}