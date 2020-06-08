package org.example;

public class Backstage extends Commodity {
    private static final String BACKSTAGE = "Backstage";

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    protected int applyQualityRules() {
        int quality = this.getQuality();
        if (this.getSellIn() <= 0) {
            quality = 0;
        } else if (this.getSellIn() <= 5) {
            quality += 3;
        } else if (this.getSellIn() <= 10) {
            quality += 2;
        }
        return quality;
    }
}
