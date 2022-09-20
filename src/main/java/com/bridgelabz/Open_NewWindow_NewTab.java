package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Open_NewWindow_NewTab
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("title first : " +driver.getTitle());

        // open new tab -
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        System.out.println("title second : " +driver.getTitle());

        // window handles -
       Set<String> wh=  driver.getWindowHandles();
        List <String> handles = new ArrayList<String>();
        handles.addAll(wh);

        driver.close();

        driver.switchTo().window(handles.get(0));  // switch to google
        System.out.println("title third : " +driver.getTitle());

    }
}
