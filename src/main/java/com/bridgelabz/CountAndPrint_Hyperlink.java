package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountAndPrint_Hyperlink
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        // To method to use find element findelement and findelements -

        List < WebElement>  link = driver.findElements(By.tagName("a"));
        System.out.println("count of a tag : " +link.size());

        for (WebElement el:link)
        {
            System.out.println(el.getText());
        }
        driver.close();
    }
}
