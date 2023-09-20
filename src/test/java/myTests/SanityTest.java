package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTest {
    @Test
    public void sanityTest1(){
        System.out.println("This is a sanity test 1");
        Assert.assertTrue(false);
    }

    @Test
    public void sanityTest2(){
        System.out.println("This is a sanity test 1");
        Assert.assertTrue(true);
    }
}
