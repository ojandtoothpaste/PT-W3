package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	
	// Constructor: Initializes a standard 52 card deck
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < names.length; j++) {
				cards.add(new Card(j + 2, names[j] + " of " + suits[i]));
			}
		}
	}
	
	// Shuffle method
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Draw method
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}
		return null;
	}

}
