package Testpackage;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;


public class day1 {
    @Parameters({"URL","APIKey/username"})
    @Test

    public void Demo(String uname , String key) {
        System.out.println("hello");
        System.out.println(uname);
        System.out.println(key);
    }

    @Test
    public void Second() {
        System.out.println("bye");
        Assert.assertTrue(false);
    }

    @Test
    public void visible()
    {
        System.out.println("visible this in console");
    }


    @AfterSuite
    public void afsuite() {
        System.out.println("last no 1");
    }
}