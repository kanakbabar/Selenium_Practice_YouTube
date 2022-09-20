package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Date_Picker
{
    public static void main(String[] args)             // not running properly
    {
        String expected_date="6";
        String expected_month="Sep";
        String expected_year="2022";

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        //switch on iframe -
        driver.switchTo().frame(0);
        //find date picker webelement
      WebElement date = driver.findElement(By.id("datepicker"));
      date.click();
      while (true)
      {
         String month = driver.findElement(By.xpath("//span[@class='ui-datepivker-month']")).getText();
          String year = driver.findElement(By.xpath("//span[@class='ui-datepivker-year']")).getText();
          if (month.equals(expected_month) && year.equals(expected_year))
          {
              List <WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
              for (WebElement e:daylist)
              {
                 String calender_date = e.getText();
                 if (calender_date.equals(expected_date))
                 {
                     e.click();
                     break;
                 }
              }
              break;
          }
          else
          {
              driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-traingle-e']")).click();
          }
      }
    }
}
