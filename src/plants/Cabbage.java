package plants;

import graphics.ZooPanel;
import utilities.MessageUtility;

/**
 * @author baroh
 *
 */
public class Cabbage extends Plant {
	public Cabbage(ZooPanel zoopanel) {
		super(zoopanel);
		MessageUtility.logConstractor("Cabbage", "Cabbage");
	}

}
