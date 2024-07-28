package com.qacart.todo.Base;

import com.qacart.todo.Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    @BeforeMethod
    public void  setup(){
         driver= new DriverFactory().InitializeDriver();;
    }

    @AfterMethod
    public void Teardown(){
        driver.quit();
    }
}
