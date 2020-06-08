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

    @Test
    public void should_not_change_quality_when_sellIn_is_12_and_commodity_is_backstage() {
        Commodity commodity = new Commodity("Backstage", 12, 20);
        commodity.update();
        Assert.assertEquals(20, commodity.getQuality());
    }

    @Test
    public void should_increase_quality_by_2_when_sellIn_is_11_and_commodity_is_backstage() {
        Commodity commodity = new Commodity("Backstage", 11, 20);
        commodity.update();
        Assert.assertEquals(22, commodity.getQuality());
    }

    @Test
    public void should_not_make_quality_greater_than_50_when_sellIn_is_11_and_commodity_is_backstage() {
        Commodity commodity = new Commodity("Backstage", 11, 49);
        commodity.update();
        Assert.assertEquals(50, commodity.getQuality());
    }

    @Test
    public void should_increase_quality_by_3_when_sellIn_is_6_and_commodity_is_backstage() {
        Commodity commodity = new Commodity("Backstage", 6, 20);
        commodity.update();
        Assert.assertEquals(23, commodity.getQuality());
    }

    @Test
    public void should_not_make_quality_greater_than_50_when_sellIn_is_6_and_commodity_is_backstage() {
        Commodity commodity = new Commodity("Backstage", 6, 49);
        commodity.update();
        Assert.assertEquals(50, commodity.getQuality());
    }

}
