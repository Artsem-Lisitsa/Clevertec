package clev.project.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DiscountTest {
    @Test
    void testCanEqual() {
        assertFalse((new Discount()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        Discount discount = new Discount();

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertTrue(discount.canEqual(discount1));
    }

    @Test
    void testConstructor() {
        Discount actualDiscount = new Discount();
        actualDiscount.setDiscount(3);
        actualDiscount.setId(123L);
        actualDiscount.setNumber(10);
        String actualToStringResult = actualDiscount.toString();
        assertEquals(3, actualDiscount.getDiscount().intValue());
        assertEquals(123L, actualDiscount.getId().longValue());
        assertEquals(10, actualDiscount.getNumber().intValue());
        assertEquals("Discount(id=123, number=10, discount=3)", actualToStringResult);
    }

    @Test
    void testConstructor2() {
        Discount actualDiscount = new Discount(123L, 10, 3);
        actualDiscount.setDiscount(3);
        actualDiscount.setId(123L);
        actualDiscount.setNumber(10);
        String actualToStringResult = actualDiscount.toString();
        assertEquals(3, actualDiscount.getDiscount().intValue());
        assertEquals(123L, actualDiscount.getId().longValue());
        assertEquals(10, actualDiscount.getNumber().intValue());
        assertEquals("Discount(id=123, number=10, discount=3)", actualToStringResult);
    }

    @Test
    void testEquals() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(10);
        assertNotEquals(discount, null);
    }

    @Test
    void testEquals2() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(10);
        assertNotEquals(discount, "Different type to Discount");
    }

    @Test
    void testEquals3() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(10);
        assertEquals(discount, discount);
        int expectedHashCodeResult = discount.hashCode();
        assertEquals(expectedHashCodeResult, discount.hashCode());
    }

    @Test
    void testEquals4() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertEquals(discount, discount1);
        int expectedHashCodeResult = discount.hashCode();
        assertEquals(expectedHashCodeResult, discount1.hashCode());
    }

    @Test
    void testEquals5() {
        Discount discount = new Discount();
        discount.setDiscount(1);
        discount.setId(123L);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals6() {
        Discount discount = new Discount();
        discount.setDiscount(null);
        discount.setId(123L);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals7() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(1L);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals8() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(null);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals9() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(1);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals10() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(null);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertNotEquals(discount, discount1);
    }

    @Test
    void testEquals11() {
        Discount discount = new Discount();
        discount.setDiscount(null);
        discount.setId(123L);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(null);
        discount1.setId(123L);
        discount1.setNumber(10);
        assertEquals(discount, discount1);
        int expectedHashCodeResult = discount.hashCode();
        assertEquals(expectedHashCodeResult, discount1.hashCode());
    }

    @Test
    void testEquals12() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(null);
        discount.setNumber(10);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(null);
        discount1.setNumber(10);
        assertEquals(discount, discount1);
        int expectedHashCodeResult = discount.hashCode();
        assertEquals(expectedHashCodeResult, discount1.hashCode());
    }

    @Test
    void testEquals13() {
        Discount discount = new Discount();
        discount.setDiscount(3);
        discount.setId(123L);
        discount.setNumber(null);

        Discount discount1 = new Discount();
        discount1.setDiscount(3);
        discount1.setId(123L);
        discount1.setNumber(null);
        assertEquals(discount, discount1);
        int expectedHashCodeResult = discount.hashCode();
        assertEquals(expectedHashCodeResult, discount1.hashCode());
    }
}

