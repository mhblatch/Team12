# PacMan Project

**Group Members:** Jose Sanchez Alarcon, Hugo Burbelo, Tim Seidell, Ali Taheri

<img src="https://github.com/cmsc388T-winter22/Team12/blob/main/Projects/P1/pacman.jpg?raw=true" alt="PacMan Image" width="200"></img>

## Running the code

In the P1 directory, run the following commands
```console
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```
## The game
![Screen Shot 2022-01-10 at 10 07 03 PM](https://user-images.githubusercontent.com/30019505/148874489-acb5fc3b-6765-4b39-89a3-b974b09ae1ba.png)

## PacMan Class

### get_valid_moves()

- **Implementation:** Returns the set of valid moves that pacman can make given the current location on the map.
- **Test:** After placing PacMan at position (1,1) on the map, ensure that the only two possible moves are to (1,2) and (2,1)

### move()

- **Implementation:**  This method uses the get_valid_moves method to find the possible locations that PacMan can move, given his current location. The method then chooses to move in one of those directions.
- **Test:** Tests that when called, the method returns true when we have successfully moved and that the pacman's new location is a valid position to move to.

### is_ghost_in_range()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

### consume()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

## Ghost Class

### get_valid_moves()

- **Implementation:** Returns the set of valid moves that a ghost can make given the current location on the map.
- **Test:** After placing PacMan at position (1,1) on the map, ensure that the only two possible moves are to (1,2) and (2,1)

### move()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

### is_pacman_in_range()

- **Implementation:** This function checks its surroundings to see if PacMan is in attack range, and returns true if the pacman is within the range. Otherwise, the method returns false.
- **Test:** There are two tests for this, and each checks if the method returns true/false in the correct scenario.

### attack()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

## Map Class

### move()

- **Implementation:** 
- **Test:** 

### getLoc()

- **Implementation:** For the given location argument, returns what is currently at the location (Empty, Pacman, Cookie, Ghost, Wall).
- **Test:** Tests two different scenarios - one where a ghost is at the location, and one where the pacaman is at the location.

### attack()

- **Implementation:** If the squared distance between the specified ghost and pacman is less than or equal to one, then attack
- **Test:** After placing a ghost at (1,1) and pacman at (2,1), ensure that map.attack() returns true.

### eatCookie()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote
