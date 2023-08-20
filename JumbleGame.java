package jumbleGame;

import java.util.Scanner;

public class JumbleGame {

	public void showmenu() {
		System.out.println("Welcome to the Jumble Game");
		System.out.println("");
		
		System.out.println("**********GAME MENU**********");
		System.out.println("1. Play Game n2. View Instruction \n3. Exit Game");
		
		System.out.println();
		System.out.print("Enter your option here: ");
		
		try {

			//Reading user input
		
			Scanner userInput = new Scanner(System.in);
			
			int menuOption = userInput.nextInt();
			
			switch (menuOption) {
			case 1: playGame();
			break;
			case 2: viewInstruction();
			break;
			case 3: exitGame();
			break;
			default: System.out.println("Invalid input");
			System.out.println("");
			showmenu();
			}
			
		} catch (Exception e) {
			System.out.println("Wrong Menu option, kindly select the right menu");
			System.out.println("");
			showmenu();
			
			
		}

		
	}
	
	//Play Game Method begins Here
	void playGame () {
		int gameCount;
		for (gameCount = 0; gameCount < 5; gameCount++ ) {
			System.out.print("Choose a word: ");
			Scanner userWord = new Scanner(System.in);
			String jumbledWord = userWord.next().trim();
			if (jumbledWord.equalsIgnoreCase("Dog") ) {
				System.out.println("Congratualtions your chosen word " + "\""+jumbledWord+"\""+ " is correct");
				break;
				
			}else {
				System.out.println("\""+jumbledWord+"\""+ " is wrong, please choose another word");	
				continue;
			}
		}System.out.println("Sorry, you have exhausted yoour chances");
	}//Play Game Method ends Here
	
	
	void viewInstruction () {
		System.out.println("Guess a the secrete word. You have 5 attempts only");
		
		
	}
	
	void exitGame() {
		System.out.println("Bye");
		System.exit(0);
		
		
	}
	

	public static void main(String[] args) {
		JumbleGame menu = new JumbleGame();
		menu.showmenu();
	
		
	}
		

}
		