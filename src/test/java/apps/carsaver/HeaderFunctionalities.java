package apps.carsaver;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderFunctionalities extends CommonAPI {

    @Test
    public void shopNewCar() {
        click("//*[@id='buyDropDownMenu']");
        click("//*[@id='main-navigation']/nav/div/ul/li[1]/div/a[2]");
        click("//*[@id='shop-by']/div[3]/div/div/div/div[1]/div/div[1]/a/div/i");
        click("//*[@id='sedan']/div");
        click("//*[@id='shop-by-price']/div[2]/div/div[2]/button");
        waitFor(2);
        String actualPageText = getElementText("//*[@id='listings-container']/div[1]/nav/ol/li[2]");
        Assert.assertEquals("New Car Search", actualPageText);
        waitFor(2);
    }

    public void buildCar(){
        click("//*[@id='buyDropDownMenu']");
        click("//*[@id='main-navigation']/nav/div/ul/li[1]/div/a[4]");
        selectFromDropdown(".custom-select", "Asian");
        click("//*[@id='shop-by-make']/div[1]/div[1]/div/div/span");
        click("//*[@id='shop-by-make']/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span[1]");
        click("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div[1]");
        click("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div/div[3]/div/button");
        click("//*[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div/a");
        waitFor(2);
        String text = getElementText("//*[@id='vinStockMiles']/div/span[2]/span");
        Assert.assertEquals("Configured Vehicle", text);
        waitFor(3);
    }
}
