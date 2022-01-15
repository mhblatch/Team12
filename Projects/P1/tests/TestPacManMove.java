import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		//Start The Game
		frame.startGame();

		ArrayList availableMoves = pacman.get_valid_moves();

		assertTrue(pacman.move()); // check we return true for a valid move

		assertTrue(availableMoves.contains(pacman.myLoc)); // check we have moved to a valid location
	}
}
