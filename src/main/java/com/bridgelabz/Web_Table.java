package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class Web_Table
{
    public static void main(String[] args)
    {
     WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/Users/KANAK/OneDrive/Desktop/table.html");

       String title = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(title);

        List < WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("total number of rows :" + row.size());

        List <WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("total number of column :"+ column.size());

        for(int r=2;r<=row.size();r++)
        {
            for(int c=1;c<=column.size();c++)
            {
                String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.println(data);

            }
        }
    }
}
