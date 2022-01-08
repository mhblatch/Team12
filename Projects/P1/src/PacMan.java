import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift;

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		int x = myLoc.x;
		int y = myLoc.y;

		ArrayList<Location> locations = new ArrayList<Location>();

		// Check move up.
		if(!myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y + 1));
		}

		// Check move down.
		if(!myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y - 1));
		}

		// Check move left.
		if(!myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x - 1, y));
		}

		// Check move right.
		if(!myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x + 1, y));
		}

		return locations;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
