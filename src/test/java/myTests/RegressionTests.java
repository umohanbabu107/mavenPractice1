package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTests {
    @Test
    public void regTest1(){
        System.out.println("This is regression test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void regTest2(){
        System.out.println("This is a regression test 2");
        Assert.fail();
    }

    @Test
    public void regTest3(){
        System.out.println("This is regression test 3");
        Assert.assertTrue(true);
    }

    @Test
    public void regTest4(){
        System.out.println("This is regression test 4");
        Assert.assertTrue(true);
    }
    @Test
    public void regTest5(){
        System.out.println("This is regression test 5");
        Assert.assertTrue(true);
    }
}
