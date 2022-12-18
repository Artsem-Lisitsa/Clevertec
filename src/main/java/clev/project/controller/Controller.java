package clev.project.controller;

import clev.project.exception.CardNotFoundException;
import clev.project.exception.ProductNotFoundException;
import clev.project.printer.PrintCardsToConsole;
import clev.project.printer.PrintProductsToConsole;
import clev.project.util.CheckCreator;
import clev.project.util.DiscountCard;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    public void Controller(Integer mode,String[] args) throws SQLException {

        if(mode == 1){
            Integer cardNumber;
            HashMap<Long,Integer> itemList = new HashMap<>();
            for(int i = 0; i< args.length;i++){
                itemList.put(Long.parseLong(String.valueOf(args[i].charAt(0))),Integer.parseInt(String.valueOf(args[i].charAt(args[i].length()-1))));
            }
            System.out.println(itemList);
            while (true) {
                System.out.println("USE DISCOUNT CARD? Y/N");
                String use = new Scanner(System.in).nextLine();
                if (use.toLowerCase().equals("y")) {
                    System.out.println("ENTER CARD NUMBER:");
                    try {
                        cardNumber = new DiscountCard().discount(new Scanner(System.in).nextInt());
                        break;
                    } catch (CardNotFoundException | InputMismatchException e) {
                        System.out.println("DISCOUNT CARD NOT FOUND");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                else if(use.toLowerCase().equals("n")){
                    cardNumber = 0;
                    break;
                }
            }
            try {
                new CheckCreator().CheckCreator(itemList,cardNumber);
            } catch (ProductNotFoundException e) {
                System.out.println("PRODUCTS NOT FOUND");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        else if(mode == 2){
            try {
                new PrintProductsToConsole().show();
            } catch (ProductNotFoundException e) {
                System.out.println("PRODUCTS NOT FOUNT");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        else if(mode == 3) {
            try {
                new PrintCardsToConsole().show();
            } catch (CardNotFoundException e) {
                System.out.println("DISCOUNT CARDS NOT FOUND");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        else if(mode == 4){
            try {
                Desktop.getDesktop().open(new File("CHECK.txt"));
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("CHECK NOT FOUND");
            }
        }
    }
}
