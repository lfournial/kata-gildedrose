package code.kata.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTestCase {
    @Test
    @FileParameters("src/test/resources/parameterizedTests.csv")
    public void testUpdateQuality(String inititalName, int initialSellInn, int initialQuality,
            String updatedName, int updatedSellInn, int updatedQuality) {
        // given
        Inn inn = new Inn();
        inn.getItems().clear();
        Item item;
        if (inititalName.equals(AgedBrie.AGED_BRIE)) {
            item = new AgedBrie(initialSellInn, initialQuality);
        } else if (inititalName.equals(Backstage.BACKSTAGE)) {
            item = new Backstage(initialSellInn, initialQuality);
        } else if (inititalName.equals(Sulfuras.SULFURAS)) {
            item = new Sulfuras(initialSellInn, initialQuality);
        } else {
            item = new Item(inititalName, initialSellInn, initialQuality);
        }
        inn.getItems().add(item);

        // when
        inn.updateQuality();

        // then
        Item newItem = inn.getItems().get(0);
        assertThat(newItem.getName()).isEqualTo(updatedName);
        assertThat(newItem.getSellIn()).isEqualTo(updatedSellInn);
        assertThat(newItem.getQuality()).isEqualTo(updatedQuality);

    }
}
