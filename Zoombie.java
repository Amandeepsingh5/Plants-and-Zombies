import java.util.*;

/**
 * This class creates different type of zoombies
 * 
 * @author zoha mehdi
 *
 */
public class Zoombie {
	
	private String description; //Type of zoombie
	private int health; //Zoombie health
	private int lawn_distance; //distance Zoombie has to cover to get the house 
	private levels l; //
	private ArrayList<String> zoombieArr = new ArrayList<>(); //Stores zoombies

	/**
	 * Creating zoombie
	 * @param decription - type of zoombie
	 * @param health - health assigned to each type of zoombie
	 */
	public Zoombie(String decription, int health) {
		this.description = description;
		this.health = health;
		addZoombie(description + Integer.toString(health));
		
		
	}
	/**]
	 * gets a zoombies health
	 * @return
	 */
	public int getHeath() {
		
		return health;
	}
	
	//public void setHealth(int health) {
		
		// this.health = health;
//	}
	
	
	/*
	 * Decrements the zoombies health when gets hit
	 */
	public int decrementHealth() {
		health -= 1;
		return health;
	}
	
	
	/**
	 * Sets a zoombie speed
	 */
	public void setSpeed() { //**We still have to work on this method guys
		lawn_distance =l.getDistnace();
		for(int i = 0; i < 10; i++) {
		
		}
		 lawn_distance -= 1;
	}
	
	/**
	 * Adding zoombies in the arraylist
	 * @param description
	 */
	public void addZoombie(String description) {
		zoombieArr.add(description);
	}
	
	
	
