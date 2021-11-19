package chapter9_ex;

public class e9_2 {//由于此处类名是e9_2,所以下方第29、34行也得使用e9_2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
        System.out.println("The area of the circle of radius "
        		+circle1.radius+" is "+circle1.getArea());
        
        //Create a circle with radius 25
        Circle circle2=new Circle(25);
        System.out.println("The area of the circle of radius "
        		+circle2.radius+" is "+circle2.getArea());
        
        Circle circle3=new Circle(125);
        System.out.println("The area of the circle of radius "
        		+circle3.radius+" is "+circle3.getArea());
        
        //Modify circle radius
        circle2.radius=100;//or circle2.setRadius(100)
        System.out.println("The area of the circle of radius "
        		+circle2.radius+" is "+circle2.getArea());
	}
	
	double radius;
	
	/** Construct a circle with radius 1 */
	e9_2(){
		radius=1;
	}
	
	/** Construct a circle with a specified radius */
	e9_2(double newRadius){
		radius=newRadius;
	}
	
	/** Return the area of this circle */
	double getArea() {
		return radius*radius*Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	/** Set a new radius for this circle */
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
