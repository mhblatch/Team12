import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "name", Color.red);

		//Start The Game
		frame.startGame();

		assertTrue(ghost.is_pacman_in_range()); // check we return true for a valid move

	}
}
