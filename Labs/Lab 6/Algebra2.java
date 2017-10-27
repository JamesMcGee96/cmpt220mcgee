//package driver_proj0.java;

public class Algebra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		private double A,B,C,D,E,F,X,Y;
	    void LinearEquation(double A,double B,double C,double D,double E,double F){
	        this.A = A;
	        this.B= B;
	        this.C = C;
	        this.D = D;
	        this.E = E;
	        this.F = F;
	    }
	    public double getA(){       
	        return A;
	    }
	    public double getB(){
	        return B;
	    }
	    public double getC(){
	        return C;
	    }
	    public double getD(){
	        return D;
	    }
	    public double getE(){
	        return E;
	    }
	    public double getF(){
	        return F;
	    }
	    public double getX() throws Exception {
	        if(!isSolvable()){
	            
	        	
	        }
	        X = (E*D-B*F)/(A*D-B*C);
	        return X;
	    }
	    public double getY(){
	        if(!isSolvable()){
	    
	        	
	        }
	        Y = (A*F-E*C)/(A*D-B*C);
	        return Y;
	    }

	    public boolean isSolvable(){
	        if((A*D-B*C)==0){
	            return false;
	        }
	        return true;
	}
	
}
