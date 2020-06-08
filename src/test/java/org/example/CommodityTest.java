package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CommodityTest {
    @Test
    public void should_get_sell_in_and_quality() {
        Commodity commodity = new Commodity("name", 10, 20);
        Assert.assertEquals(10, commodity.getSellIn());
        Assert.assertEquals(20, commodity.getQuality());
    }

    @Test
    public void should_update_sellIn() {
        Commodity commodity = new Commodity("name", 10, 20);
        commodity.update();
        Assert.assertEquals(9, commodity.getSellIn());
    }
}
