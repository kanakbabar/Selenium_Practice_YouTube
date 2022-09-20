package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_BrokenLinks
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // wait for 10 sec -
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");

        // find links -
        List < WebElement> link = driver.findElements(By.tagName("a"));
        int resCode =200;       // 2xx response code valid link
        int brokenLinkCnt =0;
        System.out.println("Total links on the page :" +link.size());
        for (WebElement el : link)
        {
            String url = el.getAttribute("href");
            try
            {
                URL urllink = new URL(url);
                HttpURLConnection huc = (HttpURLConnection) urllink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                resCode= huc.getResponseCode();
                if (resCode >= 400)
                {
                    System.out.println(url + "broken links");
                    brokenLinkCnt++;
                }
            }
            catch (MalformedURLException e)
            {

            }
            catch (Exception e)
            {

            }
        }
        System.out.println("Total broken link on page :" +brokenLinkCnt);
    }
}
