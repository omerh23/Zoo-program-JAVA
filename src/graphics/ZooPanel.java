package graphics;

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

import javax.imageio.ImageIO;
import javax.swing.*;

public class ZooPanel extends JPanel implements Runnable , ActionListener{
	
	private Color color = null;
	private BufferedImage img;
	//private final String MEAT_PATH = "meat.gif";
    @Override
	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.drawImage(img, getWidth()/2 - 20, getHeight()/2 - 20, 40, 40, this);
    	//this.setVisible(true);
        
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
	
	public ZooPanel(BufferedImage i) {
		
		img = i;
	}
	
	

}
