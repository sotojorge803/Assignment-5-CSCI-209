/**
 * Represents a Goblin  in the Game
 *
 * @author Jorge Soto-Ventura
 */

import java.awt.*;

class Goblin extends GamePiece {
	private static final int STEP = 4; // movement default step in pixels
    public Goblin( int x, int y, Graphics g) {
        super(x, y, g);
		// change the following to location of file:
		img = Toolkit.getDefaultToolkit().getImage( imgDir + "gremlin.gif");
		img_width = 15;
		char_width = 15;
	}
    @Override
	public void move(Game game) { // will not wrap edges of window
		Human professor = game.getHuman();
		//Moves right if professor is right
		if (professor.getXPos() > this.getXPos()) {
			xcoord  = xcoord + 2;
		}
		//Moves left if professor is left
		if (professor.getXPos() < this.getXPos()) {
			xcoord = xcoord - 2;
		}
		//Moves down if professor is down.
		if (professor.getYPos() < this.getYPos()) {
			ycoord = ycoord - 2;
		}
		//Moves up if professor is up
		if (professor.getYPos() > this.getYPos()) {
			ycoord = ycoord + 2;
		}
	}
	@Override
	public Goblin clone() throws CloneNotSupportedException {
		return (Goblin) super.clone();
	}


}