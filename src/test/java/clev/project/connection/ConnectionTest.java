package clev.project.connection;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ConnectionTest {
    @Test
    void testConnect() throws IOException {
        (new Connection()).Connect();
    }
}

