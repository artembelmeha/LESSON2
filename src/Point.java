public class Point {
	private double x;
	private double y;	
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Method for calculation Length of two points
	 * @param Point to which length will be calculated
	 * @return Length of Line between two points
	 */
	public double lengthOfLine(Point b) {
		return Math.sqrt(Math.pow(this.getX()-b.getX(), 2)+
				Math.pow(this.getY()-b.getY(), 2));
	}

	@Override
	public String toString() {
		return " (" + x + ", " + y + ")";
	}
	
	
	
}
