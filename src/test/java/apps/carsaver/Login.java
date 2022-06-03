package apps.carsaver;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    @Test
    public void validLogin() {
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", driver.getTitle());
        click("//li[@class='nav-item' and a//text()[contains(., 'Sign In')]]");
        type("//*[@id='email']", "ravenn587@aol.com");
        typeAndEnter("//*[@id='password']", "Qwerty1");
        waitFor(6);

        //Logout functionality
        click("//*[@id='profileDropDownMenu']");
        waitFor(2);
        click("//*[@id='profileDropDownMenu-menu']/a[3]");
        waitFor(3);
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", driver.getTitle());
    }

    @Test
    public void invalidLogin(){
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", driver.getTitle());
        click("//li[@class='nav-item' and a//text()[contains(., 'Sign In')]]");
        type("#email", "ravenn57@aol.com");
        typeAndEnter("#password", "Qwrty1");
        waitFor(2);
        String text = getElementText("//*[@id=\"sign-in-content\"]/form/p[1]");
        Assert.assertEquals("The email address or password are not correct", text);
        waitFor(2);
    }
}
