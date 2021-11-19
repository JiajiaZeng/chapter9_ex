package chapter9_ex;
//����CircleWithStaticMembers
public class Circle1 {//����֮ǰ�Ѿ�ʹ�ù�Circle�����Դ˴���Circle1����
	/** The radius of the circle */
	double radius;
	
	/** The number of objects created */
	static int numberOfObjects=0;
	
	/** Construct a circle with a specified radius */
	Circle1(){
		radius=1;
		numberOfObjects++;
	}
	
	
	/** Construct a circle with a specified radius */
	Circle1(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	/** Return the area of this circle */
	double getArea() {
		return radius*radius*Math.PI;
	}

}
