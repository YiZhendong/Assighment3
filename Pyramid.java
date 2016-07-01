/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	private static double originalX,originalY;
	public void run() {
		for(int i=BRICKS_IN_BASE;i>0;i--){
			createBrickRow(i);
		}
	}

	private void createBrickRow(int i) {
		// TODO Auto-generated method stub
		getOriginalCoordinate(i);
		for(int j=0;j<i;j++){
			GRect brick = new GRect(originalX,originalY,BRICK_WIDTH,BRICK_HEIGHT);
			add(brick);
		}
	}

	private void getOriginalCoordinate(int i) {
		// TODO Auto-generated method stub
		originalX = (getWidth() - i*BRICK_WIDTH)/2;
		originalY = getHeight() - (BRICKS_IN_BASE -i)*BRICK_HEIGHT;
	}
}

