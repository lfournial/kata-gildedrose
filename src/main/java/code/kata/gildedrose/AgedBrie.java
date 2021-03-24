package code.kata.gildedrose;

public class AgedBrie extends Item {

    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    void updateItem() {
        if (quality < 50) {
            increaseQuality();
        }
        decreaseSellIn();
        if (sellIn < 0) {
            if (quality < 50) {
                increaseQuality();
            }
        }
    }

}
