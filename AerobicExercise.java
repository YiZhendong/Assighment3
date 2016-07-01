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
		for(int i = 1 ;i < 8; i++){
			int value = readInt("How many minutes of asrobic Execrcise did you do on day "+i+":");
		}
	}

	private void showAdvice() {
		// TODO Auto-generated method stub
		
	}
}
