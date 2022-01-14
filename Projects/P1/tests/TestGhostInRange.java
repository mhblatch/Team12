import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRangeTrue() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "test", Color.BLUE);

		//Start The Game
		frame.startGame();

		assertTrue(ghost.is_pacman_in_range()); // check we have moved to a valid location

	}

	public void testGhostInRangeFalse() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(3, 4), "test", Color.BLUE);

		//Start The Game
		frame.startGame();

		assertFalse(ghost.is_pacman_in_range()); // check we have moved to a valid location

	}
}

