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
    	String firefoxpath;
    	String sugarurl;
    	sugarurl = System.getProperty("sugarurl");
    	firefoxpath = System.getProperty("firefox");
        System.setProperty("webdriver.firefox.bin", firefoxpath);
        WebDriver driver;
    	driver = new FirefoxDriver();
    	driver.get(sugarurl);
    }
}
