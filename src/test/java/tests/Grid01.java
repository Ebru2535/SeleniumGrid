package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid01 {
    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        driver=new RemoteWebDriver(new URL("http://192.168.1.108:4444"), new ChromeOptions());

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }




}
