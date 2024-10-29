package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	//Constructor
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	// Describe method
	public void describe() {
		System.out.println("Player: " + name + ", Score: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	// Flip method
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		}
		return null;
	}
	
	// Draw method
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	// Increment score method
	public void incrementScore() {
		score++;
	}
	
	// Get score
	public int getScore() {
		return score;
	}
	

}
