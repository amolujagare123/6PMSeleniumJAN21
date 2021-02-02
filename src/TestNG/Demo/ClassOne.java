package TestNG.Demo;

import org.testng.annotations.*;

public class ClassOne {



    @BeforeSuite
    public void beforemysuite()
    {
        System.out.println("beforemysuite");
    }

    @AfterSuite
    public void aftermysuite()
    {
        System.out.println("aftermysuite");
    }

    @Test
    public void ClassOneTest1()
    {
        System.out.println("ClassOneTest1");
    }

    @Test (groups = "email")
    public void ClassOneTest2()
    {
        System.out.println("ClassOneTest2");
    }

    @Test
    public void ClassOneTest3()
    {
        System.out.println("ClassOneTest3");
    }

}
