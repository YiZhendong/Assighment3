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

	private void even(int number) {
		
		println(number+"  is even,so I make half:	"+number/2);
		number /=2;
		if(number!=1){
			if(number%2==0){
				even(number);
			}else{
				odd(number);
			}
		}
	}

	private void odd(int number) {
		println(number+"  is odd,so I make 3n+1:	"+number*3+1);
		number = 3*number+1;
		if(number!=1){
			if(number%2==0){
				even(number);
			}else{
				odd(number);
			}
		}
	}
}

