package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class FileUpload
{
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement button = driver.findElement(By.id("file-upload"));
        Actions a= new Actions(driver);
        a.moveToElement(button).click().perform();
        try {
            Runtime.getRuntime().exec("C:/Users/KANAK/OneDrive/Desktop/AutoIT.exe" );
        }catch (IOException e)
        {
          e.printStackTrace();
        }

    }
}
