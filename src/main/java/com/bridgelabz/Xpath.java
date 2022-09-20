package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        // single attribute (relative)
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        // multiple attribute (relative)
        driver.findElement(By.xpath("//input[@id='password'][@placeholder='Password'][@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        // and
        String cwh = driver.getWindowHandle();
        driver.switchTo().window(cwh);
        //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
        // or
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' or @name='add-to-cart-sauce-backpack']")).click();

        // contains -
        driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");

        //start-with
        driver.findElement(By.xpath("//input[starts-with(@name,'user-name')]")).sendKeys("standard_user");

        //text
        driver.findElement(By.xpath("//*[text()='Accepted usernames are:']"));

        //position
        driver.findElement(By.xpath("//input[@type='text'][position()=2]")).sendKeys("kanak");

        //last
        driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("kanak");
    }
}
