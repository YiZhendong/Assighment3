/* The Saint Petersburg Game  is a hypothetical casino game played by two players 
 * I begin by putting $1 on the table, and you then repeatedly flip a coin until it comes up tails. 
 * Each time the coin comes up heads, I double the amount of money on the table.
 * As soon as the coin comes up tails, the game is over and you win all the money.
 * program that plays the Saint Petersburg Game as many times as is necessary to earn a total of at least $20. 
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class SaintPetersburgGame extends ConsoleProgram {
	/** The total number*/
	public static double total = 0;
	
	public void run() {
		
		//when total id less than 20,repeat the game; 
		while(total<=20){
			playGame();
		}
		
	}

	private void playGame() {
		//play a game until this turn comes up tail,then plus the number to total.
		Boolean comesUpHead = true;
		int num = 0;
		while(comesUpHead){
			RandomGenerator rgen = RandomGenerator.getInstance();
			comesUpHead = rgen.nextBoolean();
			num++;
		}
		println("This game, you earned $"+Math.pow(2, num)+".");
		total = total + Math.pow(2, num);
		println("Your total is $"+total+".");
	}
}
