public abstract class Plant{
	
	private String name;
	private int cost;
	private int health;
	protected int maxHealth = 10;
	
	protected Game owner; //Literally a stand in for the reference to the reference of this object.
	
	public Plant(String nameIn, int costIn, Game inOwner) {
		name = nameIn;
		cost = costIn;
		owner = inOwner;
		health = maxHealth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
	/* General Function that contains plant functionality
	 * 		EX: Plants make sun, peashooters launch projectiles ect....
	 */
	public abstract void gameFunction();
	
	/* General Function to represent taking damage
	 * 		Expected inputs: a real interger for damage, non negative
	 * 		Expected Results: Either the plant dies, or is in a new health state
	 */
	public void takeDamage(int damage) {
		if(damage >= health) {
			this.die();
		}else {
			health -= damage;
		}
	}
	
	
	public void die() {
		//owner.removeObject(this);
	}
}