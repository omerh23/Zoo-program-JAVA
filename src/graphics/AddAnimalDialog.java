package graphics;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	private String[] animals = {"Lion","Bear","Elephant","Giraffe","Turtle"};
	
	
	
	public AddAnimalDialog(JFrame Zoo) {
		super(Zoo, "Add animal", true);
		displayPanel = new JPanel();
		box = new JComboBox(animals);
		box.addActionListener(this);
		displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.PAGE_AXIS));


//		displayPanel.setBorder(BorderFactory.createCompoundBorder(
//				BorderFactory.createTitledBorder("selected animal"),
//				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
//				displayPanel.setPreferredSize(new Dimension(250,250));
//				displayPanel.setLayout(new FlowLayout());
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
		this.add(displayPanel);
		
		
		this.pack();
		this.setSize(420,420);
		
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
		//"choose animal","Lion","Bear","Elephant","Giraffe","Turtle"}
	
		if(e.getSource()== box) {
			
//			switch(box.getItemAt(box.getSelectedIndex())) {
//			
//			case "Lion":
				String animal_choosen = box.getItemAt(box.getSelectedIndex());
				
				
				
				
				
				
				
				
				
				
//				break;
				
//			case "Bear":break;
//			
//			case "Elephant" : break;
//			
//			case "Giraffe" : break;
//			
//			case "Turtle" : break;
			
			
			
			}
			
			
			
		}
	}
		
	




