package clev.project.printer;

import clev.project.exception.ProductNotFoundException;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrintProductsToConsoleTest {

    @Test
    void testShow() throws ProductNotFoundException, IOException {
        (new PrintProductsToConsole()).show();
    }
}

