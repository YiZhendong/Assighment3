/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AerobicExercise extends ConsoleProgram {
	private static final int carHealthTimes = 0;
	private static final int bloHealthTimes = 0;
	public void run() {
		
		inputMinutes();
		showAdvice();
	}

	private void inputMinutes() {

		for(int i = 1 ;i < 8; i++){
			int value = readInt("How many minutes of asrobic Execrcise did you do on day "+i+":");
			if (value > 30) carHealthTimes ++;
			if (value > 40) bloHealthTimes ++;
		}
	}

	private void showAdvice() {
		// TODO Auto-generated method stub
		
	}
}
