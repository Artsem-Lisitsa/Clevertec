package clev.project;

import clev.project.controller.Controller;
import clev.project.exception.CardNotFoundException;
import clev.project.util.CheckCreator;
import clev.project.util.DiscountCard;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckRunner {
    public static void main(String[] args) throws SQLException, IOException {
        while (true) {
            System.out.println("\n\nSELECT MODE");
            System.out.println("1 - Generate check\n2 - Show product list\n3 - Show a list of discount cards\n4 - get the last generated check\n0 - QUIT");
            Integer mode = new Scanner(System.in).nextInt();
            if(mode == 0){
                return;
            }
            else {
                new Controller().Controller(mode,args);
            }
        }
    }
}
