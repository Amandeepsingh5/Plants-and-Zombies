public interface Plant{
	
	private String name;
	private int cost;
	private int health;
	private int maxHealth;
	
	private var owner; //Literally a stand in for the reference to the reference of this object.
	
	public Plant(String nameIn, int costIn) {
		name = nameIn;
		cost = costIn;
	}
	
	/* General Function that contains plant functionality
	 * 		EX: Plants make sun, peashooters launch projectiles ect....
	 */
	public gameFunction()
	
	/* General Function to represent taking damage
	 * 		Expected inputs: a real interger for damage, non negative
	 * 		Expected Results: Either the plant dies, or is in a new health state
	 */
	public takeDamage(int damage) {
		if(damage >= health) {
			this.die();
		}else {
			health -= damage;
		}
	}
	
	
	public die() {
		owner.removeObject(this);
	}
}