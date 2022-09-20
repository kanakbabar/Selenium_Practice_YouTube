package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_JSExecutor
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.calculator.net/");
          driver.get("http://www.album.alexflueras.ro/");

        // To scroll down the web page by pixel - vertically
        JavascriptExecutor js = (JavascriptExecutor)driver;
       /* try
        {
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        js.executeScript("window.scrollBy(0,1000)");


        // To scroll down the wen page by the visibility of element -
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'Due Date Calculator')]"));
        js.executeScript("arguments[0].scrollIntoView();",ele);


        // To scroll down the web page at the bottom of the page -
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");*/


        //Horizontal scroll on the web page -
        WebElement element = driver.findElement(By.id("a7"));
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
}
