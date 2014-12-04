package com.gnuhub.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.firefox.bin", "/Users/stallman/Applications/Firefox.app/Contents/MacOS/firefox");
        WebDriver driver;
    	driver = new FirefoxDriver();
    	driver.get("http://www.baidu.com/");
    }
}
