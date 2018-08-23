
public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(2.5,3);
		Point p2 = new Point(0,-3);
		Point p3 = new Point(-5, -4);
		Point p4 = new Point(7, 0.1);
		
		
		Circle cir = new Circle(p1, p2);
		Triangle tria = new Triangle(p1,p2,p3);
		Rectangle rect = new Rectangle(p1,p2,p3,p4);
		
		
		System.out.println(cir.getArea() +"  "+tria.getArea()+"  "+ rect.getArea());
	
		Desk desk=new Desk();
		
		desk.putShapeOnDesk(cir, 1);
		desk.putShapeOnDesk(tria, 0);
		desk.putShapeOnDesk(rect, 2);
		
		desk.infoAboutShapeOnTheDesk();
		desk.deleteShapeFromDesk(2);
		desk.infoAboutShapeOnTheDesk();


	}

}
