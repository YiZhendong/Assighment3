/* The program is to compute a number ,show the process of the hailstone.
 * hailstone number: Start with any positive integer (an initial seed)
 * and obtain a sequence of numbers by following these rules.
 * 1. If the current number is even, divide it by two   ; 
 *   else if it is odd, multiply it by three and add one. 
 * 2. Repeat.
 * 
 * Let's try a few numbers to see what happens: 
 *	n=3; 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ... 
 *	n=4; 2, 1, 4, 2, 1, ... 
 *	n=5; 16, 8, 4, 2, 1, 4, 2, 1, ... 
 *	n=6; 3, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ... 
 *	n=7; 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1, ...
 * 
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int number = readInt("Please input an positive Integer:");
		if(number%2==0){
			even(number);
		}else{
			odd(number);
		}
	}

	/*
	 * when the number is even,divide it by two.
	 */
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

