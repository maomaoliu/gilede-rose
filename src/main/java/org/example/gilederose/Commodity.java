package org.example.gilederose;

public abstract class Commodity {
    private String name;
    private int sellIn;
    private int quality;

    protected Commodity(String name, int sellIn, int quality) {
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
        this.quality = applyQualityRules();
    }

    protected abstract int applyQualityRules();

    private void decreaseSellIn() {
        this.sellIn -= 1;
    }
}
