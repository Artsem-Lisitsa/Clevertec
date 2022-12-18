package clev.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ControllerTest {
    @Test
    @Disabled
    void testController() throws IOException, SQLException {

        (new Controller()).Controller(1, new String[]{"1-2 3-2"});
    }

    @Test
    void testController2() throws IOException, SQLException {
        (new Controller()).Controller(0, new String[]{"1-2 3-2"});
    }

    @Test
    @Disabled
    void testController3() throws IOException, SQLException {
        (new Controller()).Controller(2, new String[]{"1-2 3-2"});
    }
}

