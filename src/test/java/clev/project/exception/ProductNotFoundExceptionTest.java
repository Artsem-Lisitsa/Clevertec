package clev.project.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ProductNotFoundExceptionTest {
    @Test
    void testConstructor() {
        ProductNotFoundException actualProductNotFoundException = new ProductNotFoundException();
        assertNull(actualProductNotFoundException.getCause());
        assertEquals(0, actualProductNotFoundException.getSuppressed().length);
        assertNull(actualProductNotFoundException.getMessage());
        assertNull(actualProductNotFoundException.getLocalizedMessage());
    }
}

