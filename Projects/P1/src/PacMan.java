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
			locations.add(new Location(x, y));
		}

		// Check move down.
		if(!myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y));
		}

		// Check move left.
		if(!myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y));
		}

		// Check move right.
		if(!myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y));
		}

		return locations;	
	}

	public boolean move() {
		// System.out.println("Moved to: " + this.myLoc.x + ", " + this.myLoc.y);
		// System.out.println(this.get_valid_moves());
		// Return false if we are unable to move
		if (this.get_valid_moves().size() != 0) {
			return false;
		}

		// Move to first available location
		Location locationToMoveTo = this.get_valid_moves().get(0);
		this.myLoc = locationToMoveTo;
		myMap.move(this.myName, locationToMoveTo, Map.Type.PACMAN);
		
		// System.out.println(locationToMoveTo);
		return true;
	}

	public boolean is_ghost_in_range() { 
		int x = myLoc.x;
		int y = myLoc.y;

		Boolean in_range = false;


		if(myMap.getLoc(new Location(x, y)).contains(Map.Type.GHOST)) {
			in_range = true;
		}

		if(myMap.getLoc(new Location(x, y)).contains(Map.Type.GHOST)) {
			in_range = true;
		}

		if(myMap.getLoc(new Location(x, y)).contains(Map.Type.GHOST)) {
			in_range = true;
		}

		if(myMap.getLoc(new Location(x, y)).contains(Map.Type.GHOST)) {
			in_range = true;
		}

		return in_range;
	}

	public JComponent consume() { 
		int x = myLoc.x;
		int y = myLoc.y;
 		if (!myMap.getLoc(new Location(x, y)).contains(Map.Type.COOKIE)) {
			return myMap.eatCookie("tok_x" + String.valueOf(x) + "_y" + String.valueOf(y));
		 }
		return null;
	}
}
