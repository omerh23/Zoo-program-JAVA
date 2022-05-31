package momento;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import mobility.Point;

public class CareTaker {
	
	private ArrayList<ArrayList<Point>> location_list = new ArrayList<ArrayList<Point>>();
	
	public void addMomento(MomentoZoo m) {
		if(location_list.size()<3) {
		location_list.add(m.getState());
		}
		else {
			location_list.remove(0);
			location_list.add(m.getState());

		}
	}
	
	public ArrayList<Point> getMomento() {
		try {
		return location_list.remove(location_list.size()-1);
		}
		catch(IndexOutOfBoundsException error) {
			ImageIcon icon =new ImageIcon("Mpicture.png");
			JOptionPane.showMessageDialog(null, "no memento saved", 
                "Message", JOptionPane.ERROR_MESSAGE, icon);
	}
		return null;
	}

	public boolean isEmpty() {
		return location_list.isEmpty();
	}
}