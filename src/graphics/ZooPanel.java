package graphics;
import animals.Animal;
import diet.*;
import mobility.Point;
import animals.*;
import plants.Cabbage;
import plants.Lettuce;
import plants.Meat;
import plants.Plant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ZooPanel extends JPanel implements Runnable , ActionListener{
	
	
	private static final String BACKGROUND_PATH = "C:\\Users\\omerh\\OneDrive\\שולחן העבודה\\לימודים שנה ב\\סימסטר ב\\מונחה עצמים מתקדם\\Home Work\\HW1\\HW1";
	private static final int GREEN = 1;
	private static final int WHITE = 0;
	private BufferedImage img = null;
	private BufferedImage food_img = null;
	private ArrayList<Animal> animals_list;
	private Plant plant;
	private int color; 
	private Boolean flag = false;
	
	public ZooPanel() {//to change the parameters in the constractor
		animals_list = new ArrayList<Animal>();
		plant = null;
		this.setBackground(null);
		this.setVisible(true);
		try
		{
			img = ImageIO.read(new File(BACKGROUND_PATH +"\\savanna.jpg"));
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		 
	}
	
    @Override
    public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    Graphics2D gr = (Graphics2D) g;
	    gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    if(flag) //flag == true
	    {
	    	Dimension size = this.getSize();
	    	gr.drawImage(img, 0, 0, size.width, size.height, this);
	    } //to set Background Image
	    try
	    {
		    for(Animal animals: animals_list)
		    	animals.drawObject(gr);
		    
		    plant.drawObject(gr);
	    }
	    catch(Exception e) //draw exception
	    {
	    	return;
	    }
    }
    
    public void setBackground(int num)
	{
		if(num == 0) //if we select the image
		{
				flag = true;
				setBackground(null); //we clean the background
				this.paintComponent(this.getGraphics());
		}
		if(num == 1) //if we select the green
		{
			flag = false;
			setBackground(null); //we clean the background
			this.paintComponent(this.getGraphics());
			setBackground(Color.GREEN);			
		}
		else if(num == 2) //if we select none
		{			
			flag = false;
			setBackground(null); //clean the Background
		}
	}



    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50, 50);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	public void manageZoo() {
		if(isChange()) { //if the animals moves
			repaint();
			for(Animal animal : animals_list) {
				if(animal.getDiet() instanceof Carnivore || animal.getDiet() instanceof Omnivore) {		
					for(int i = 0 ; i < animals_list.size(); i++ ) {
						
						if(animal.calcDistance(animals_list.get(i).getLocation()) < animals_list.get(i).getWeight())
							if(animal.getWeight() > 2 * animals_list.get(i).getWeight())
								if(animal.eat(animals_list.get(i))) {
									//TODO check if need to increase the eat counter
									animals_list.remove(i);
									animal.eatInc();
									repaint();
									
								}
						
							
							
						}
						
					} // bear or lion
				
				if(this.plant != null) {
					
					if( animal.calcDistance(new Point((int)this.getWidth()/2 - 20,(int)this.getHeight()/2 - 20)) < 10 && animal.eat(this.plant)) {
						this.plant = null;
						animal.eatInc();
						repaint();
						
					}
					
					
				}
				
				
			}
		
			
		}
	}

	private boolean isChange() {
		for(Animal animal: animals_list) {
			if(animal.getChanges())
				return true;
		}
		return false;
		
	}
	
	public int getAnimalSize() {
		return this.animals_list.size();
	}
		
	public ArrayList<Animal> getAnimals() {
			
		return this.animals_list;		
	}
	
	public void addAnimallist(Animal animal) {
		try {
			if ( animals_list.size() == 10) {
				throw new ArrayIndexOutOfBoundsException();
			}
			animals_list.add(animal);
			
		}
		catch(ArrayIndexOutOfBoundsException error) {
			ImageIcon icon =new ImageIcon("Mpicture.png");
			JOptionPane.showMessageDialog(null, "You cannot add more than 10 animlas", 
                "Message", JOptionPane.ERROR_MESSAGE, icon);
	}
	}
	
	public void DeleteAllAnimals() {
		animals_list.clear();
	}
	
	
	
		
	public void setPlant(int option ) {
		if(option == 1) {
			this.plant = new Lettuce(this);
			this.plant.loadImages("lettuce.png");
			this.repaint();
			
		
			
		}
		else if(option == 2) {
			this.plant = new Cabbage(this);
			this.plant.loadImages("cabbage.png");
			this.repaint();
			
		}
		else if (option == 3) {
			this.plant = new Meat(this);
			this.plant.loadImages("meat.gif");
			this.repaint();
		}
		else
			this.plant = null;
	}
	
	public void setImage(String image) {
		if(image == null) {
			this.img = null;
			
		}
		else {
		try {
			this.img = ImageIO.read(new File(BACKGROUND_PATH+"\\"+image));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}

	public void setColor(int color) { //0 = white , 1 = green  
		this.color = color;
	}
	
	public void setFlag(Boolean st) {
		this.flag = st;
	}

}
