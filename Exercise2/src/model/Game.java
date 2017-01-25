package model;

public class Game {

	public static final long DELAY = 10;

	private World world;
	private boolean gameOver;

	public Game() {
		world = new World();
	}

	public void start() {
		gameOver = false;
		while (!gameOver) {
			world.update();
			gameOver = world.playerHitWalls();
			delay();
		}
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
		world.getPlayer().turnWest();
	}

	public void turnPlayerEast() {
		world.getPlayer().turnEast();
	}

	public void turnPlayerNorth() {
		world.getPlayer().turnNorth();
	}

	public void turnPlayerSouth() {
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
