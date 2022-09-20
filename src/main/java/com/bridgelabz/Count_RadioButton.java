package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Count_RadioButton
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        driver.get("https://www.calculator.net/");

        List < WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total no. of radio buttons on web page :" + radio.size());
        driver.close();
    }
}
