package TestNG.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {

    @Test
    public void ClassThreeTest1()
    {
        System.out.println("ClassThreeTest1");
    }

    @Test (groups = "email") /*(enabled = false)*/
    public void ClassThreeTest2()
    {
        System.out.println("ClassThreeTest2");
    }

    @Test
    public void ClassThreeTest3()
    {
        System.out.println("ClassThreeTest3");
    }


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


}
