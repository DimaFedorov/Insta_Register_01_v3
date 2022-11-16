package signUp;

import com.instagram.signUp.SignUpFacade;
import org.junit.Test;

public class RegisterTest extends TestBase {

    @Test
    public void successfulLoginTest() throws InterruptedException {
        SignUpFacade.Interface signUp = new SignUpFacade().new Interface();
        SignUpFacade successfulLoginTest = new SignUpFacade.Builder()
                .fillLogin("insta_register_01@cevipsa.com")
                .fillName("Fedorov Dmytro")
                .fillNickName("fed_reg19_testng")
                .fillPassword("Fed1344dmytro")
                .fillBirthDate(31,12,2003)
                .build();
        signUp.successfulTest();
    }

    @Test
    public void unsuccessfulLoginTest() throws InterruptedException {
        SignUpFacade.Interface signUp = new SignUpFacade().new Interface();
        SignUpFacade successfulLoginTest = new SignUpFacade.Builder()
                .fillLogin("+3809399832344")
                .fillName("5")
                .fillNickName("fed_13_dmytro")
                .fillPassword("1234")
                .build();
        signUp.unsuccessfulTest();
    }
}
