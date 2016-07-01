/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class RaiseToPower extends ConsoleProgram {
	public void run() {
		/* Sit in a loop reading bases and exponents and printing out the values
		 * produced by raising the base to the exponent.
		 */
		while (true) {
			double base  = readDouble("Enter base: ");
			int exponent = readInt("Enter exponent: ");
			println(base + " ^ " + exponent + " = " + raiseToPower(base, exponent));
		}
	}
	
	private double raiseToPower(double base, int exponent) {
		/* 
		 * if exponent = 0,then return 1,
		 * else if exponent > 1,return base^exponent,
		 * else return 1/(base^exponent)
		 */
		if(exponent ==0 ){
			return 1;
		}else if(exponent > 0){
			double temp = 1;
			for (int i=0;i<exponent;i++){
				temp = temp * base; 
			}
			return temp;
		}else{
			double temp = 1;
			for (int i=0 ; i<-exponent ;i++){
				temp = temp * base;
			}
			return 1/temp;
		}
	}
}
