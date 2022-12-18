package clev.project.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CardNotFoundExceptionTest {
    @Test
    void testConstructor() {
        CardNotFoundException actualCardNotFoundException = new CardNotFoundException();
        assertNull(actualCardNotFoundException.getCause());
        assertEquals(0, actualCardNotFoundException.getSuppressed().length);
        assertNull(actualCardNotFoundException.getMessage());
        assertNull(actualCardNotFoundException.getLocalizedMessage());
    }
}

