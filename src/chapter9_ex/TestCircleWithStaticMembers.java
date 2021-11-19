package chapter9_ex;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is "+
        		Circle1.numberOfObjects);
        
        //Create c1
        Circle1 c1=new Circle1();
        
        //Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + 
        		") and number of Circle objects ("+
        		c1.numberOfObjects + ")");
        
        //Create c2
        Circle1 c2=new Circle1(5);
        
        //Modify c1
        c1.radius=9;
        
        //Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius ("+c1.radius+
        		") and number of Circle objects ("+
        		c1.numberOfObjects+")");
        System.out.println("c2: radius ("+c2.radius+
        		") and number of Circle objects ("+
        		c2.numberOfObjects+")");
	}

}
