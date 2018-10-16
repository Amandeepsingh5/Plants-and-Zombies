
public class Plant {
	
	private String plant;
	private int cost;
	private int points;
	private int health;
	
	public Plant(String plant, int cost) {
		this.plant = plant;
		this.cost = cost;
	}
	
	public void generatePoints() { //For sunflower generating points
		points = points + 25;
	}
	
	
	
	public int decrementPoints() {
		return points -=cost;
	}
	
	
	public int decrementHealth() {
		health -= 1;
		return health;
	}
	
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		 this.health = health;
	}
	
	public void lol() {
		
	}
	

}
