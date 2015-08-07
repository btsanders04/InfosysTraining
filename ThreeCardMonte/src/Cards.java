import java.util.Random;


public class Cards {

	private String[] cards = {"A", "J", "J"};
	private boolean win = false;
	public Cards(){
	}
	
	
	public void shuffleCards(){
		Random r = new Random();
		String temp="";
		int pos1 = 0, pos2 = 0;
		for(int i=0; i< 5000; i++){
			pos1 = r.nextInt(3);
			temp = cards[pos1];
			pos2 = r.nextInt(3);
			cards[pos1]=cards[pos2];
			cards[pos2]=temp;
		}
	}
	
	public String revealCards(boolean reveal){
		if(reveal)
			return cards[0] + " " + cards[1] + " " + cards[2] +"\n0 1 2";
			else return "# # # \n0 1 2";
	}
	
	public String turnOver(int choice){
		String guess="";
		for(int i=0; i<3; i++){
			if(choice == i){
				guess += cards[choice] + " ";
			}
			else guess += "# ";
		}
		guess += "\n0 1 2";
		if(cards[choice].equals("A")){
			guess += "\nYou have won!";
			win = true;
		}
		else{
			guess += "\nIm sorry not this time.";
			win = false;
		}
		return guess;
	}


	public boolean isWin() {
		return win;
	}
	
}
