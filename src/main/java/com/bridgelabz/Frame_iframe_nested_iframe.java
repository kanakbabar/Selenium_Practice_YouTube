package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_iframe_nested_iframe
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        //switch to parent frame (iframe1) -
        driver.switchTo().frame("frame1");
        //switch child or inner frame3 -
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();

        //switch to parent frame -
        driver.switchTo().parentFrame();
        driver.findElement(By.tagName("input")).sendKeys("kanak");


        //switch to main page -
        driver.switchTo().defaultContent();
        //switch to frame2 -
        driver.switchTo().frame("frame2");
       WebElement a = driver.findElement(By.id("animals"));
        Select dropdown = new Select(a);
        dropdown.selectByVisibleText("Avtar");

    }
}
