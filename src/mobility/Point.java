package mobility;

public class Point {
	private int x;
	private int y;
	private final int max_x = 800;
	private final int max_y = 600;
	private final int min_x = 0;
	private final int min_y = 0;
	
	public Point(int x,int y) {
			this.x = x;
			this.y = y;	
	}
	
	public static boolean checkBoundaris(Point point) {
		if (point.get_x() <= point.get_max_x()&& point.get_x() >= point.get_min_x() && point.get_y() <= point.get_max_y() && point.get_y() >= point.get_min_y()){
			return true;
		}
		return false;
	}
	
	
	public Point(Point location) {
		this.x = location.x ;
		this.y = location.y;
	}


	public int get_max_x() {
		 return this.max_x;
	}
	public int get_max_y() {
		return this.max_y;
	}
	public int get_min_x() {
		 return this.min_x;
	}
	public int get_min_y() {
		return this.min_y;
	}
	
	public int get_x() {
		 return this.x;
	}
	public int get_y() {
		return this.y;
	}
}
