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
        if (faceUp) {
            if (suit.equalsIgnoreCase("k") || suit.equalsIgnoreCase("q") || suit.equalsIgnoreCase("j")) {
                return 10;
            }
            if (suit.equalsIgnoreCase("Ace")) {
                return 11;
            }
            //this is what I think is looking at numeric cards and returning its value as an integer
            if (faceUp) {
                return Integer.parseInt(value);
            }
        } else {
            return 0;
        }
//         check suit
//         check value
//         card.flip

        switch (suit.toLowerCase()) {
            case "k", "q", "j" -> {
                // Do some logic here if needed
                return 10;
            }
            case "Ace" -> {
                return 11;
            }
            default -> {
                return 0; // This works because the method returns an int
            }
            // Until you finish it, every card is worth 0.
//        return 0;
        }

        //flip card again so it's face down once the point value is returned so that it can be given back to the deck?
//        if (!faceUp) {
//            return 0;
//        }
//        faceUp = !faceUp;

    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
    }
}