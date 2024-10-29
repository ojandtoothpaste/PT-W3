package War;

public class App {

	public static void main(String[] args) {
		
		// instantiate a deck and two players
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// Shuffle the deck
		deck.shuffle();
		
		// Distribute the cards equally to both players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		// Each player flips a card and points are awarded based on higher card value
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.print("Round " + (i + 1) + ": ");
			card1.describe();
			System.out.print(" vs ");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins the round!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins the round!");
			} else {
				System.out.println("It's a tie! No points awarded");
			}
			System.out.println("Score --> Player 1: " + player1.getScore() + " | Player 2: " + player2.getScore());
			System.out.println("-------------------------------------------------");
		}
		
		//Print final scores and the winner
		System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());
        
        if (player1.getScore() > player2.getScore()) {
        	System.out.println("Player 1 wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
        	System.out.println("Player 2 wins the game!");
        } else {
        	System.out.println("The game was a draw!");
        }

	}

}
