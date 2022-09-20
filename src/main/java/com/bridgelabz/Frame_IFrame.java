package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_IFrame
{
    public static void main(String[] args)
    {
        // 3 type to switch iframe -by id,index,webelementor name
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       /* driver.get("https://www.rediff.com/");

        // switch to iframe - by id
        driver.switchTo().frame("moneyiframe");
       String v = driver.findElement(By.id("nseindex")).getText();
        System.out.println(v);*/



       // we have multiple iframe then they start 0 index
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.summary.html");

        /* // switch to first frame - by index,name
       // driver.switchTo().frame(0);                            // by index
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();*/


        // By webelement -
        WebElement ele = driver.findElement(By.name("packageListFrame"));
        driver.switchTo().frame(ele);
        driver.findElement(By.linkText("org.openqa.selenium")).click();

    }
}
