package com.instagram.signUp;

import org.openqa.selenium.WebDriver;

public class HomePage {
    static WebDriver driver;
    public HomePage(WebDriver webDriver){this.driver = webDriver;}

    public static void open(){
        driver.get("https://www.instagram.com/");
    }
}
