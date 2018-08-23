
public class Rectangle extends Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	

	public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public Rectangle() {
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return this.getPointA().lengthOfLine(this.getPointB())+
				this.getPointB().lengthOfLine(this.getPointC())+
				this.getPointC().lengthOfLine(this.getPointD())+
				this.getPointD().lengthOfLine(this.getPointA());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double halfPerimetr = this.getPerimetr()/2;
		return Math.sqrt((halfPerimetr-this.getPointA().lengthOfLine(this.getPointB()))*
				(halfPerimetr-this.getPointB().lengthOfLine(this.getPointC()))*
				(halfPerimetr-this.getPointC().lengthOfLine(this.getPointD())))*
				(halfPerimetr-this.getPointD().lengthOfLine(this.getPointA()));
	}

	@Override
	public String toString() {
		return "Rectangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointD=" + pointD + "]";
	}
	

}
