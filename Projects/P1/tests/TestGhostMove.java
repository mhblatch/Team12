import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		Ghost g = frame.addGhost(new Location(1, 1), "blinky", Color.CYAN);

		//Start The Game
		frame.startGame();

		ArrayList availableMoves = g.get_valid_moves();

		assertTrue(g.move()); // check we return true for a valid move

		assertTrue(availableMoves.contains(g.myLoc)); // check we have moved to a valid location
	
	}
}
