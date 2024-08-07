package Testpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class day2 {
    @AfterTest
    public void aftertestexe()
    {
        System.out.println("Last execution");
    }

    @Test(groups = {"smoke"})

    public void third() {
        System.out.println("Hey");
    }

    @BeforeTest
    public void prerequiste()
    {
        System.out.println("first run this after you can rum rest thing");
    }
}