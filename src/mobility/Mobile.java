package mobility;

public abstract class Mobile implements Ilocatable {
	
	private Point location;
	private double totalDistance;
	
	@Override
	public Point getLocation() {
		return this.location;
	}

	@Override
	public boolean setLocation(Point point) {
		if (point.get_x() <= point.get_max_x()&& point.get_x() >= point.get_min_x() &&
				point.get_y() <= point.get_max_y() && point.get_y() >= point.get_min_y()) {
			this.location = new Point(point);
			return true;
		}
		return false;			
	}
	
	public Mobile(Point location) {
		this.location = new Point(location);
		this.totalDistance = 0;
	}
	public void addTotalDistance(double distance) {
		if(distance > 0) {
			this.totalDistance+=distance;
		}
	}
	public double calcDistance(Point point) {
		
		return Math.sqrt(Math.pow((location.get_x()-point.get_x()) ,2)
				+Math.pow((location.get_y()-point.get_y()) ,2));
		
		 
	}
	
	public double move(Point Move)
	{
		double temp = calcDistance(Move);
		this.addTotalDistance(temp);
		return temp;
	}
	
	public double getDistance() {
		return this.totalDistance;
	}
	
	public static boolean checkBoundaries( Point point ){
		
		if (point.get_x() <= point.get_max_x()&& point.get_x() >= point.get_min_x() &&
				point.get_y() <= point.get_max_y() && point.get_y() >= point.get_min_y())
			return true;
		
		return false;
	}
	
}
