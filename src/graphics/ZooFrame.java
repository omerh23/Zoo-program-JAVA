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
import diet.Carnivore;
import diet.IDiet;
import factory.AnimalFactory;
import factory.FactoryProducer;

 /**
  * Class that the main frame of the zoo.
  * @author Vladislav Shevtsov id: 322162553; Omer Halfon id: 315429951
  *
  */
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
	private JButton add_animal;
	private JButton sleep;
	private JButton wake_up;
	private Animal animals_list[];
	private String[] animals_names;
	private JButton clear; 
	private JButton food;
	private JButton info;
	private JButton exit_button;
	private ImageIcon icon;
	private Image food_icon;
	private JPanel food_panel;
	private ZooPanel a;
	
	private ZooPanel zoopanel;
	private BufferedImage img = null;
	private static final int LETTUCE = 1; 
	private static final int CABBAGE = 2;
	private static final int MEAT = 3;
	private static final int DELETE = 4;
	 
	public ZooFrame() {
		super("Zoo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.menubar = new JMenuBar();
		this.setJMenuBar(this.menubar);	
		food_panel = new JPanel();
		zoopanel = ZooPanel.getInstance();
		//this.zoopanel = new ZooPanel();
		zoopanel.startPanelThread();
		icon =new ImageIcon("Mpicture.png");
		
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
		
		
		JPanel southPanel = new  JPanel();
		southPanel.setLayout(new FlowLayout());
		this.add_animal = new JButton("Add animal");
		southPanel.add(add_animal);
		this.add_animal.addActionListener(this);
		this.sleep = new JButton("Sleep");
		southPanel.add(this.sleep);
		this.sleep.addActionListener(this);
		this.wake_up = new JButton("Wake up");
		southPanel.add(this.wake_up);
		this.wake_up.addActionListener(this);
		southPanel.add(clear = new JButton("Clear"));
		clear.addActionListener(this);
		southPanel.add(this.food = new JButton("Food"));
		food.addActionListener(this);
		southPanel.add(info = new JButton("Info"));
		info.addActionListener(this);
		southPanel.add(exit_button = new JButton("Exit"));
		exit_button.addActionListener(this);
		this.add(southPanel, BorderLayout.SOUTH);
		this.add(zoopanel);
	
		this.setVisible(true);
		this.pack();
		this.setSize(800,680);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == this.exit) {
			System.exit(0);
		}
		
		if (e.getSource() == this.image) {
			zoopanel.setBackground(0);
			zoopanel.setVisible(true);
			
			
		}
		if(e.getSource() == this.green) {
			zoopanel.setBackground(1);
			zoopanel.setVisible(true);
		
		}
		
		if(e.getSource() == this.none) {
			zoopanel.setBackground(2);
			zoopanel.setVisible(true);
		}
		
		if (e.getSource() ==this.help_item) {
	        JOptionPane.showMessageDialog(null, "Home Work 2 GUI", 
	                "Message", JOptionPane.INFORMATION_MESSAGE, icon);		
		}
		
		
		if (e.getSource() ==this.add_animal) {
			new AddAnimalDialog(zoopanel, this);
			
			
		}
		
		if (e.getSource() ==this.sleep) {
			zoopanel.sleep();
			
		}
		
		if (e.getSource() ==this.wake_up) {
			zoopanel.wakeUp();
			
		}
		
		if(e.getSource() == clear) {
			zoopanel.DeleteAllAnimals();
			zoopanel.setPlant(DELETE);
			zoopanel.repaint();
		}
			
		if(e.getSource() == this.food) {
			
			JDialog foodDialog = new JDialog(this , "Food for animlas", true);  
	        JButton Lettuce = new JButton ("Lettuce");
	        Lettuce.addActionListener(new ActionListener() {
        		
        		@Override
        		public void actionPerformed(ActionEvent e1) {
        			
        			if(zoopanel != null) {
        					
        			zoopanel.setPlant(LETTUCE);
        			foodDialog.dispose();
        			
        }
        		}
		});
	        
	        JButton Cabbage = new JButton ("Cabbage");
	        Cabbage.addActionListener(new ActionListener() {
	        	@Override
        		public void actionPerformed(ActionEvent e1) {
        		
	        	if(zoopanel != null) {		
        			zoopanel.setPlant(CABBAGE);
        			foodDialog.dispose();
	        	}
	        	}
		});
	        JButton Meat = new JButton ("Meat"); 
	        Meat.addActionListener(new ActionListener() {
	        	@Override
        		public void actionPerformed(ActionEvent e1) {
        		
	        	if(zoopanel != null) {		
        			zoopanel.setPlant(MEAT);
        			foodDialog.dispose();
	        	}
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
		
		if(e.getSource() == info) {
			JDialog info_dialog = new JDialog(this,"Zoo info",true);
			AnimalTable at = new AnimalTable(zoopanel);
			JTable table = new JTable(at);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setPreferredScrollableViewportSize(new Dimension(500, 70));
			table.setFillsViewportHeight(true);
			info_dialog.add(new JScrollPane(table));
			
			info_dialog.pack();
			info_dialog.setVisible(true);
			
		}
		
		
		if(e.getSource() == exit_button) {
			zoopanel.setExit();
			System.exit(0);
			
		}
	
		
	}
	
	
	public static void main(String[] args) {
		
		
		new ZooFrame();

	
	}

	
	
	

}
