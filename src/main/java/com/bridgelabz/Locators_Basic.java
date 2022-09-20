package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import java.util.List;

public class Locators_Basic
{
    public static void main(String[] args) throws InterruptedException {
        /* Locator - use to identify the elements on web page
             There are two type of locator 1. Basic locators strstegies  2. customized locators strstegies
             1] Basic locators strstegies - by name ,by id ,by class name ,by tag name ,by link text ,by partial link text */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open source demo web page
        driver.get("https://www.saucedemo.com/");

        // username by Id -
       /* driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);*/

        //username by tag name - suppose tag name is same of three element then it execute only
        //                       first element not remaining two element
        driver.findElement(By.tagName("input")).sendKeys("standard_user");

        // password by name -
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);


        //login button by class name -
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(2000);

      // linktext - pass complete text
        String cwh = driver.getWindowHandle();
        driver.switchTo().window(cwh);
       // driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

        // partial link text - give some information in text but text is unique it is not unique then
        // they give first match product
       // driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();


        // findelements - return list of elements
        List <WebElement> elementlist=driver.findElements(By.partialLinkText("Sauce"));
        System.out.println("element size :" +elementlist.size());
    }
}
