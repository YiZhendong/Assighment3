/* The program is to compute a number ,show the process of the hailstone.
 * 
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int number = readInt("Please input an positive Integer:");
		if(number!=1){
			if(number%2==0){
				even(number);
			}else{
				odd(number);
			}
		}
		
	}

	private int even(int number) {
		// TODO Auto-generated method stub
		println(number+"  is even,so I make half:	"+number/2);
		number /=2;
		return number;
	}

	private void odd(int number) {
		// TODO Auto-generated method stub
		
	}
}

