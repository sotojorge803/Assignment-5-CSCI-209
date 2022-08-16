/**
 * Represents the Treasure in the Game
 *
 * @author Jorge Soto-Ventura
 */

import java.util.Random;
import java.awt.*;
class Treasure extends GamePiece {
    private Random rand = new Random();
	private static final int STEP = 4; // movement default step in pixels

    public Treasure( int x, int y, Graphics g) {
            super(x, y, g);
		    // change the following to location of file:
            img = Toolkit.getDefaultToolkit().getImage( imgDir + "gem.gif");
            img_width = 15;
		    char_width = 15;
    }
    @Override
	public void move(Game game) { 
        //Create a upperbound for the random number generator.
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        // if statement that move treasure if random number generator equals 1.
        if (int_random == 1) {
            int xCorUpperBound = (Game.XBOUND - img_width);
            int yCorUpperBound = (Game.YBOUND - 20);
            // Creates new x and y coordinates for the treasure
            int y_random = rand.nextInt(yCorUpperBound);
            int x_random = rand.nextInt(xCorUpperBound);
            xcoord = x_random;
            ycoord = y_random;

        }
    }
// ------------------- accessor methods -------------------
	
    @Override
	public Treasure clone() throws CloneNotSupportedException {
		return (Treasure) super.clone();
	}







}