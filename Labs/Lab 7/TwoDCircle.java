package driver_proj0.java;
import java.util.*;
//2D Circle

//-x: double
//-y: double
//-radius: double

//+ getArea():double
//+getPerimeter(): double
//+contains(otherX: double, other : double) : boolean
//+contains(circle: 2DCircle): boolean
//+overlap(circle: 2DCircle): boolean

public class TwoDCircle{
public static void main(String[] args) {
	
private double x; 
private double y; 
private double radius; 


TwoDCircle(){
  
    this.x=0.0;
    this.y=0.0;
    this.radius=1.0;
}

double getX(){
    return this.x;
}

void setX(double x){
    this.x=x;
}

double getY(){
    return this.y;
}

void setY(double y){
    this.y=y;
}

double getRadius(){
    return this.radius;
}

void setRadius(double r){
    this.radius=r;
}

double getArea(){
   double area = (Math.PI)*(Math.pow(this.radius,2));
 return area;
}

double getPerimeter(){
    double perimeter = 2*(Math.PI)*(this.radius);
  return perimeter;
}

boolean contains(double x, double y){
    boolean ret=false;
    double cond = Math.pow((x-this.x),2)+Math.pow((y-this.y),2);

    if(cond < Math.pow(this.radius,2))
      ret=true;

    return ret;
}

boolean contains(TwoDCircle circle){
    boolean ret=false;
    double xb=circle.getX();
    double yb=circle.getY();
    double D; 

    System.out.println("xb: "+xb+ " yb: "+yb);
    D = Math.sqrt(Math.pow(xb-this.getX(),2)+Math.pow(yb-this.getY(),2));

    System.out.println("Distance: "+D+ " radius: "+this.getRadius());

    if(D>(this.getRadius()+circle.getRadius())){
      ret=false; 
    }
    else if(D<=Math.abs(this.getRadius()-circle.getRadius())){
      ret=true; 
    }else{
      ret=false; 
    }

    return ret;
}

boolean overlaps(TwoDCircle circle){
    boolean ret=false;
    double xb=circle.getX();
    double yb=circle.getY();
    double D; 

    D = Math.sqrt(Math.pow(xb-this.getX(),2)+Math.pow(yb-this.getY(),2));

    if(D>(this.getRadius()+circle.getRadius())){
      ret=false; 
    }
    else if(D<=Math.abs(this.getRadius()-circle.getRadius())){
      ret=false; 
    }else{
      ret=true; 
    }

    return ret;
}
}