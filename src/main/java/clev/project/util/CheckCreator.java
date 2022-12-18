package clev.project.util;


import clev.project.connection.Connection;
import clev.project.exception.ProductNotFoundException;
import clev.project.models.CheckBuilder;
import clev.project.models.Discount;
import clev.project.models.Product;
import clev.project.printer.PrintCheckConsole;
import clev.project.printer.PrintCheckFile;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckCreator {
    private Double discount = 0d;
    private Double total = 0d;
    public void CheckCreator(HashMap<Long,Integer> idList,Integer cardNumber) throws SQLException, IOException, ProductNotFoundException {
        List<CheckBuilder> items = new ArrayList<>();
        Session em = new Connection().Connect();
        em.getTransaction().begin();
        List<Product> products = em.createQuery("select p from Product p").getResultList();
        for(Long item : idList.keySet()){
            CheckBuilder checkItem = new CheckBuilder();
            for(Product product : products){
                if(item == product.getId()){
                    double totalDiscount = product.getPrice() * idList.get(item);
                    checkItem.setName(product.getName());
                    checkItem.setAmount(idList.get(item));
                    if(idList.get(item) > 5 && product.getStock() == 1)totalDiscount-=totalDiscount*0.1;
                    discount += product.getPrice() * idList.get(item) - totalDiscount;
                    checkItem.setPrice(product.getPrice());
                    checkItem.setTotalCost(totalDiscount);
                    total+= product.getPrice()*idList.get(item);
                    items.add(checkItem);
                    break;
                }
            }
        }
        em.close();
        if(items.size()!=0) {
            StringBuilder check = new PrintCheckConsole().printCheck(items, total, discount, cardNumber);
            new PrintCheckFile().printCheck(check);
            return;
        }
        else {
            throw new ProductNotFoundException();
        }
    }
}
