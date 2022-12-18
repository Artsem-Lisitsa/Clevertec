package clev.project.printer;

import clev.project.connection.Connection;
import clev.project.exception.CardNotFoundException;
import clev.project.models.Discount;
import org.hibernate.Session;

import java.io.IOException;
import java.util.List;

public class PrintCardsToConsole {
    public void show() throws IOException, CardNotFoundException {
        Session em = new Connection().Connect();
        StringBuilder cards = new StringBuilder();
        cards.append("LIST OF DISCOUNT CARDS\n"+"_".repeat(40)+
                String.format("\n%4s%8s%10s","id","Number","Discount"));
        List<Discount> cardList = em.createQuery("select d from Discount d").getResultList();
        for(Discount card : cardList){
            cards.append(String.format("\n%4s%8s%10s",card.getId(),card.getNumber(),card.getDiscount()));
        }
        em.close();
        if(cardList.size() != 0){
            System.out.println(cards);
        }
        else{
            throw new CardNotFoundException();
        }
    }
}
