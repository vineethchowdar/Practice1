
public class Circle  {
 static int radius;
 static int diameter;
 double area;
	public Circle(int radius, int diameter) {
	this.radius = radius;
	this.diameter = diameter;
}
	public static void main(String[] args) {
		Circle c1= new Circle(5,10);
		double area = Math.PI * (radius * radius);
		  System.out.println("The radius and diameter of circle is: " +radius+ "  " +diameter);
	      System.out.println("The area of circle is: " + area);
		
	}

}
