package org.example;

public class Commodity {
    public static final String BACKSTAGE = "Backstage";
    private String name;
    private int sellIn;
    private int quality;

    public Commodity(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void update() {
        decreaseSellIn();
        updateQuality();
        limitQuality();
    }

    private void limitQuality() {
        if (this.quality > 50) {
            this.quality = 50;
        } else if (this.quality < 0) {
            this.quality = 0;
        }
    }

    private void updateQuality() {
        if (this.name.equals(BACKSTAGE)){
            applyBackstageQualityRules();
        } else {
            applyNormalQualityRules();
        }
    }

    private void decreaseSellIn() {
        this.sellIn -= 1;
    }

    private void applyNormalQualityRules() {
        if (this.sellIn <= 0) {
            this.quality -= 2;
        } else {
            this.quality -= 1;
        }
    }

    private void applyBackstageQualityRules() {
        if (this.sellIn <= 0) {
            this.quality = 0;
        } else if (this.sellIn <= 5) {
            this.quality += 3;
        } else if (this.sellIn <= 10) {
            this.quality += 2;
        }
    }
}
