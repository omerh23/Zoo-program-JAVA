package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import animals.Animal;
import animals.Lion;
import mobility.Point;

public class AnimalTable extends AbstractTableModel  {
	
	private JTable table;
	private ZooFrame zoo;
	private int sizeRow;
	private Animal[] animals;
	private final String[] columnNames = {"Name","Color","Weight","Hor","Ver","Eat"};
	
	public AnimalTable(ZooFrame zoo) {
		
		sizeRow = zoo.getAnimals().length;
		animals = new Animal[sizeRow+1];
		int tot_eat = 0;
		for(int i = 0; i<sizeRow; i++) {
			animals[i] = zoo.getAnimals()[i];
			tot_eat += zoo.getAnimals()[i].getEatCount();
		}
		Animal total = new Lion("Total",10,"Red");
		total.setEat(tot_eat);
		animals[sizeRow]=total;
		
	}

	@Override
	public int getRowCount() {
		
		return sizeRow+1;
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
		Animal a = animals[rowIndex];
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
