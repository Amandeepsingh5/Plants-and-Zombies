import java.util.*;

public class Zoombie {
	
	private String description;
	private int health;
	private int lawn_distance;
	private Lawn l;
	private ArrayList<String> zoombieArr = new ArrayList<>();

	public Zoombie(String decription, int health) {
		this.description = description;
		this.health = health;
		addZoombie(description + Integer.toString(health));
		
		
	}
	
	public int getHeath() {
		
		return health;
	}
	
	//public void setHealth(int health) {
		
		// this.health = health;
//	}
	
	
	
	public int decrementHealth() {
		health -= 1;
		return health;
	}
	
	
	
	public void setSpeed() {
		lawn_distance = l.getDistnace();
		for(int i = 0; i < 10; i++) {
		
		}
		 lawn_distance -= 1;
	}
	
	public void addZoombie(String description) {
		zoombieArr.add(description);
	}
	
	
	
	
	
	
}
