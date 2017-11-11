//package driver_proj0.java;
//uml
//TriangleGO

//-side1: double
//-side2: double
//-side3: double
//-Tcolor: string

//+Triangle()
//+Triangle(side1,side2,side3)
//+getside1()
//+getside2()
//+getside3()
//+setside1()
//+setside2()
//+setside3()
//+getarea()
//+getPerimeter
//+toString()
import java.util.Scanner;
public class TriangleGO extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s1,s2,s3;
		String color;
		boolean fill;
		
		input = new Scanner (System.in);
	
		System.out.println("Enter a color:" );
		color = input.nextLine();
		
		System.out.println("Enter the three sides:");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("Fill in the triangle:");
		fill = input.nextBoolean();
		
		TriangleGO tt = new TriangleGO (s1,s2,s3);
		tt.putcolor(color);
		tt.setFill(fill);
		
		System.out.println("Sides of " +tt.toString());
		System.out.println("Area of Triangle " +tt.getperimeter());
		System.out.println("Color of Triangle " +tt.getColor());
		System.out.println("Is the Triangle filled " +tt.isFilled());
	}
		public TriangleGO (double s1, double s2, double s3) {
			side1=s1;
			side2=s2;
			side3=s3;
		}
		
		public double getside1() {
			return side1;
		}
		public double getside2() {
			return side2;
		}
		public double getside3() {
			return side3;
		}
		
		public double getArea() {
			double s=(side1+side2+side3)/2;
			double area=s*(s-side1)*(s-side2)*(s-side3);
			return area;
		}
		
		public double getperimeter() {
			return(side1+side2+side3);
		}
		
		public String toString() {
			return "Triangle : side1 = "+side1+" side2 = "+side2+" side3=" +side3;

			
		}
	}


