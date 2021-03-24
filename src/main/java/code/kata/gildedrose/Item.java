package code.kata.gildedrose;

public class Item {

    String name;

    int sellIn;

    int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    void updateItem() {
        if (quality > 0) {
            decreaseQuality();
        }
        decreaseSellIn();
        if (sellIn < 0) {
            if (quality > 0) {
                decreaseQuality();
            }
        }

    }

    int decreaseSellIn() {
        return this.sellIn = sellIn - 1;
    }

    int increaseQuality() {
        return this.quality = quality + 1;
    }

    int decreaseQuality() {
        return this.quality = quality - 1;
    }

}
