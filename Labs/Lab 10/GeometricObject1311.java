//package driver_proj0.java;

public abstract class GeometricObject1311 {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject1311() {
		dateCreated = new java.util.Date();
	}
	public String getColor()
	{
	 return color;
    }
	
	   public void setColor(String color)  {
		        this.color = color;
		        }
	
	      public boolean isFilled(){
	 return filled;
	 }
	
	      public void setFilled(boolean filled){
           this.filled = filled;
	      }
	     
	 public java.util.Date getDateCreated() {
	return dateCreated;
	}
	
	   public String toString(){
	 return "Created on: " + dateCreated + "\nColor: " + color + " and filled: " + filled;
	}

	     
	 public abstract double getArea();
	 public abstract double getPerimeter();     
	}


