package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
        if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) // check we navigate to write page or not
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
        driver.close();
    }
}
