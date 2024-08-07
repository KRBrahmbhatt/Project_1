package Testpackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
    @Test
    public void webloginHome()

    {
        System.out.println("weblogin");
    }

    @Test(groups = {"smoke"})
    public void mobileloginHome()
    {
        System.out.println("mobileloginhome");
    }

    @Test(groups = {"smoke"})
    public void LoginAPIHomeloan()
    {
        System.out.println("loginapihomeloan");
    }

    @BeforeSuite
    public void bfsuite()
    {
        System.out.println("I m No 1");
    }



}
