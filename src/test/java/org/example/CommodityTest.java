package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CommodityTest {
    @Test
    public void should_get_sell_in_and_quality() {
        Commodity commodity = new NormalCommodity("name", 10, 20);
        Assert.assertEquals(10, commodity.getSellIn());
        Assert.assertEquals(20, commodity.getQuality());
    }

    @Test
    public void should_update_sellIn() {
        Commodity commodity = new NormalCommodity("name", 10, 20);
        commodity.update();
        Assert.assertEquals(9, commodity.getSellIn());
    }

    @Test
    public void should_not_change_quality_when_sellIn_is_12_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(12, 20);
        commodity.update();
        Assert.assertEquals(20, commodity.getQuality());
    }

    @Test
    public void should_increase_quality_by_2_when_sellIn_is_11_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(11, 20);
        commodity.update();
        Assert.assertEquals(22, commodity.getQuality());
    }

    @Test
    public void should_not_make_quality_greater_than_50_when_sellIn_is_11_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(11, 49);
        commodity.update();
        Assert.assertEquals(50, commodity.getQuality());
    }

    @Test
    public void should_increase_quality_by_3_when_sellIn_is_6_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(6, 20);
        commodity.update();
        Assert.assertEquals(23, commodity.getQuality());
    }

    @Test
    public void should_not_make_quality_greater_than_50_when_sellIn_is_6_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(6, 49);
        commodity.update();
        Assert.assertEquals(50, commodity.getQuality());
    }

    @Test
    public void should_get_0_quality_when_sellIn_is_1_and_commodity_is_backstage() {
        Commodity commodity = new Backstage(1, 20);
        commodity.update();
        Assert.assertEquals(0, commodity.getQuality());
    }

    @Test
    public void should_decrease_quality_by_2_when_sellIn_is_1_and_commodity_is_sword() {
        Commodity commodity = new NormalCommodity("Sword", 1, 20);
        commodity.update();
        Assert.assertEquals(18, commodity.getQuality());
    }

    @Test
    public void should_get_0_quality_when_sellIn_is_1_and_commodity_is_sword() {
        Commodity commodity = new NormalCommodity("Sword", 1, 1);
        commodity.update();
        Assert.assertEquals(0, commodity.getQuality());
    }
    @Test
    public void should_decrease_quality_by_1_when_sellIn_is_2_and_commodity_is_sword() {
        Commodity commodity = new NormalCommodity("Sword", 2, 20);
        commodity.update();
        Assert.assertEquals(19, commodity.getQuality());
    }

    @Test
    public void should_get_0_quality_when_sellIn_is_2_and_commodity_is_sword() {
        Commodity commodity = new NormalCommodity("Sword", 2, 0);
        commodity.update();
        Assert.assertEquals(0, commodity.getQuality());
    }

}
