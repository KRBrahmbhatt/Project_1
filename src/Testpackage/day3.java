package Testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
    @Test(dataProvider = "getData")
    public void weblogin(String username , String password)


    {
        System.out.println("weblogin");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(enabled = false)
    public void mobilelogincarloan()
    {
        System.out.println("mobilelogincarloan");
    }

    @Test(dependsOnMethods = {"weblogin"} )
    public void LoginAPIcarloan()
    {
        System.out.println("loginapicarload");
    }
    @BeforeMethod
    public void beformeth()
    {
        System.out.println("this will be excute in every test in day 3");
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[2][2];
        data[0][0] = "firstusername";
        data[0][1] = "firstuserpassword";

        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";

      //  data[2][0] = "thirdusername";
       // data[2][1] = "thirdpassword";
        return data;

    }

}
