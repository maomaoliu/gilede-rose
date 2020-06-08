package org.example;

public class Commodity {
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
        this.sellIn -= 1;
    }
}
