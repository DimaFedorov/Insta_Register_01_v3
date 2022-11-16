package com.instagram.signUp;

import org.openqa.selenium.WebDriver;

public class SignUpFacade {
    public  WebDriver driver;
    private static SignUpPage signUpPage;
    private  HomePage homePage;
    // Builder
    private static String login;
    private static String name;
    private static String nickname;
    private static String password;
    private static Integer day;
    private static Integer month;
    private static Integer year;

    // Getter
    public String getLogin() {return login;}

    public String getName() {return name;}

    public String getNickname() {return nickname;}

    public String getPassword() {return password;}

    public Integer getDay(){return day;}

    public Integer getMonth(){return month;}

    public Integer getYear(){return year;}

    //Getter end
    public static class Builder{
        private SignUpFacade newSignUpFacade;

        public Builder(){
            newSignUpFacade = new SignUpFacade();
        }
        public Builder fillLogin(String login){
            newSignUpFacade.login = login;
            return this;
        }
        public Builder fillName(String name){
            newSignUpFacade.name = name;
            return this;
        }
        public Builder fillNickName(String nickName){
            newSignUpFacade.nickname = nickName;
            return this;
        }
        public Builder fillPassword(String password){
            newSignUpFacade.password = password;
            return this;
        }
        public Builder fillDay(Integer day){
            newSignUpFacade.day=day;
            return this;
        }
        public Builder fillYear(Integer year){
            newSignUpFacade.year=year;
            return this;
        }
        public Builder fillMonth(Integer month){
            newSignUpFacade.month=month;
            return this;
        }
        public Builder fillBirthDate(Integer day,Integer month,Integer year){
            fillYear(year);
            fillMonth(month);
            fillDay(day);
            return this;
        }

        public SignUpFacade build(){
            return newSignUpFacade;
        }
    }
    //Builder end

    public class OpenSignUpForm {
        public void open(){
            homePage.open();
            signUpPage.openSignUpForm();
        }
    }
    public class FillRegisterForm {
        public static void fillRegisterForm(){
                signUpPage.fillLogin(login);
                signUpPage.fillName(name);
                signUpPage.fillNickname(nickname);
                signUpPage.fillPassword(password);
                signUpPage.clickConfirm();
        }
    }
    public class FillDateForm {
        public static void fillDateForm() throws InterruptedException{
            signUpPage.fillBirthDate(day,month,year);
            signUpPage.clickSubmitDate();
        }
    }
    public class FillEmailCode{
        public static void fillEmailCode() throws InterruptedException {
            Thread.sleep(20000);
            signUpPage.fillEmailCode();
            signUpPage.clickSubmitCode();
        }
    }

      public class Interface{
        private OpenSignUpForm openForm;
        private FillRegisterForm fillRegisterForm;

        private FillDateForm fillDateForm;

        private FillEmailCode fillEmailCode;


        public Interface() {
            this.openForm = new OpenSignUpForm();
            this.fillRegisterForm = new FillRegisterForm();
            this.fillDateForm = new FillDateForm();
            this.fillEmailCode = new FillEmailCode();
        }
        public void successfulTest() throws InterruptedException {
            openForm.open();
            fillRegisterForm.fillRegisterForm();
            fillDateForm.fillDateForm();
            fillEmailCode.fillEmailCode();
        }
        public void unsuccessfulTest() throws InterruptedException{
            openForm.open();
            fillRegisterForm.fillRegisterForm();
        }
    }
}
