package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hidden_Division_PopUp
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try
        {
            driver.get("https://www.busonlineticket.com/");
            driver.findElement(By.xpath("//a[text()='Bus'")).click();
            driver.findElement(By.xpath("(//i[@class='far fa-calendar-alt'])[1]")).click();
            driver.findElement(By.xpath("//a[text()='12'")).click();
        }catch (ElementClickInterceptedException e)
        {
            System.out.println("interceptedException");
        }
    }
}
