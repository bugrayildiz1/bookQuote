package nl.utwente.di.bookQuote;

import org.junit.Assert;
import org.junit.Test;


/**
 * Tests the quoter
 */

public class TestQuoter {
    @Test
    public void testBook1() throws Exception{
        Quoter quoter = new Quoter();
        double price = quoter.getBookPrice("1");
        Assert.assertEquals("Price of Book 1", 10.0, price, 0.0);
    }
}