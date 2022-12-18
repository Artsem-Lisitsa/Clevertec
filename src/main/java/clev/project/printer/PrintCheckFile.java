package clev.project.printer;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PrintCheckFile {

    public void printCheck (StringBuilder check) throws IOException {
        PrintWriter writer = new PrintWriter("CHECK.txt");
        writer.write(String.valueOf(check));
        writer.close();
    }
}
