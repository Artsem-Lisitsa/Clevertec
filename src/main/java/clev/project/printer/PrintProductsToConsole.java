package clev.project.printer;

import clev.project.connection.Connection;
import clev.project.exception.ProductNotFoundException;
import clev.project.models.Product;
import org.hibernate.Session;

import java.io.IOException;
import java.util.List;

public class PrintProductsToConsole {
    public void show() throws IOException, ProductNotFoundException {
        StringBuilder products = new StringBuilder();
        products.append("LIST OF PRODUCTS\n"+"_".repeat(40)+
                String.format("\n%4s%8s%10s%11s","id","Name","Price","Stock"));
        Session em = new Connection().Connect();
        em.getTransaction().begin();
        List<Product> productList = em.createQuery("select  p from Product p").getResultList();
        for(Product product : productList){
            products.append(String.format("\n%4s%8s%10s%11s",product.getId(),product.getName(),product.getPrice(),product.getStock()));
        }
        em.close();

        if(productList.size() != 0) {
            System.out.println(products);
            return;
        }
        else {
            throw new ProductNotFoundException();
        }
    }
}
