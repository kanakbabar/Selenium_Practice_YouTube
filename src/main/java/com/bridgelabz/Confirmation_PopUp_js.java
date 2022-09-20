package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_PopUp_js
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Switchto");
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //switch to alert window and  accept the alert -
        //driver.switchTo().alert().accept();     // click on ok button
        driver.switchTo().alert().dismiss();      // click on cancel button
    }
}
