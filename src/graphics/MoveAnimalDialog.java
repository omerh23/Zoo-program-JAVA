package graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import animals.Animal;
import animals.Bear;
import animals.Elephant;
import animals.Giraffe;
import animals.Lion;
import animals.Turtle;
import mobility.Point;
import zoo.ZooActions;

public class MoveAnimalDialog extends JDialog implements ActionListener {
	
	private Point location;
	private JComboBox<String> animals_box;
	private String[] animals_string;
	private JLabel labelX;
	private JTextField x_field ;
	private JTextField y_field ;
	private JLabel labelY;
	private JPanel displayPanel;
	private JButton move;
	
	
	public MoveAnimalDialog(ZooFrame Zoo) {
		super(Zoo, "Move animal", true);
		displayPanel = new JPanel();
		displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.PAGE_AXIS));
		move = new JButton("Move");
		move.addActionListener(this);
		
		
		
		int size = Zoo.getAnimals().length ;
		int counter = 0;
		animals_string = new String[size];
		int LionCounter = 0;
		int BearCounter = 0;
		int ElephantCounter = 0;
		int GiraffeCounter = 0;
		int TurtleCounter = 0;
		
		
	
		
		for(int i = 0 ; i < size; i++) {
			
			if (Zoo.getAnimals()[i] == null)
				break;
			else {
				if (Zoo.getAnimals()[i] instanceof Lion ) {
					LionCounter++;
					animals_string[i] =  Zoo.getAnimals()[i].getClass().getSimpleName()+" "+ LionCounter;
				}
			if (Zoo.getAnimals()[i] instanceof Bear ) {
				BearCounter++;
				animals_string[i] =  Zoo.getAnimals()[i].getClass().getSimpleName()+" "+ BearCounter;
			}
			if (Zoo.getAnimals()[i] instanceof Elephant ) {
				ElephantCounter++;
				animals_string[i] =  Zoo.getAnimals()[i].getClass().getSimpleName()+" "+ ElephantCounter;
			}
			if (Zoo.getAnimals()[i] instanceof Giraffe ) {
				GiraffeCounter++;
				animals_string[i] =  Zoo.getAnimals()[i].getClass().getSimpleName()+" "+ GiraffeCounter;
			}
			if (Zoo.getAnimals()[i] instanceof Turtle ) {
				TurtleCounter++;
				animals_string[i] =  Zoo.getAnimals()[i].getClass().getSimpleName()+" "+ TurtleCounter;
			}
			}
			
		}
		ImageIcon icon =new ImageIcon("Mpicture.png");
		animals_box = new JComboBox(animals_string);
		animals_box.addActionListener(this);
		displayPanel.add(animals_box);
		displayPanel.add(labelX = new JLabel("Enter X:"));
		displayPanel.add(x_field= new JTextField());
		displayPanel.add(labelY = new JLabel("Enter Y:"));
		displayPanel.add(y_field= new JTextField());
		
		
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					int x = Integer.parseInt(x_field.getText());
					int y = Integer.parseInt(y_field.getText());
					int array_index = animals_box.getSelectedIndex();
					if(ZooActions.move(Zoo.getAnimals()[array_index],new Point(x,y))) {
						
					}
					else {
						 JOptionPane.showMessageDialog(null, "Out of bounds", 
					                "Message", JOptionPane.ERROR_MESSAGE, icon);
					}
						
				
				}
				catch(NumberFormatException err) {
			        JOptionPane.showMessageDialog(null, "Wrong input entered", 
			                "Message", JOptionPane.ERROR_MESSAGE, icon);
				}
				dispose();
			}
		
		});
		
		
		
		displayPanel.add(move);
		this.add(displayPanel);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	

}
