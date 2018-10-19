
public class Sunflower extends Plant {

	private int strength = 3;
	protected int maxHealth = 20;
	
	public Sunflower( Game inOwner) {
		super(inOwner);
		name = "Sunflower";
		cost = 1;
	}

	@Override
	public void gameFunction() {
		owner.gainSun(strength);
	}

}
