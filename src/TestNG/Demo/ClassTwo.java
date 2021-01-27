package TestNG.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {

    @BeforeTest
    public void beforemytest()
    {
        System.out.println("beforemytest");
    }

    @AfterTest
    public void aftermytest()
    {
        System.out.println("aftermytest");
    }



    @Test
    public void ClassTwoTest1()
    {
        System.out.println("ClassTwoTest1");
    }

    @Test
    public void ClassTwoTest2()
    {
        System.out.println("ClassTwoTest2");
    }

    @Test
    public void ClassTwoTest3()
    {
        System.out.println("ClassTwoTest3");
    }

}
