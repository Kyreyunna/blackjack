package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        System.out.println(deck1.getSize());


        //shuffle here?
        Deck deck2 = new Deck();
        //Create and shuffle a deck,
        deck2.shuffle();
        // then deal 2 cards to each hand
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

// deal 5 cards
        for (int count = 1; count <=2; count = count + 1) {
// get a card from the deck
            Card card = deck2.deal();
// deal that card to the hand
            hand1.deal(card);
            hand2.deal(card);
        }
    }
}
