package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Iframe2
{
    public static void main(String[] args)
    {
        // suppose we have multiple iframe the we come in main page after move another iframe
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.summary.html");

        // switch to 1st frame -
        WebElement ele = driver.findElement(By.name("packageListFrame"));
        driver.switchTo().frame(ele);
        driver.findElement(By.linkText("org.openqa.selenium")).click();


        //switch to main page -
        driver.switchTo().defaultContent();


        // switch to 2nd frame -
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Alert")).click();


        // find and print total iframe on web page -
        driver.switchTo().defaultContent();    // go to main page
        int n = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total no of iframe on web page :" + n);

    }
}
