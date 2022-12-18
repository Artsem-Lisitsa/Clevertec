package clev.project.printer;

import clev.project.models.CheckBuilder;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class PrintCheckConsoleTest {

    @Test
    void testPrintCheck() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), 10.0d, 10.0d, 3);
    }

    @Test
    void testPrintCheck2() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), 10.0d, 10.0d, null);
    }

    @Test
    void testPrintCheck3() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();

        CheckBuilder checkBuilder = new CheckBuilder();
        checkBuilder.setAmount(10);
        checkBuilder.setName(" ");
        checkBuilder.setPrice(10.0d);
        checkBuilder.setTotalCost(100.0d);

        ArrayList<CheckBuilder> checkBuilderList = new ArrayList<>();
        checkBuilderList.add(checkBuilder);
        printCheckConsole.printCheck(checkBuilderList, 10.0d, 10.0d, 3);
    }

    @Test
    @Disabled
    void testPrintCheck4() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), null, 10.0d, 3);
    }

    @Test
    @Disabled
    void testPrintCheck5() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), 10.0d, null, 3);
    }

    @Test
    @Disabled
    void testPrintCheck6() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), null, 10.0d, null);
    }

    @Test
    @Disabled
    void testPrintCheck7() throws IOException, SQLException {

        PrintCheckConsole printCheckConsole = new PrintCheckConsole();
        printCheckConsole.printCheck(new ArrayList<>(), 10.0d, null, null);
    }
}

