package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import animals.Animal;
import animals.Lion;
import mobility.Point;

public class AnimalTable extends AbstractTableModel  {
	
	private JTable table;
	
	private int sizeRow;
	private ArrayList<Animal> animals;
	private ZooPanel zoopanel;
	private final String[] columnNames = {"Name","Color","Weight","Hor","Ver","Eat"};
	
	public AnimalTable(ZooPanel zoopanel) {
		this.zoopanel = zoopanel;
		
		animals = new ArrayList<Animal>();
		int tot_eat = 0;
		for(int i = 0; i< zoopanel.getAnimalSize(); i++) {
			animals.add(zoopanel.getAnimals().get(i));
			tot_eat += zoopanel.getAnimals().get(i).getEatCount();
		}
		Animal total = new Lion("Total",10,"Red");
		total.setEat(tot_eat);
		animals.add(total);
		
	}

	@Override
	public int getRowCount() {
		
		return animals.size();
	}

	@Override
	public int getColumnCount() {
		
		return 6;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Animal a = animals.get(rowIndex);
		switch(columnIndex) {
		case 0: if(a.getName()=="default") {return a.getAnimalName();}
		else {return a.getName();}
		case 1:if(a.getName()=="default") {return a.getColor();}
		else {return " ";} 
		case 2:if(a.getName()=="default") {return a.getWeight();}
		else {return " ";} 
		case 3:if(a.getName()=="default") {return a.getHorSpeed();}
		else {return " ";}  
		case 4:if(a.getName()=="default") {return a.getVerSpeed();}
		else {return " ";}  
		case 5:return a.getEatCount();
		  
		}
		return null;
	}
	
	

	

}
