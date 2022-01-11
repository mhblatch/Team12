import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException{
		// Creates A New Map With Walls and Tokens Initialized
		MainFrame frame = new MainFrame();

		// Creates a red ghost named "name" at location x,y
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); 

		//Creates PacMan at location x, y
		PacMan pacman = frame.addPacMan(new Location(2, 1));

		// Map.attack("name") returns true if attack succeeded
		assertTrue(frame.getMap().attack("name"));
	}
}
