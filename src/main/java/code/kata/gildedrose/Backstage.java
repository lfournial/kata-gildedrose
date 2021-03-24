package code.kata.gildedrose;

public class Backstage extends Item {

    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    void updateItem() {
        if (quality < 50) {
            increaseQuality();

            if (sellIn < 11) {
                if (quality < 50) {
                    increaseQuality();
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    increaseQuality();
                }
            }
        }
        decreaseSellIn();
        if (sellIn < 0) {
            this.quality = 0;
        }
    }

}
