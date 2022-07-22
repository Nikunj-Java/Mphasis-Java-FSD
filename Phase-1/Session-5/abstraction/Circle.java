package Com.simplilearn.abstraction;

public class Circle extends Shape {
	
	private double radius;
	
	public  Circle(double radius,String color) {
		super(color);
		this.radius=radius;
	}
	
	double area() {
		//area of circle is pi * r^2
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public String toString() {
		return "Circle  Color: ="+getColor()+"  and area is: "+area();
	}
	

	 

}
