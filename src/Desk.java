
public class Desk {
	Shape [] shapes = new Shape[4];
	
	
	public void putShapeOnDesk(Shape shape, int i) {
		if (i<4 && i>=0) {
			shapes[i]=shape;
		} else System.out.println("On the desk are only 4 places");
		
	}
	
	public void deleteShapeFromDesk(int i) {
		if (i<4 && i>=0) {
			shapes[i]=null;
		} else System.out.println("On the desk are only 4 places");
	}
	
	public void InfoAboutShapeOnTheDesk() {
		double d=0;
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i]== null) {
				System.out.println("Place "+(i+1)+ " is empty");
			} else {
				System.out.println(shapes[i].toString());
				d +=shapes[i].getArea();
			}
		}
		System.out.println("Total area is: "+d);
	}
	
}
