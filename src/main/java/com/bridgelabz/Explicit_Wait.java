package com.bridgelabz;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicit_Wait
{
    public static void main(String[] args)
    {
     //Explicit wait - is web element specific
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ebay.in/");
        WebDriver wait = (WebDriver) new WebDriverWait(driver,10);
        Stopwatch watch = null;
        try {
            watch=Stopwatch.createStarted();
          // WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByLinkText("START SELLING")));
           //w.click();

        }catch (Exception e)
        {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
        }
    }
}
