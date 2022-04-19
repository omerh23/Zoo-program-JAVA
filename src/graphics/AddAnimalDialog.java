package graphics;

import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import animals.*;

import food.IEdible;

public class AddAnimalDialog extends JDialog  implements IAnimalBehavior,IDrawable,ActionListener {
	
	private JLabel label;
	private JComboBox<String> box;
	private JLabel size_label;
	private JLabel horizon_speed_label;
	private JLabel vertical_speed_label;
	private  JTextField size_field;
	private  JTextField horizon_speed_field;
	private  JTextField vertical_speed_field;
	private JPanel displayPanel;
	private JComboBox<String> animal_color;
	private JButton create;
	//private Animal animals_array[];
	//private int count_animals = 0;
	private String colors[]= {"Red","Blue","Natural"};
	private String[] animals = {"Lion","Bear","Elephant","Giraffe","Turtle"};
	
	
	
	// TODO add color logic and size to animals 
	public AddAnimalDialog(ZooFrame Zoo) {
		super(Zoo, "Add animal", true);
		displayPanel = new JPanel();
		create = new JButton("Create");
		create.addActionListener(this);
		box = new JComboBox(animals);
		box.addActionListener(this);
		animal_color = new JComboBox(colors);
		animal_color.addActionListener(this);
		displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.PAGE_AXIS));
		ImageIcon icon =new ImageIcon("Mpicture.png");
		//animals_array = new Animal[10]; 

		this.label = new JLabel();
		this.label = new JLabel("Select animal");
		this.label.setVerticalTextPosition(JLabel.TOP);
		this.label.setHorizontalAlignment(JLabel.LEFT);
		displayPanel.add(label);
		displayPanel.add(box);
		displayPanel.add(size_label = new JLabel("Size:"));
		displayPanel.add(size_field= new JTextField());
		displayPanel.add(horizon_speed_label = new JLabel("Horizon speed:"));
		displayPanel.add(horizon_speed_field= new JTextField());
		displayPanel.add(vertical_speed_label = new JLabel("Vertical speed:"));
		displayPanel.add(vertical_speed_field= new JTextField());
		displayPanel.add(animal_color);
		
		create.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
				try {
					String animal_choosen = box.getItemAt(box.getSelectedIndex());
					int size = Integer.parseInt(size_field.getText());
					int horizon_speed = Integer.parseInt(horizon_speed_field.getText());
					int vertical_speed = Integer.parseInt(vertical_speed_field.getText());
					String color = animal_color.getItemAt(box.getSelectedIndex());
					
					
					String name = "default";
					float weight = 0;
					switch(animal_choosen) { //need to change all animals constructors to add weight
					case "Lion":
						weight = (float) (size * 0.8);
						
						Animal lion = new Lion(name,weight,color);
						lion.setHorSpeed(horizon_speed);
						lion.setVerSpeed(vertical_speed);
						lion.setSize(size);
						Zoo.addAnimalAlist(lion);				
						break;
						
					case "Bear":
						weight = (float) (size * 1.5);
						Animal bear = new Bear(name,weight,color);
						bear.setHorSpeed(horizon_speed);
						bear.setVerSpeed(vertical_speed);
						bear.setSize(size);
						Zoo.addAnimalAlist(bear);						
						break;
						
					case "Giraffe":
						weight = (float) (size * 2.2);					
						Animal giraffe = new Giraffe(name,weight,color);
						giraffe.setHorSpeed(horizon_speed);
						giraffe.setVerSpeed(vertical_speed);
						giraffe.setSize(size);
						Zoo.addAnimalAlist(giraffe);					
						break;

						
					case "Elephant":
						weight = size * 10;				
						Animal elephant = new Elephant(name,weight,color);
						elephant.setHorSpeed(horizon_speed);
						elephant.setVerSpeed(vertical_speed);
						elephant.setSize(size);
						Zoo.addAnimalAlist(elephant);						
						break;

						
					case "Turtle":
   					    weight = (float) (size * 0.5);		
						Animal turtle = new Turtle(name,weight,color);
						turtle.setHorSpeed(horizon_speed);
						turtle.setVerSpeed(vertical_speed);
						turtle.setSize(size);
						Zoo.addAnimalAlist(turtle);						
						break;

						
					}
				
				
				
			
			}
				catch(NumberFormatException err) {
			        JOptionPane.showMessageDialog(null, "Wrong input entered", 
			                "Message", JOptionPane.ERROR_MESSAGE, icon);
				}
				
//				catch(ArrayIndexOutOfBoundsException error) {
//					JOptionPane.showMessageDialog(null, "Max animals in the zoo", 
//			                "Message", JOptionPane.ERROR_MESSAGE, icon);
//				}
						
			dispose();	
			
			}});
		
		displayPanel.add(create);
		
		this.add(displayPanel);
		
		
		this.pack();
		this.setVisible(true);
	}
	
	
	
	

	@Override
	public void loadImages(String nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawObject(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		
		int x = 2;
		
		return x;
	}

	@Override
	public void eatInc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getEatCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getChanges() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setChanges(boolean state) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	


}//class
		
	




