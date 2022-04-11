package graphics;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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
	private JLabel green_label;
	private JLabel label_image;
	private ImageIcon hen_image;
	public ZooFrame() {
		super("Zoo");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.menubar = new JMenuBar();
		super.setJMenuBar(this.menubar);
		
		this.file = new JMenu("File");
		this.menubar.add(this.file);
		this.exit = new JMenuItem("Exit");
		this.exit.addActionListener(this);
		this.file.add(exit);
		
		
		this.background = new JMenu("Background");
		this.menubar.add(this.background);
		this.image = new JMenuItem("Image");
		this.background.add(this.image);
		this.green = new JMenuItem("Green");
		this.green.addActionListener(this);
		this.background.add(green);
		this.none = new JMenuItem("None");
		this.background.add(none);
		
		this.help = new JMenu("Help");
		this.menubar.add(this.help);
		this.help_item = new JMenuItem("Help");
		this.help.add(help_item);
		this.green_label = new JLabel();
		this.green_label.setBackground(Color.GREEN);
		this.add(green_label);
//		this.hen_image = new ImageIcon("hen.jpeg");
//		this.label_image = new JLabel();
//		this.label_image.setIcon(hen_image);
//		this.label_image.setBounds(0, 0, 600, 600);
//		this.label_image.setVisible(false);
//		this.add(label_image);
		
		

		
		this.setVisible(true);
		this.pack();
		this.setSize(600,600);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == this.exit) {
			System.exit(0);
		}
		
		if (e.getSource() == this.image) {
			
			
			this.label_image.setVisible(true);
			
			
			
		}
		if(e.getSource() == this.green) {
			//this.label_image.setIcon(null);
			//this.remove(this.label_image);
			
			this.green_label.setOpaque(true);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		new ZooFrame();
	
	}


}
