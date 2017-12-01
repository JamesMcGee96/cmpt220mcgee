//package driver_proj0.java;
// JA: Where is the Square class
public class ColorableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeometricObject[] obj = new GeometricObject[5];
		obj[0]= new GeometricObject();
		obj[1]= new Square();
		obj[2]= new Square();
		obj[3]= new GeometricObject();
		obj[4]= new Square();
		
		for(int i = 0; i<obj.length; i++) {
			GeometricObject object = obj[i];
			System.out.print("Object[" +i+ "]") ;
			
			if (object instanceof Colorable) {
				Colorable colorable = (Colorable) object;
				Colorable.howToColor();
			}
			else{
				System.out.println("Not colorable");
			}
		}
	}

}
