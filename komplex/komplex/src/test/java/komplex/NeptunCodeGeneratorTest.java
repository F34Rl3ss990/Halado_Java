package komplex;

import org.junit.Assert;
import org.junit.Test;

public class NeptunCodeGeneratorTest {

    @Test
    public void getNextCounter() {
        NeptunCodeGenerator ncg = new NeptunCodeGenerator();
        ncg.getNextCounter();
        ncg.getNextCounter();
        Assert.assertEquals(2, ncg.getNextCounter());
    }
}