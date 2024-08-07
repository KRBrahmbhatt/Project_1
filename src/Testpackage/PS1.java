package Testpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 {

    public void method()
   {
       System.out.println("Run this");
   }
    @BeforeMethod
    public void beforrun()
    {
        System.out.println("First run this");
    }

    @AfterMethod
    public void afterrun()
    {
        System.out.println("After execution run this");
    }
}
