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

// deal 2 cards to player 1
        for (int count = 1; count <=2; count = count + 1) {
// get a card from the deck
            Card card1 = deck2.deal();
// deal that card to the hand
            hand1.deal(card1);
        }
        // deal 2 cards to player 2
        for (int count = 1; count <=2; count = count + 1) {
// get a card from the deck
            Card card2 = deck2.deal();
// deal that card to the hand
            hand2.deal(card2);
        }
//        Show each hand and its value, then announce the winner: closest to 21 without going over.

        System.out.println("show hand1: "+hand1.getValue());
        System.out.println("show hand1: "+hand2.getValue());

        if(hand1.getValue()>21&&hand1.getValue()>21){
            System.out.println("hand 2 win");
            if (hand2.getValue()>21){
                System.out.println("hand 1 win");
                if(hand1.getValue()>hand2.getValue()){
                    System.out.println("hand 1 win");
                    if(hand2.getValue()>hand1.getValue()){
                        System.out.println("hand 2 win");
                    }
                }
            }
        }
//        Test it: make a card in main(), flip it,
//        and print getPointValue(). Try "K" (10), "A" (11) and "7" (7).

//        Card card2 = new Card("K", "10");
//        card2.flip();
//        System.out.println(card2.getPointValue());

        Card card3 = new Card("Diamonds", "7");
        card3.flip();
        System.out.println(card3.getPointValue());

        Card card4 = new Card("Spades", "A");
        card4.flip();
        System.out.println(card4.getPointValue());

        //I want to check size of deck after dealing two cards to each hand
        System.out.println(deck2.getSize());
    }
}
