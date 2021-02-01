package Behaviors;

import Entities.Card;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<>();
    public void add(Card card){
        cards.add(card);
    }
    public void show(){
        for (Card card:cards) {
            System.out.println(card.toString());
        }
    }
}
