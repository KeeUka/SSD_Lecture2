package model;

public class Game {

	public static final long DELAY = 10;

	private World world;
	private boolean over;
	private long startTime;
	private long timeInGame;

	// TODO: Need a list to store commands.
	
	public Game() {
		world = new World();
	}

	public void startGame() {
		world.reset();
		over = false;
		startTime = System.currentTimeMillis();
		while (!over) {
			timeInGame = System.currentTimeMillis() - startTime;
			world.update();
			over = world.playerHitWalls();
			delay();
		}
	}

	public void startReplay() {
		// TODO: Implement this method 
	}
	
	public boolean isOver() {
		return over;
	}
	
	public long getTimeInGame() {
		return timeInGame;
	}
	
	public Point getWorldSize() {
		return world.getSize();
	}

	public Point getPlayerLocation() {
		return world.getPlayer().getLocation();
	}

	public int getPlayerRadius() {
		return world.getPlayer().getRadius();
	}

	public void turnPlayerWest() {
		// TODO: Use command pattern
		world.getPlayer().turnWest();
	}

	public void turnPlayerEast() {
		// TODO: Use command pattern
		world.getPlayer().turnEast();
	}

	public void turnPlayerNorth() {
		// TODO: Use command pattern
		world.getPlayer().turnNorth();
	}

	public void turnPlayerSouth() {
		// TODO: Use command pattern
		world.getPlayer().turnSouth();
	}

	private void delay() {
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
