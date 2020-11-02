public class Tester{
  public static void main(String[] args) {
    Point p1= new Point(3.0,4.0);
    Point p2= p1;
    System.out.println(p2.getX());
    System.out.println(p2.getY());
    System.out.println(p1.equals(p2));
  }
}
