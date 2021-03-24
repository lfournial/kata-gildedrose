package code.kata.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AgedBrieTest {

    @Test
    public void testThatUpdatingAgeBrieDoentGoAbove50() {
        AgedBrie ageBrie = new AgedBrie(10, 45);
        ageBrie.updateItem();
        assertThat(ageBrie.quality).isLessThan(51);
    }

    @Test
    public void testThatUpdating50AgeBrieDoentGoAbove50() {
        AgedBrie ageBrie = new AgedBrie(10, 50);
        ageBrie.updateItem();
        assertThat(ageBrie.quality).isLessThan(51);
    }

    @Test
    public void testThatUpdating60AgeBrieDoentGoAbove60() {
        AgedBrie ageBrie = new AgedBrie(10, 60);
        ageBrie.updateItem();
        assertThat(ageBrie.quality).isEqualTo(60);
    }

}
