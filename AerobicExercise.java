/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AerobicExercise extends ConsoleProgram {
	public void run() {
		inputMinutes();
		showAdvice();
	}

	private void inputMinutes() {
		int carHealthTimes = 0;
		int bloHealthTimes = 0;
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
