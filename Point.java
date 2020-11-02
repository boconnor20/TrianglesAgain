public class Point{
  //2.2
  private double x,y;
  public Point(double X,double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
   x= p.x;  //private access in the same file is allowed!
   y= p.y;
 }

 public double getX(){
   return x;
 }

 public double getY(){
   return y;
 }
 //2.3
 public double distanceTo(Point other){
    return Math.sqrt((Math.pow((other.getX()-getX()),2) + Math.pow((other.getY()-getY()),2)));
  }
  public boolean equals(Point other){
    return getX()==other.getX() &&  getY()==other.getY();
  }
}
