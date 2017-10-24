//package driver_proj0.java;

public class Rectangle {

			// Default values
		   double width , height;
		   Rectangle(){
		       width = 1;
		       height = 1;
		   }
		   Rectangle(double w, double h){
		       width = w;
		       height = h;
		   }
		   
		   // Find Area
		   double getArea(){
		       return width * height;
		   }
		   
		   // Find Perimeter
		   double getPerimiter(){
		       return 2 * (width + height);
		   }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4, 40); // Rectangle 1 Values
	       Rectangle rectangle2 = new Rectangle(3.5, 35.9); // Rectangle 2 Values
	       System.out.println("Rectangle 1: ");
	       System.out.println("Width = " + rectangle1.width + "\nHeight = " + rectangle1.height + "\nArea = " + rectangle1.getArea() + "\nPerimeter = " + rectangle1.getPerimiter());
	       System.out.println("\nRectangle 2: ");
	       System.out.println("Width = " + rectangle2.width + "\nHeight = " + rectangle2.height + "\nArea = " + rectangle2.getArea() + "\nPerimeter = " + rectangle2.getPerimiter());
	   }
	}

