package clev.project.printer;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrintCheckFileTest {

    @Test
    void testPrintCheck() throws IOException {
        PrintCheckFile printCheckFile = new PrintCheckFile();
        printCheckFile.printCheck(new StringBuilder());
    }
}

