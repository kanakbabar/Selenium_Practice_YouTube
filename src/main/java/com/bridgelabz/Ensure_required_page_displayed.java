package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ensure_required_page_displayed {
    public static void main(String[] args) {
        // three way to ensure - 1. using title of the page ,2. using URL of the page
        //                         3. using any unique element on the page


        /*// 1] using title of the page -
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Title of page :" + actualTitle);
        String expectedTitle = "Facebook – log in or sign up";
        System.out.println("Expected title :" + expectedTitle);

        if (actualTitle == expectedTitle) { System.out.println("Home page is displayed");}
        else
        { System.out.println("Home page is not displayed");}*/



       /* // 2. using URL of the page
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String url = driver.getCurrentUrl();
        System.out.println("current url of page :" + url);
        String expectedurl = "Facebook ";
        System.out.println("Expected current url :" + expectedurl);
        if (url == expectedurl) { System.out.println("Home page is displayed");}
        else
        { System.out.println("Home page is not displayed");}*/


        //  3. using any unique element on the page
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
        if (loginBtn.isDisplayed()) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }
    }
}