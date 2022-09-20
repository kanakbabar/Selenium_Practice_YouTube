package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement ele = driver.findElement(By.id("input-country"));
        Select dropdown = new Select(ele);

        // SelectByVisibleText() -
        dropdown.selectByVisibleText("Germany");
        Thread.sleep(3000);
        dropdown.deselectByVisibleText("Germany");

        //SelectByValue() -
        //dropdown.selectByValue("131");

        //selectByIndex() - start from 0
        //dropdown.selectByIndex(131);

        // multiple selection -
       /* if(dropdown.isMultiple())
        {
            System.out.println("dropdown is multiple");
        }
        else
        {
            System.out.println("dropdown is not multiple");
        }*/


        // to get all option in dropdown -
       /* List <WebElement> all = dropdown.getOptions();

        System.out.println("total size : "+ all.size());
        for (WebElement el : all)
        {
            System.out.println(el.getText());

       }*/
    }
}
