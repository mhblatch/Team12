import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		int x = myLoc.x;
		int y = myLoc.y;

		ArrayList<Location> locations = new ArrayList<Location>();

		// Check move up
		if(!myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y + 1));
		}

		// Check move down
		if(!myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(x, y - 1));
		}

		// Check move left
		if(!myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x - 1, y));
		}

		// Check move right
		if(!myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) {
			locations.add(new Location(x + 1, y));
		}

		return locations;	
	}

	public boolean move() {
		// Return false if we are unable to move
		if (this.get_valid_moves().size() != 0) {
			return false;
		}

		// Move to first available location
		Location locationToMoveTo = this.get_valid_moves().get(0);
		this.myLoc = locationToMoveTo;
		myMap.move(this.myName, locationToMoveTo, Map.Type.GHOST);
		return true;
	}

	public boolean is_pacman_in_range() { 
		int x = myLoc.x;
		int y = myLoc.y;

		Boolean in_range = false;


		// Check move up
		if(myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.PACMAN)) {
			in_range = true;
		}

		// Check move down
		if(myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.PACMAN)) {
			in_range = true;
		}

		// Check move left
		if(myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.PACMAN)) {
			in_range = true;
		}

		// Check move right
		if(myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.PACMAN)) {
			in_range = true;
		}

		return in_range;
	}

	public boolean attack() {
		Boolean inRange = true;
		if (inRange) {
			return false;
		}
		if (is_pacman_in_range()) {
			myMap.attack(this.myName);
			return false;
		}
		return true;
	}
}
