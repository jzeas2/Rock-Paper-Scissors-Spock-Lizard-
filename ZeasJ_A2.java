 import java.util.Scanner;

// This program allows the user to play rock paper scissors (spock lizard) against a computer. Once you or the computer are winning by 2 points, the 
// program will declare a winner. 
public class ZeasJ_A2 {
	 public static void main(String[] args) {
	//initializing variables
	int userlead = 0;
	boolean flag = false;
	String cpustring;
	String userchoice = "";
	int cpupoints = 0;
	int userpoints = 0;
	boolean user_cont = true;
	boolean cpuwin = false;
	//Welcomes user to rock paper Scissors.
	System.out.println("Welcome to Rock Paper Scissors!");
		// ends the program if the user or the computer is winning by 2 points
		while (user_cont == true) {
		while (flag == false){
			if (userlead > 1 || userlead < -1) {
				flag = true;
		// otherwise proceeds with another turn
			}else {
				// changes user's choice back to empty string
				userchoice = "";
				//asks user for input (r for rock p for paper s for scissors sp for spock or l for lizard). If none of these are entered, and neither is "rock" "paper" 
				//"spock" "lizard" or "scissors", asks user to enter a valid input.
				while (userchoice.equals("spock")==false && userchoice.equals("lizard")==false && userchoice.equals("rock")==false && userchoice.equals("paper")==false && userchoice.equals("scissors")==false ) {
					Scanner input = new Scanner(System.in);
					//program sleeps for 1.5 seconds before asking the user for a selection.
					try
					{
					    Thread.sleep(1500);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("\nThe computer has "+cpupoints+" point(s) and you have "+userpoints+" point(s).\n\nPlease choose Rock (r), Paper(p), Scissors(s), Spock(sp) or Lizard(l).");
					userchoice = input.nextLine();
					// changes userchoice to lower case in case capital was entered
					userchoice = userchoice.toLowerCase();
					//converts 1 digit entered by user to full word
					if (userchoice.equals("r")) {
						userchoice = "rock";
				} else if (userchoice.equals("s")) {
						userchoice = "scissors";
					} else if (userchoice.equals("p")) {
						userchoice = "paper";
					}else if (userchoice.equals("sp")) {
						userchoice = "spock";
					} else if (userchoice.equals("l")) {
						userchoice = "lizard";
						//will ask user for new input unless user inputs the words "paper" "rock" "scissors", or the letter "s" "r" or "p"
					 } else if (userchoice.equals("spock") == false && userchoice.equals("lizard") == false && userchoice.equals("paper") == false && userchoice.equals("rock") == false && userchoice.equals("scissors") == false) {
						 System.out.println("\nPlease enter a valid input.");
					 }
				}

				//creates random double between 0 and 5 (including 0 and not 5). Then chops off anything after the decimal place, giving
				// you either 0 1 2 3 or 4. 20% chance for each. 
				double random = Math.random() * 5;
				// 0 = lizard 1 = rock 2 = scissors 3 = paper 4 = spock. Variable cpuchoice will be equal to the computer's choice.
				int cpuchoice = (int)random;
				if (cpuchoice == 1) {
					cpustring = "rock";
				} else if (cpuchoice == 2) {
					cpustring = "paper";
				} else if (cpuchoice == 3){
					cpustring = "scissors";
				} else if (cpuchoice == 4) {
					cpustring = "spock";
				} else {
					cpustring = "lizard";
				}
				
				//States in console what computer chose.
				System.out.println("\nThe computer picked " + cpustring +".");

				// Compares computer and user choices, states who wins in console, and adds points to whoever wins. If both tie,
				// states that and doesn't add to either's point total.
				
				// using boolean to check if the cpu won, putting all the different conditions in the 
				//else if statement was long and confusing.
				
					//Scissors cuts Paper
				if (cpustring.equals("scissors") && userchoice.equals("paper"))
					cpuwin = true; 
					//Paper covers Rock
				else if (cpustring.equals("paper") && userchoice.equals("rock"))
					cpuwin = true;
					//Rock crushes Lizard
				else if (cpustring.equals("rock") && userchoice.equals("lizard"))
					cpuwin = true;
					//Lizard poisons Spock
				else if (cpustring.equals("lizard") && userchoice.equals("spock"))
					cpuwin = true;
					//Spock smashes Scissors
				else if (cpustring.equals("spock") && userchoice.equals("scissors"))
					cpuwin = true;
					//Scissors decapitates Lizard
				else if (cpustring.equals("scissors") && userchoice.equals("lizard"))
					cpuwin = true;
					//Lizard eats Paper
				else if (cpustring.equals("lizard") && userchoice.equals("paper"))
					cpuwin = true;
					//Paper disproves Spock
				else if (cpustring.equals("paper") && userchoice.equals("spock"))
					cpuwin = true;
					//Spock vaporizes Rock
				else if (cpustring.equals("spock") && userchoice.equals("rock"))
					cpuwin = true;
					//Rock crushes Scissors
				else if (cpustring.equals("rock") && userchoice.equals("scissors"))
					cpuwin = true;
				
				// if they pick the same, no points given to either
				if (cpustring.equals(userchoice)) {
					try
					{
					    Thread.sleep(1000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("\nYou and the computer both picked " + cpustring + ". You didn't gain or lose any points.");

				// if cpu wins, cpu gains a point, and user loses 1 point from their lead
				} else if (cpuwin == true) {
					try
					{
					    Thread.sleep(1000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("\nYou picked " + userchoice + " and the computer picked " + cpustring + ". The computer gains one point.");
					cpupoints++;
					userlead--;
					// if user wins, user gains points and 1 point is added to their lead
				} else {
					try
					{
					    Thread.sleep(1000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("\nYou picked " + userchoice + " and the computer picked " + cpustring + ". You gain one point.");
					userpoints++;
					userlead++;
				}	
	}
	
	
}
		//if user won by 2 points, says Congratulations, you won!
		if (userlead == 2) {
			try
			{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			System.out.println("\nCongratulations, you won!");
		// otherwise the computer won, and it says Sorry, you lost.
		}else {
			try
			{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			System.out.println("\nSorry, you lost.");
		}
		// asks user if they'd like to play again. Loops until user says Y or N
		boolean loop = true;
		while (loop==true) {
		Scanner input2 = new Scanner(System.in);
		//sleep 2 seconds
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		System.out.println("\nWould you like to play again? Y/N");
		String userchoice2 = input2.nextLine();
		userchoice2 = userchoice2.toLowerCase();
		if (userchoice2.equals("n")) {
			// if user says no, says thanks for playing and exits program.
			System.out.println("\nThank you for playing Rock Paper Scissors!");
			input2.close();
			user_cont = false;
			loop = false;
			// if user says yes, resets variables to default, and runs through program again.
		} else if (userchoice2.equals("y")) {
			cpupoints = 0;
			userpoints = 0;
			flag = false;
			userlead = 0;
			loop = false;
			cpuwin = false;
			// if user didn't enter Y or N, asks for valid input and loops back around
		} else {
			System.out.println("\nPlease pick either Yes (Y) or No (N)");
			
		}
		}
		}
	 }
}
