package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Tag and ID  -
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        // Tag and attribute -
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");

        // Tag and class -
        driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();

       /* //tag , class and attribute -
        String ch = driver.getWindowHandle();
        driver.switchTo().window(ch);
        driver.findElement(By.cssSelector("button.btn[name='add-to-cart-sauce-labs-backpack']")).click();


        // sub-string - tag[attribite^$*=substring]
        driver.findElement(By.cssSelector("button[name^=add-to-cart-sauce-labs")).click();

        driver.findElement(By.cssSelector("button[name$=sauce-labs-backpack]")).click();*/


        driver.findElement(By.cssSelector("button[name*=backpack")).click();

    }
}

