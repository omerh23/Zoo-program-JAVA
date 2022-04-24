package graphics;
import animals.Animal;
import plants.Cabbage;
import plants.Lettuce;
import plants.Plant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
	private ArrayList<Animal> animals_list;
	private Plant plant;
	private int color; 
	//private final String MEAT_PATH = "meat.gif";
    @Override
	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	if(img!=null) {
    		g.setColor(null);
    		g.fillRect(0, 0, getWidth(),getHeight());
    		g.drawImage(img,0,0,getWidth(),getHeight(), this);
    	}
    	else if(this.color == GREEN) {
    	g.setColor(Color.GREEN);
    	g.fillRect(0, 0, getWidth(),getHeight());
    	}
    	else {
        	g.setColor(Color.WHITE);
        	g.fillRect(0, 0, getWidth(),getHeight());
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
	
	public ZooPanel() {//to change the parameters in the constractor
		animals_list = new ArrayList<Animal>();
		plant = null;
		 
	}
	
	public void manageZoo() {
		if(isChange())
			repaint();
	}

	private boolean isChange() {
		// TODO Auto-generated method stub
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
		
	public void setPlant(int option) {
		if(option == 1) {
			this.plant = new Lettuce();
		}
		else if(option == 2) {
			this.plant = new Cabbage();
		}
		else if (option == 3) {
			this.plant = null;
		}
	}
	
	public void setImage(String image) {
		if(image == null) {
			this.img = null;
			
		}
		else {
		try {
			this.img = ImageIO.read(new File(BACKGROUND_PATH+"//"+image));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}

	public void setColor(int color) { //0 = white , 1 = green  
		this.color = color;
	}
	
//	public void setColorImage(Color colImage) {
//		this.img.setRGB(ERROR, ALLBITS, colImage);
//		
//	}

}
