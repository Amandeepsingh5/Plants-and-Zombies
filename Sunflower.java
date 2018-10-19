
public class Sunflower extends Plant {

	private int strength = 3;
	protected int maxHealth = 20;
	
	public Sunflower(String nameIn, int costIn, Game inOwner) {
		super(nameIn, costIn, inOwner);
	}

	@Override
	public void gameFunction() {
		owner.gainSun(strength);
	}

}
