package driver_proj0.java;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("CIRCLE2D");
		    System.out.println("--------");

		    TwoDCircle c2d1 = new TwoDCircle();

		    c2d1.setX(1.0);
		    c2d1.setY(1.0);
		    c2d1.setRadius(3.0);

		    System.out.println("Area of Circle: "+c2d1.getArea());
		    System.out.println("Perimeter of Circle: "+c2d1.getPerimeter());
		    System.out.println("----------------------");

		    TwoDCircle c2d2 = new TwoDCircle();
		    c2d2.setX(1.0);
		    c2d2.setY(1.0);
		    c2d2.setRadius(3.0);

		    System.out.println("Contains: "+c2d1.contains(c2d2));
		    System.out.println("----------------------");

		    TwoDCircle c2d3 = new TwoDCircle();
		    c2d3.setX(5.0);
		    c2d3.setY(5.0);
		    c2d3.setRadius(3.0);
		    System.out.println("Contains: "+c2d1.contains(c2d3));
		    System.out.println("----------------------");

		    System.out.println("Overlap: "+c2d1.contains(c2d2));
		    System.out.println("----------------------");
		    System.out.println("Point inside circle: "+c2d1.contains(0.5,0.5));
			
		

	}

}
