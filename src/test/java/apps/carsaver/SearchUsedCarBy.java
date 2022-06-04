package apps.carsaver;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchUsedCarBy extends CommonAPI {

    @Test
    public void searchMakeModel() {
        click("//*[@id='__BVID__42___BV_tab_button__']");
        selectFromDropdown("//*[@id='__BVID__51']", "Audi");
        waitFor(2);
        selectFromDropdown("//*[@id='__BVID__52']", "S5 Coupe");
        click("//*[@id='__BVID__42']/div/div[2]/div[3]/button");
        waitFor(5);
        String text = getElementText("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[1]/div/div[1]/div[2]");
        Assert.assertEquals("S5 Coupe Premium Plus", text);
        waitFor(2);
    }

    @Test
    public void searchBodyStyle() {
        click("//*[@id='__BVID__42___BV_tab_button__']");
        click("//*[@id='__BVID__42']/div/div[1]/div/div/div/a[2]/div/div");
        click("//*[@id='__BVID__42']/div/div[2]/div[1]/div[4]/div/div");
        waitFor(2);
        click("//*[@id='__BVID__42']/div/div[2]/div[3]/div/button");
        waitFor(2);
        String actualPageText = getElementText("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div[2]");
        Assert.assertEquals("K5 GT-Line", actualPageText);
        waitFor(2);
    }
}
