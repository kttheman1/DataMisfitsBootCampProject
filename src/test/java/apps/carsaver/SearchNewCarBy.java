package apps.carsaver;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchNewCarBy extends CommonAPI {

    @Test
    public void searchMakeModel() {
        selectFromDropdown("//*[@id='__BVID__37']", "Acura");
        selectFromDropdown("//*[@id='__BVID__38']", "ILX");
        click("//*[@id='__BVID__28']/div/div[2]/div[3]/button");
        waitFor(3);
        String text = getElementText("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div/h1");
        Assert.assertEquals("2022 Acura ILX", text);
        waitFor(2);
    }

    @Test
    public void searchBodyStyle() {
        click("//*[@id='__BVID__28']/div/div[1]/div/div/div/a[2]/div/div");
        waitFor(1);
        click("//*[@id=\"__BVID__28\"]/div/div[2]/div[1]/div[2]/div/div/div[2]");
        click("//*[@id='__BVID__28']/div/div[2]/div[3]/div/button");
        waitFor(2);
        String actualPageText = getElementText("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]");
        Assert.assertEquals("Equinox", actualPageText);
        waitFor(2);
    }

    }

