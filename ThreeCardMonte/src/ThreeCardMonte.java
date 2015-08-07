import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeCardMonte {

	public static void main(String[] args) {

		Cards c = new Cards();
		Scanner sc = new Scanner(System.in);
		int bet = 0;
		
		Balance b = new Balance(100);
		System.out
				.println("Welcome and prepare yourself, for you are about to become richer"
						+ "\nthan in your wildest dreams. The game is simple. I will shuffle the cards and "
						+ "\nyou must pick one. If you pick the Ace you win!. But if you don't you lose your money."
						+ "\nThe cards are laid out faceup in front of you.");

		do {
			System.out.println(c.revealCards(true));
			System.out
					.println("Minimum best is $5. Place your bet now to get started");
			while (b.isCanBet()) {
				try {
					bet = sc.nextInt();
					sc.nextLine();
					System.out.println(b.placeBet(bet));
				} catch (InputMismatchException e) {
					System.out
							.println("Error, input must be a dollar amount, Please Try again.");
					sc.nextLine();
				}
			}
			b.setCanBet(true);
			System.out
					.println("Thank you for your bet. Now I will shuffle and place the cards facedown "
							+ "\nin front of you.");
			c.shuffleCards();
			boolean chooseCard = false;
			System.out.println(c.revealCards(false));
			while (chooseCard == false) {
				try {
					System.out.println("Please choose a chard");
					System.out.println(c.turnOver(sc.nextInt()));
					chooseCard = true;
				} catch (InputMismatchException e) {
					System.out.println("Error, input must be between 0-2");
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Error, input must be between 0-2");
					// sc.nextLine();
				} finally{
					sc.nextLine();
				}
			}
			System.out.println(b.betEarnings(bet, c.isWin()));
			//sc.nextLine();
			if (b.gameOver()) {
				break;
			}
			System.out.println("Would you like to play again? (y/n)");
		} while (sc.nextLine().equalsIgnoreCase("y"));
		System.out.println("Thank you for playing. Please come again.");
		sc.close();
	}

}
