package Pages;

import Utilities.Driver;
import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends TestBase {
    public Elements(){//this is a constructor method. and if we put void it will change it to custom method (we are not allowed to put void)
        // and below we are connecting two classes
        PageFactory.initElements(driver,this);
        //it come from selenium class and it links two driver classes
        //(driver) is coming from Test base class  we can also write as Driver.getDriver()but we already initialized
        //this is pointing Elements class and methods like @FindBy has a driver
    }
    public static @FindBy(xpath = "") // when we insert static here and try to access in test classes we only call the created method name
    WebElement XX;
}
