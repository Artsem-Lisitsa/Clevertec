package clev.project.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void testCanEqual() {
        assertFalse((new Product()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        Product product = new Product();

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(3);
        assertTrue(product.canEqual(product1));
    }

    @Test
    void testConstructor() {
        Product actualProduct = new Product();
        actualProduct.setId(123L);
        actualProduct.setName("Name");
        actualProduct.setPrice(10.0d);
        actualProduct.setStock(1);
        String actualToStringResult = actualProduct.toString();
        assertEquals(123L, actualProduct.getId().longValue());
        assertEquals("Name", actualProduct.getName());
        assertEquals(10.0d, actualProduct.getPrice().doubleValue());
        assertEquals(1, actualProduct.getStock().intValue());
        assertEquals("Product(id=123, name=Name, price=10.0, stock=1)", actualToStringResult);
    }


    @Test
    void testConstructor2() {
        Product actualProduct = new Product(123L, "Name", 10.0d, 1);
        actualProduct.setId(123L);
        actualProduct.setName("Name");
        actualProduct.setPrice(10.0d);
        actualProduct.setStock(1);
        String actualToStringResult = actualProduct.toString();
        assertEquals(123L, actualProduct.getId().longValue());
        assertEquals("Name", actualProduct.getName());
        assertEquals(10.0d, actualProduct.getPrice().doubleValue());
        assertEquals(1, actualProduct.getStock().intValue());
        assertEquals("Product(id=123, name=Name, price=10.0, stock=1)", actualToStringResult);
    }


    @Test
    void testEquals() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);
        assertNotEquals(product, null);
    }

    @Test
    void testEquals2() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);
        assertNotEquals(product, "Different type to Product");
    }

    @Test
    void testEquals3() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);
        assertEquals(product, product);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product.hashCode());
    }

    @Test
    void testEquals4() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }

    @Test
    void testEquals5() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    void testEquals6() {
        Product product = new Product();
        product.setId(null);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals7() {
        Product product = new Product();
        product.setId(123L);
        product.setName(null);
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals8() {
        Product product = new Product();
        product.setId(123L);
        product.setName("clev.project.models.Product");
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals9() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(null);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals10() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(0.5d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals11() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(3);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals12() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(null);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertNotEquals(product, product1);
    }

    @Test
    void testEquals13() {
        Product product = new Product();
        product.setId(null);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(null);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }

    @Test
    void testEquals14() {
        Product product = new Product();
        product.setId(123L);
        product.setName(null);
        product.setPrice(10.0d);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName(null);
        product1.setPrice(10.0d);
        product1.setStock(1);
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }

    @Test
    void testEquals15() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(null);
        product.setStock(1);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(null);
        product1.setStock(1);
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }

    @Test
    void testEquals16() {
        Product product = new Product();
        product.setId(123L);
        product.setName("Name");
        product.setPrice(10.0d);
        product.setStock(null);

        Product product1 = new Product();
        product1.setId(123L);
        product1.setName("Name");
        product1.setPrice(10.0d);
        product1.setStock(null);
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }
}

