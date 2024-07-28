package com.qacart.todo.Testcases;

import com.qacart.todo.Base.BaseTest;
import com.qacart.todo.Factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Base64;

public class LoginTest extends BaseTest {

    @Test
    public void LoginWithValidEmailAndValidPassword(){

        driver.get("https://qacart-todo.herokuapp.com/login");

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("ashawki86@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Aa123456#");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

        boolean WelcomeMessage = driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();

        Assert.assertTrue(WelcomeMessage);



    }
}
