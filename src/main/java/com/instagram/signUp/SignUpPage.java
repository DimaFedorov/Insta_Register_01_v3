package com.instagram.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.instagram.email.TempEmail;

public class SignUpPage {
    static WebDriver driver;
    public SignUpFacade signUpFacade;
    public SignUpPage(WebDriver webDriver) {this.driver=webDriver;}

    public static By emailOrNumber = By.name("emailOrPhone");
    public static By signUpForm = By.xpath("//span[contains(text(),'Зарегистрироваться')]");
    private static By fullName = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/label[1]/input[1]");
    private static By nickname = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]");
    private static By password = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/label[1]/input[1]");
    private static By confirm = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]");
    private static By submitDate = By.xpath("//button[contains(text(),'Далее')]");
    private static By emailCode = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    private static By submitCode = By.xpath("//button[contains(text(),'Далее')]");



    public static void openSignUpForm(){
        driver.findElement(signUpForm).click();

    }
    public static void fillLogin(String login){
        driver.findElement(emailOrNumber).sendKeys(login);

    }
    public static void fillName(String name){
        driver.findElement(fullName).sendKeys(name);

    }
    public static void fillNickname(String nick){
        driver.findElement(nickname).sendKeys(nick);

    }
    public static void fillPassword(String pass){
        driver.findElement(password).sendKeys(pass);

    }
    public static void clickConfirm(){
        driver.findElement(confirm).click();

    }
    public static void fillBirthDay (Integer day){
        driver.findElement(By.xpath("//option[contains(text(),'" + day + "')]")).click();
    }
    public static void fillBirthMonth(Integer month){
        driver.findElement(By.xpath("//option[contains(@value,'" + month + "')]")).click();
    }
    public static void fillBirthYear (Integer year){
        driver.findElement(By.xpath("//option[contains(text(),'" + year + "')]")).click();
    }
    public static void fillBirthDate(Integer day,Integer month,Integer year){
        fillBirthYear(year);
        fillBirthMonth(month);
        fillBirthDay(day);
    }

    public static void clickSubmitDate(){
        driver.findElement(submitDate).click();
    }

    public static void fillEmailCode(){
        driver.findElement(emailCode).sendKeys(TempEmail.Email().transform(String::toString));
    }

    public static void clickSubmitCode(){
        driver.findElement(submitCode).click();
    }
}
