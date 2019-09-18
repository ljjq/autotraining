package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyDriver {
    private static WebDriver driver;

    static String browser;

<<<<<<< HEAD
            case "chrome":
                System.setProperty("webdriver.chrome.driver","/Users/user/Documents/chromedriver");
                driver = new ChromeDriver();
                break;
       }
=======
    public MyDriver(String browser){
        this.browser = browser;
>>>>>>> a04a911663d4634483c45116c5a2ae0d0489b5d0
    }
    public static WebDriver getDriver(){
        if (driver == null) {
            switch (browser) {
                case "remoteFirefox":
                    try {
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "/Users/leidy.jaramillo/Documents/Chromedriver.exe");
                    driver = new ChromeDriver();
                    System.out.println("Creando driver");
                    break;
            }
        }
        return driver;
    }
}
