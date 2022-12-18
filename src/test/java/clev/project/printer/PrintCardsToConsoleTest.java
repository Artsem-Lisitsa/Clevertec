package clev.project.printer;

import clev.project.exception.CardNotFoundException;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrintCardsToConsoleTest {
    @Test
    void testShow() throws CardNotFoundException, IOException {
        (new PrintCardsToConsole()).show();
    }
}

