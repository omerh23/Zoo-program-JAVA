package plants;

import java.awt.Graphics;

import graphics.ZooPanel;
import utilities.MessageUtility;

/**
 * @author baroh
 *
 */
public class Lettuce extends Plant {
	public Lettuce(ZooPanel zoopanel) {
		super(zoopanel);
		MessageUtility.logConstractor("Lettuce", "Lettuce");
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
