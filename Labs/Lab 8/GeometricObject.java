package driver_proj0.java;
//uml
//GeometricObject

// color:string
//filled: boolean

//+getColor()
//+setColor()
//+isFilled()
//+setFilled(filled)
public class GeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String TColor;
		private boolean isfilled;
		
		public String getColor() {
		return TColor;
		}
		
		public void putcolor(String c) {
			this.TColor=c;
		}
		
		public void setFill(boolean fill) {
			isfilled=fill;
		}
		
		public boolean isFilled() {
			return isfilled;

		
		}
	}


