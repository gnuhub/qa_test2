package com.gnuhub.seleniumtest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {

        String firefoxpath;
        firefoxpath = System.getProperty("firefox");
        System.setProperty("webdriver.firefox.bin", "/Users/stallman/Applications/Firefox.app/Contents/MacOS/firefox");

        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("ibm 大连");
        driver.findElement(By.id("su")).submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String url = driver.findElement(By.linkText("IBM 辽宁大连分公司 - IBM 大连分公司概述 - IBM 中国")).getAttribute("href");
        driver.get(url);
        String text = driver.findElement(By.xpath("//div[@id='ibm-leadspace-head']/div/h1")).getText();
        System.out.println(text);

        assertEquals("IBM 大连分公司", text);
    }
}