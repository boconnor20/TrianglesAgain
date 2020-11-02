public class Triangle{
   private Point v1, v2, v3;
   public Triangle(Point a, Point b, Point c){
     v1=a;
     v2=b;
     v3=c;
   }
   public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
     v1=new Point( x1, y1);
     v2=new Point( x2, y2);
     v3=new Point( x3, y3);
   }
   public double getPerimeter(){
     double length1 = v1.distanceTo(v2);
     double length2 = v2.distanceTo(v3);
     double length3 = v1.distanceTo(v3);
    return length1 + length2 + length3;
   }
   public double getArea(){
      double lengthA=v1.distanceTo(v2);
      double lengthB=v2.distanceTo(v3);
      double lengthC=v3.distanceTo(v1);
      double semiP=getPerimeter()/2;
      return Math.sqrt(semiP*(semiP - lengthA) * (semiP - lengthB) * (semiP - lengthC));
   }
  /* public String classify() {

   }
   public String toString(){

   }
   public void setVertex(int index, Point newP){

   }*/

}
