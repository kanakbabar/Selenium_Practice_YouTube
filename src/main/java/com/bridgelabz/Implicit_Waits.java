package com.bridgelabz;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicit_Waits
{
    /* There are three type of waits -
    1] implicit wait  - global waits apply on every element
    2] explicit wait
    3] fluent wait
     */



    // implicit wait -
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ebay.in/");
        // implicit wait add
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.findElement(By.linkText("START SELLING")).click();
        Stopwatch watch = null;
        try {
            watch=Stopwatch.createStarted();
            driver.findElement(By.linkText("START SELLING")).click();
        }catch (Exception e)
        {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
        }
    }
}
