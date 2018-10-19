
public class Zombie {

	private int health;
	private boolean alive;
	
	public Zombie(int i) {
		setHealth(i);
		alive = true;
	}
	


	/*public Zombie(String type, int i) {
		setHealth(i);
	}*/
	

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void takeDamage() {
		setHealth(getHealth()-1);
		
	}

}
