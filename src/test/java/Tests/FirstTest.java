package Tests;
import static Pages.Elements.*; //it will bring(imports) all static variables(elements) from Elements class to this class

import Pages.Elements;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    @BeforeMethod
    public void secondBefore(){
        new Elements();//this method was not static in elements class cz, constructor method can never have static or void word
    }

    @Test
    public void Test1(){//any constructor method can not be static
        //Elements e = new Elements(); //we don't have to create new object and in order to use we just need to call the created variable
        XX.click();
    }
}
