package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot
{
    public static void main(String[] args) throws IOException {
        // ----- full page screenshot -----

        // launch chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        // open url
        driver.get("https://www.facebook.com/");

      /*  //capture screenshot
        //step 1 - convert web driver object to takescreenshot interface
        TakesScreenshot sh = ((TakesScreenshot)driver);

        //step 2 - call getscreenshotas method to create image file
       File src = sh.getScreenshotAs(OutputType.FILE);
       File dest = new File("screenshot/fullpage.png");

       // step 3 - copy image file to destination
        FileUtils.copyFile(src,dest);*/

        // ----- pertucular area screenshot ------
        WebElement section = driver.findElement(By.className("_8ice"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot/section.png");
        FileUtils.copyFile(src,dest);
    }
}
