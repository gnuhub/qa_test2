package com.gnuhub.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String firefoxpath;
    	String sugarurl;
    	sugarurl = System.getProperty("sugarurl");
    	firefoxpath = System.getProperty("firefox");
        System.setProperty("webdriver.firefox.bin", firefoxpath);
        WebDriver driver;
    	driver = new FirefoxDriver();
    	driver.get(sugarurl);

        WebElement user_name_input = driver.findElement(By.id("user_name"));
        user_name_input.sendKeys("admin");

        WebElement user_password_input = driver.findElement(By.id("user_password"));
        user_password_input.sendKeys("asdf");

        WebElement btn = driver.findElement(By.id("login_button"));
        btn.click();

    }
}
