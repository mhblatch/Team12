# PacMan Project

**Group Members:** Jose Sanchez Alarcon, Hugo Burbelo, Tim Seidell, Ali Taheri

<img src="https://github.com/cmsc388T-winter22/Team12/blob/main/Projects/P1/pacman.jpg?raw=true" alt="PacMan Image" width="200"></img>

## Running the code

In the P1 directory, run the following commands
```console
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## PacMan Class

### get_valid_moves()

- **Implementation:** Returns the set of valid moves that pacman can make given the current location on the map.
- **Test:** After placing PacMan at position (1,1) on the map, ensure that the only two possible moves are to (1,2) and (2,1)

### move()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

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

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

### attack()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

## Map Class

### move()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

### getLoc()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote

### attack()

- **Implementation:** If the squared distance between the specified ghost and pacman is less than or equal to one, then attack
- **Test:** After placing a ghost at (1,1) and pacman at (2,1), ensure that map.attack() returns true.

### eatCookie()

- **Implementation:** a description of the implementation for each function
- **Test:** a description of the test you wrote
