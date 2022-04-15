package graphics;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import animals.Animal;
import animals.Lion;


public class ZooFrame extends JFrame implements ActionListener {
	
	
	
	
	private JMenuBar menubar;
	private JMenu file;
	private JMenu background;
	private JMenu help;
	private JMenuItem image;
	private JMenuItem exit;
	private JMenuItem green;
	private JMenuItem none;
	private JMenuItem help_item;
	private JLabel label;
	private JButton add_animal;
	private JButton move_animal;
	private Animal animals_list[];
	private int count_animals = 0;
	private String[] animals_names;
	
	

	private ImageIcon image_background;
	public ZooFrame() {
		super("Zoo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.menubar = new JMenuBar();
		this.setJMenuBar(this.menubar);
		
		animals_list = new Animal[10]; 

		
		this.file = new JMenu("File");
		this.menubar.add(this.file);
		this.exit = new JMenuItem("Exit");
		this.exit.addActionListener(this);
		this.file.add(exit);
		
		
		this.background = new JMenu("Background");
		this.menubar.add(this.background);
		this.image = new JMenuItem("Image");
		this.background.add(this.image);
		this.image.addActionListener(this);
		
		this.green = new JMenuItem("Green");
		this.green.addActionListener(this);
		this.background.add(green);
		this.none = new JMenuItem("None");
		this.background.add(none);
		this.none.addActionListener(this);
		
		this.help = new JMenu("Help");
		this.menubar.add(this.help);
		this.help_item = new JMenuItem("Help");
		this.help.add(help_item);
		this.help_item.addActionListener(this);
		
		this.label = new JLabel();
		this.add(label);
		this.image_background = new ImageIcon("hh.jpg");
		
		ZooPanel southPanel = new  ZooPanel();
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.LINE_AXIS));
		this.add_animal = new JButton("Add animal");
		southPanel.add(add_animal);
		this.add_animal.addActionListener(this);
		this.move_animal = new JButton("Move animal");
		southPanel.add(this.move_animal);
		this.move_animal.addActionListener(this);
		southPanel.add(new JButton("Clear"));
		southPanel.add(new JButton("Food"));
		southPanel.add(new JButton("Info"));
		southPanel.add(new JButton("Exit"));
		this.add(southPanel, BorderLayout.SOUTH);

		
		
		
		
		this.setVisible(true);
		this.pack();
		this.setSize(450,300);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == this.exit) {
			System.exit(0);
		}
		
		if (e.getSource() == this.image) {
			
			this.label.setIcon(null);
			this.label.setIcon(image_background);
			this.label.setOpaque(true);
		}
		if(e.getSource() == this.green) {
			this.label.setIcon(null);
			this.label.setBackground(Color.GREEN);
			this.label.setOpaque(true);
			
		
		}
		
		if(e.getSource() == this.none) {
			this.label.setIcon(null);
			this.label.setBackground(Color.WHITE);
			this.label.setOpaque(true);
		}
		
		if (e.getSource() ==this.help_item) {
	
			ImageIcon icon = new ImageIcon("Mpicture.png");
	        JOptionPane.showMessageDialog(null, "Home Work 2 GUI", 
	                "Message", JOptionPane.INFORMATION_MESSAGE, icon);
			
		}
		
		
		if (e.getSource() ==this.add_animal) {
			new AddAnimalDialog(this);
		}
		
		if (e.getSource() ==this.move_animal) {
			new MoveAnimalDialog(this);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		new ZooFrame();
	
	}

	public void addAnimalAlist(Animal animal) {
		try {
			this.animals_list[count_animals] =  animal;
			this.count_animals ++;
			
		}
		catch(ArrayIndexOutOfBoundsException error) {
			ImageIcon icon =new ImageIcon("Mpicture.png");
			JOptionPane.showMessageDialog(null, "Max animals in the zoo", 
                "Message", JOptionPane.ERROR_MESSAGE, icon);
	}
	}
	
	public Animal[] getAnimals() {
		return this.animals_list;
	}

}
