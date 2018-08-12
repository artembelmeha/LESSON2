
public class Circle extends Shape{
	private Point pointO;
	private Point pointA;
	

	public Circle(Point pointO, Point pointA) {
		super();
		this.pointO = pointO;
		this.pointA = pointA;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Point getPointO() {
		return pointO;
	}

	public void setPointO(Point pointO) {
		this.pointO = pointO;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.getPointO().lengthOfLine(getPointA());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.getPointO().lengthOfLine(this.getPointA()), 2);
	}

	@Override
	public String toString() {
		return "Circle [pointO=" + pointO + ", pointA=" + pointA + "]";
	}
	
}
