import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		// Creates A New Map With Walls and Tokens Initialized
		MainFrame frame = new MainFrame();

		// Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		
		// Created expected result
		ArrayList<Location> expected = new ArrayList<Location>();
		expected.add(new Location(1, 2));		// Up
		expected.add(new Location(2, 1)); 		// Right

		// Test Expected result
		assertEquals(expected, pacman.get_valid_moves());
	}
}
