package com.pluralsight;

import java.util.Objects;

public class Card {
    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = false;
    }

    public String getSuit() {
        // only return the suit if the card is face up
        if (faceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        // only return the value if the card is face up
        if (faceUp) {
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        // TODO: this is your job (Blackjack, p. 95).
//        suit.ignore
////         card.flip
//        if (faceUp){
//            if (suit.equalsIgnoreCase("k")||suit.equalsIgnoreCase("k")) {
//                return 10;
//            }
//            if (faceUp){
//                return Integer.parseInt(value);
//            }
//        }else {
//            return 0;
//        }
//         check suit
//         check value
//         card.flip
        switch (suit.toLowerCase()) {
            case "north" -> {
                // Do some logic here if needed
                return 1;
            }
            case "south" -> {
                return 2;
            }
            default -> {
                return 10; // This works because the method returns an int
            }
        }
        // Until you finish it, every card is worth 0.
//        return 0;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
    }
}