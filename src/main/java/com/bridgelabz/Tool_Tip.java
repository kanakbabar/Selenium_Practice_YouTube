package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_Tip {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String tool = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
        String expected = "We ask for your age only for statistical purposes.";
        if(tool.equals(expected))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
