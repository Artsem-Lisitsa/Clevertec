package clev.project.util;

import clev.project.connection.Connection;
import clev.project.exception.CardNotFoundException;
import clev.project.models.Discount;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

public class DiscountCard {
    public Integer discount(Integer number) throws IOException, CardNotFoundException {
        Session em = new Connection().Connect();
        em.getTransaction().begin();
        List<Discount> discounts = em.createQuery("select d from Discount d where d.number = '"+number+"'").getResultList();
        em.close();
        if(discounts.size() != 0){
            return discounts.get(0).getDiscount();
        }
        else {
            throw new CardNotFoundException();
        }
    }
}
