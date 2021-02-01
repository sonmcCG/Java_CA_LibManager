package Behaviors;

import Entities.Card;
import FileIO.FileProcess;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<>();
final String PATH = "card.dat";
    public void add(Card card){
        cards = (ArrayList<Card>) FileProcess.readFromFile(PATH);
        cards.add(card);
        FileProcess.writeObjectToFile(cards,PATH);
    }

    public void show(){
        cards = (ArrayList<Card>) FileProcess.readFromFile(PATH);
        for (Card card:cards) {
            System.out.println(card.toString());
        }
    }
}
