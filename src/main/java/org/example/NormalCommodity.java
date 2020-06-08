package org.example;

public class NormalCommodity extends Commodity {
    public NormalCommodity(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected int applyQualityRules() {
        return this.getSellIn() <= 0 ? this.getQuality() - 2 : this.getQuality() - 1;
    }
}
