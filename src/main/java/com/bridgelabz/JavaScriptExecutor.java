package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Index");

        // type text in text box -
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('Search_Data').value='Aliya';");

        /*//To click on button -
        WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
        js.executeScript("arguments[0].click();",element);

        // refresh browser -
        js.executeScript("history.go(0)");

        // to get domain name -
       String domain =  js.executeScript("return document.domain;").toString();
        System.out.println("domain name - " + domain);

        // to get title -
        String title =  js.executeScript("return document.title;").toString();
        System.out.println("title  - " + title);

        // get url -
        String url =  js.executeScript("return document.URL;").toString();
        System.out.println("url  - " + url);

        // draw border around element -
        WebElement element1 = driver.findElement(By.xpath("//input[@value='Find']"));
        js.executeScript("arguments[0].style.border = '3px solid red';",element1);

        // to zoom page -
        js.executeScript("document.body.style.zoom = '50%' ");

        //get height widht of web page -
        System.out.println("Height :" + js.executeScript("return window.innerHeight;").toString());
        System.out.println("Width :" + js.executeScript("return window.innerWidth;").toString());

        // scroll on application -
        // vertically  till end
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //vertically till up
        js.executeScript("window.scrollBy(0,-+document.body.scrollHeight)");

        //generate alert pop -
        js.executeScript("alert('This is my Alert message');");

        // to navigate -
        js.executeScript("window.location ='https://www.google.com'");*/

        //flash webelement -
        WebElement element2 = driver.findElement(By.xpath("//input[@value='Find']"));
        String  clr = element2.getCssValue("backgroundColor");
        for (int i=0;i<50;i++)
        {
            js.executeScript("arguments[0].style.backgroundColor='#000000'",element2);
            try
            {
               Thread.sleep(40);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].style.backgroundColor='" + clr+"'",element2);
            try
            {
                Thread.sleep(40);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
