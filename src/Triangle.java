
public class Triangle extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return this.getPointA().lengthOfLine(this.getPointB())+
				this.getPointB().lengthOfLine(this.getPointC())+
				this.getPointC().lengthOfLine(this.getPointA());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double HalfPerimetr = this.getPerimetr()/2;
		return Math.sqrt(HalfPerimetr*(HalfPerimetr-this.getPointA().lengthOfLine(this.getPointB()))*
				(HalfPerimetr-this.getPointB().lengthOfLine(this.getPointC()))*
				(HalfPerimetr-this.getPointC().lengthOfLine(this.getPointA())));
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

}
