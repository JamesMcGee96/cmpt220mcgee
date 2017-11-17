package driver_proj0.java;
// Circle UML

//-radius: double
//-area: double

//+ compareTo(obj:Object): int
//+ getArea():double

import java.io.*;
import java.util.Scanner;
import java.lang.Comparable;
class GeometricObject
{double area;
public double getArea()

{
return(area);
}

}
class Circle extends GeometricObject implements Comparable
{
double radius;
Circle(double r)
{
radius=r;
}
public double getArea()
{
return(3.143*(radius*radius));
}
  
public int compareTo(Object obj)
{
Circle c1=(Circle)obj;
  
if(radius==c1.radius)
return 0;
else if(radius>c1.radius)
return 1;
else
return -1;
}

}
