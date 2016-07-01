/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class SaintPetersburgGame extends ConsoleProgram {
	/** The total number*/
	public static double total = 0;
	
	public void run() {
		while(total<=20){
			playGame();
		}
		
	}

	private void playGame() {
		// TODO Auto-generated method stub
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
