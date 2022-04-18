package graphics;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	private JButton clear; 
	private JButton food; 
	private ImageIcon icon;
	private Image food_icon;
	private JPanel food_panel;
	private ZooPanel a;
	private BufferedImage food_image;

	private ImageIcon image_background;
	public ZooFrame() {
		super("Zoo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.menubar = new JMenuBar();
		this.setJMenuBar(this.menubar);	
		food_panel = new JPanel();
		
		icon =new ImageIcon("Mpicture.png");
		
		
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
		
		JPanel southPanel = new  JPanel();
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.LINE_AXIS));
		this.add_animal = new JButton("Add animal");
		southPanel.add(add_animal);
		this.add_animal.addActionListener(this);
		this.move_animal = new JButton("Move animal");
		southPanel.add(this.move_animal);
		this.move_animal.addActionListener(this);
		southPanel.add(clear = new JButton("Clear"));
		clear.addActionListener(this);
		southPanel.add(this.food = new JButton("Food"));
		food.addActionListener(this);
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
	
			//ImageIcon icon = new ImageIcon("Mpicture.png");
	        JOptionPane.showMessageDialog(null, "Home Work 2 GUI", 
	                "Message", JOptionPane.INFORMATION_MESSAGE, icon);
			
		}
		
		
		if (e.getSource() ==this.add_animal) {
			new AddAnimalDialog(this);
		}
		
		if (e.getSource() ==this.move_animal) {
			new MoveAnimalDialog(this);
		}
		
		if(e.getSource() == clear) {
			this.DeleteAllAnimals();
		}
			
		if(e.getSource() == this.food) {
			
			JDialog foodDialog = new JDialog(this , "Food for animlas", true);  
	        JButton Lettuce = new JButton ("Lettuce");
	        Lettuce.addActionListener(new ActionListener() {
        		
        		@Override
        		public void actionPerformed(ActionEvent e1) {
        			try {
						food_image = ImageIO.read(new File("lettuce.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			if(a != null)
        			a.removeAll();
        			a = new ZooPanel(food_image);
        			a.repaint();
        			add(a);		
        			
        			foodDialog.dispose();
        			
        }
        		
		});
	        
	        JButton Cabbage = new JButton ("Cabbage");
	        Cabbage.addActionListener(new ActionListener() {
        		
        		@Override
        		public void actionPerformed(ActionEvent e1) {
        			try {
						food_image = ImageIO.read(new File("cabbage.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			if(a != null)

        			a.removeAll();
        			a = new ZooPanel(food_image);	
        			a.repaint();
        			add(a);		
        			foodDialog.dispose();
        			
        }
        		
		});
	        JButton Meat = new JButton ("Meat"); 
	        Meat.addActionListener(new ActionListener() {
        		
        		@Override
        		public void actionPerformed(ActionEvent e1) {
        			try {
						food_image = ImageIO.read(new File("meat.gif"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			if(a != null)

        			a.removeAll();
        			a = new ZooPanel(food_image);
        			a.repaint();
        			add(a);		
        			
        			foodDialog.dispose();
        			
        }
        		
		});
	        JLabel foodLabel = new JLabel("Please choose food");
	        foodLabel.setIcon(icon);
	        foodLabel.setIconTextGap(30);
	        JPanel panel = new JPanel();
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new FlowLayout());
	        buttonPanel.add(Lettuce);
	        buttonPanel.add(Cabbage);
	        buttonPanel.add(Meat);
	        panel.setLayout(new BorderLayout());
	        panel.add(buttonPanel, BorderLayout.SOUTH);
	        panel.add(foodLabel,BorderLayout.CENTER);
	        foodDialog.add(panel);
	        foodDialog.pack();    
	        foodDialog.setVisible(true); 
	        this.setVisible(true);
	       
			
	        
			
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
			
			JOptionPane.showMessageDialog(null, "You cannot add more than 10 animlas", 
                "Message", JOptionPane.ERROR_MESSAGE, icon);
	}
	}
	
	public Animal[] getAnimals() {
		return this.animals_list;
	}
	
	public void DeleteAllAnimals() {
		for(int i = 0 ; i < animals_list.length ; i++ ) {
			animals_list[i] = null;
		}
	}
	
	

}
