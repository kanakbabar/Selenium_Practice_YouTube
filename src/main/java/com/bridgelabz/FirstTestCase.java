package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase
{
    public static void main(String[] args)
    {
        // Launch chrome web browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // METHODS  -       findelements, getWindowHandle, getWindowHandles , switchTo

        //  get() / navigate -  Launch facebook page
       // driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");

        // manage -
        driver.manage().window().maximize();

        //  getTitle()  -
         String title = driver.getTitle();
        System.out.println("Title name of the page :" + title);

        // getCurrentUrl() -
        System.out.println("current url is :" + driver.getCurrentUrl());

        // getPageSource() -
        System.out.println("current url is :" + driver.getPageSource());

        // findElement() -
        driver.findElement(By.linkText("Create New Account")).click();

        // sendkey -
        driver.findElement(By.name("firstname")).sendKeys("kanak");

        // close -
        driver.close();

        // quit -
         driver.quit();
    }
}
