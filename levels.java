import java.util.*;
 /**
  * This class sets the field for diiferent level
  * @author zmehd
  *
  */
public class levels {
	
	private int distance;  //Distance for zoombies to cover to get the house
	private String description; //What level is it
	
	/**
	 * Creates level
	 * @param description
	 */
	public levels(String description) {
		this.description = description;
	}
	 /**
	  * Sets the distance of the level or the length of the feild
	  * @param lawn_distance
	  * @return
	  */
	public int setDistance(int lawn_distance) {
		return this.distance = this.distance;
	}
	
	/**
	 * Gets distance of a particular level field
	 * @return
	 */
	public int getDistnace() {
		return distance;
	}
	 /**
	  * Description of the level
	  * @return
	  */
	public String getDescription() {
		return description;
	}

}
