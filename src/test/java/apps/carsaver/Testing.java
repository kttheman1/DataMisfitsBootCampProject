package apps.carsaver;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing extends CommonAPI {

    @Test
    public void searchFilters(){
        click("//*[@id='buyDropDownMenu']");
        click("//*[@id='main-navigation']/nav/div/ul/li[1]/div/a[2]");
        click("//*[@id='shop-by']/div[3]/div/div/div/div[1]/div/div[1]/a/div/i");
        click("//*[@id='sedan']/div");
        click("//*[@id='shop-by-price']/div[2]/div/div[2]/button");
        waitFor(2);
        click("//*[@id='facets']/div[9]/div[1]/div/a/span");
        waitFor(5);
        click("label[for= '__BVID__446']");
        waitFor(5);
        /*click("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[1]/div[1]/div/a");
        String text = getElementText(".model");
        Assert.assertEquals("K5 EX", text);
        waitFor(3);  //*[@id="__BVID__356"]*/
    }
}
