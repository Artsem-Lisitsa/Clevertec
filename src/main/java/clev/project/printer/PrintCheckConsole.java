package clev.project.printer;

import clev.project.models.CheckBuilder;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class PrintCheckConsole {
    public StringBuilder printCheck(List<CheckBuilder> items, Double total, Double discount, Integer cardDiscount) throws SQLException, IOException {
        String space = " ";
        StringBuilder checkBuilder = new StringBuilder();
        checkBuilder.append("\n"+"-".repeat(40)+
                String.format("\n%26s","CASH RECEIPT")+
                String.format("\n%28s","supermarket 345")+
                String.format("\n%33s","12, milkyway galaxy/earth")+
                String.format("\n%29s\n","Tel: 123-465-78-90")+
                String.format("\n%36s","CASHIER: №"+new Random().nextInt(1000,5000)+space.repeat(7)+"DATE:"+ LocalDate.now())+
                String.format("\n%35s","TIME: "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:SS")))+
                String.format("\n"+"_".repeat(40))+
                String.format("\n%4s%13s%10s%10s","QTY","DESCRIPTION","PRICE","TOTAL"));

        for(CheckBuilder item : items){
            checkBuilder.append(String.format("\n%4d%13s%10s$%10.2f$",item.getAmount(),item.getName(),item.getCost(),item.getTotal()));
        }
        if (cardDiscount !=null) {
            discount += total - (total - total * (Double.valueOf(cardDiscount) / 100d));
        }
        checkBuilder.append(String.format("\n"+"=".repeat(40))+
                String.format("\nTAXABLE TOT.%26.2f$\nDISCOUNT.%29.2f$\nTOTAL.%32.2f$", total-discount,discount,total));
        System.out.println(checkBuilder);
        return checkBuilder;
    }
}
