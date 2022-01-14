import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 2)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "name", Color.red);


		//Start The Game
		frame.startGame();

		frame.getMap().eatCookie("tok_x10_y1");
		assertEquals(frame.getMap().getCookies(), 1);

	}
}
