package clev.project.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheckBuilderTest {

    @Test
    void testConstructor() {
        CheckBuilder actualCheckBuilder = new CheckBuilder();
        actualCheckBuilder.setAmount(10);
        actualCheckBuilder.setName("Name");
        actualCheckBuilder.setPrice(10.0d);
        actualCheckBuilder.setTotalCost(10.0d);
        assertEquals(10, actualCheckBuilder.getAmount().intValue());
        assertEquals(10.0d, actualCheckBuilder.getCost().doubleValue());
        assertEquals("Name", actualCheckBuilder.getName());
        assertEquals(10.0d, actualCheckBuilder.getTotal().doubleValue());
    }
}

