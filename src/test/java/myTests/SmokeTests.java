package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests {
    @Test
    public void smokeTest1(){
        System.out.println("This is a smoke test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void smokeTest2(){
        System.out.println("This is a smoke test 2");
        Assert.assertTrue(true);
    }

    @Test
    public void smokeTest3(){
        System.out.println("This is a smoke test 3");
        Assert.assertTrue(true);
    }
}
