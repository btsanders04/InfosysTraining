
public class Balance {

	private int total;
	private boolean canBet=true;
	
	

	public Balance(int sum){
		total = sum;
	}
	
	public boolean isCanBet() {
		return canBet;
	}

	public int getTotal() {
		return total;
	}
	
	
	
	
	public void setCanBet(boolean canBet) {
		this.canBet = canBet;
	}

	public String betEarnings(int bet, boolean win){
		if(win){
			total+=2*bet;
		}
		return "Your balance is $" + total;
	}
	
	public String placeBet(int bet){
		if(bet <= total){
		total-=bet;
		canBet=false;
		return "You have bet: $" + bet + " Your now have $"+total + " in your account";
		}
		else {
			canBet=true;
			return "I'm sorry, that bet is too high, your current balance is: $" + total;
		}
	}
	
	public boolean gameOver(){
		if(total >= 500){
			System.out.println( "You have beat me! How lucky of you! Your total winnings are: $"+ total);
			return true;
		}
		else if(total<=0){
			System.out.println("I'm sorry, you have lost all of your money. better luck next time");
			return true;
		}
		else return false;
	}
	
}
