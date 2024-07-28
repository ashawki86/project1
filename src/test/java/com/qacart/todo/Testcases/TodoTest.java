package com.qacart.todo.Testcases;

import com.qacart.todo.Factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodoTest {
   WebDriver driver = new DriverFactory().InitializeDriver();
    @Test
    public void UserAbleToAddNewTask(){

        driver.get("https://qacart-todo.herokuapp.com/login");

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("ashawki86@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Aa123456#");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        String ActualResult =  driver.findElement(By.cssSelector("[data-testid=\"todo-text\"]")).getText();

        Assert.assertEquals(ActualResult,"Learn Selenium");
      //  driver.quit();


    }

    @Test
    public void UserAbleToDeleteATask(){

        driver.get("https://qacart-todo.herokuapp.com/login");

        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("ashawki86@gmail.com");
        driver.findElement(By.cssSelector("[data-testid=\"password\"]")).sendKeys("Aa123456#");
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"add\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid=\"submit-newTask\"]")).click();
        driver.findElement(By.cssSelector("[data-testid=\"delete\"]")).click();

        boolean NoTodoMessage =  driver.findElement(By.cssSelector("[data-testid=\"no-todos\"]")).isDisplayed();
        Assert.assertTrue(NoTodoMessage);

       // driver.quit();
    }


}
