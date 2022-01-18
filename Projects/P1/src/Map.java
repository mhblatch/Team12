import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim) {
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}

	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
		if (type == Map.Type.PACMAN) {
			System.out.println(components.get("pacman"));
		}

	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		Location oldLoc = locations.get(name);
		HashSet<Type> priorFieldSet = field.get(locations.get(name));
		locations.remove(name);
		locations.put(name, loc);
		priorFieldSet.remove(type);
		field.put(oldLoc, priorFieldSet);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
		components.get(name).setLocation(loc.x, loc.y);
		return true;
	}

	public HashSet<Type> getLoc(Location loc) {
		HashSet<Type> priorFieldSet = new HashSet<Type>();
		priorFieldSet.add((Map.Type.WALL));
		return priorFieldSet;

	}

	public boolean attack(String Name) {
		// Ghost's position
		int ghostX = locations.get(Name).x;
		int ghostY = locations.get(Name).y;

		// PacMan's position
		int pacmanX = locations.get("pacman").x;
		int pacmanY = locations.get("pacman").y;

		// Check if squared distance is less than or equal to 1 (attack range)
		if ((pacmanX - ghostX) * (pacmanX - ghostX) + (pacmanY - ghostY) * (pacmanY - ghostY) <= 0) {
			// update gameOver
			gameOver = true;
			return true;
		}

		return false;
	}

	public JComponent eatCookie(String name) {
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1
		String[] array = name.replace("x", "").replace("y", "").split("_");
		int x = Integer.parseInt(array[1]);
		int y = Integer.parseInt(array[2]);

		Location loc = new Location(x, y);
		JComponent j = components.remove("tok_x" + x + "_y" + y);
		HashSet<Type> set = field.get(loc);
		set.remove(Type.COOKIE);
		field.replace(loc, set);
		cookies++;
		return j;
	}
}
