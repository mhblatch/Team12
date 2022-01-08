import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;


public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLocPacman() throws FileNotFoundException {
		//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "test", Color.BLUE);

		//Start The Game
		frame.startGame();

		Map map = frame.getMap();

		HashSet<Map.Type> h = new HashSet<Map.Type>();
		h.add(Map.Type.PACMAN);
		h.add(Map.Type.COOKIE);

		assertEquals(map.getLoc(new Location(1, 1)), h); 

	}

	public void testMapGetLocGhost() throws FileNotFoundException {
		//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "test", Color.BLUE);

		//Start The Game
		frame.startGame();

		Map map = frame.getMap();

		HashSet<Map.Type> h = new HashSet<Map.Type>();
		h.add(Map.Type.GHOST);
		h.add(Map.Type.COOKIE);

		assertEquals(map.getLoc(new Location(1, 2)), h); 

	}
}
