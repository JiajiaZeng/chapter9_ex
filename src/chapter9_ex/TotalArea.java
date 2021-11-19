package chapter9_ex;

public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare circleArray
		Circle2[] circleArray;
		
		//Create circleArray
		circleArray=createCircleArray();
		
		//Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}

	/** Create an array of Circle objects */
	public static Circle2[] createCircleArray() {
		Circle2[] circleArray=new Circle2[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle2(Math.random()*100);
		}
		
		//Return Circle array
		return circleArray;
	}
	
	/** Print an array of circles and their total area */
	public static void printCircleArray(Circle2[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		System.out.println("--------------------------------------------");
		
		//Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of cirlces is",
				sum(circleArray));
		
	}
	
	/** Add circle areas */
	public static double sum(Circle2[] circleArray) {
		//Initialize sum
		double sum=0;
		
		//Add areas to sum
		for(int i=0;i<circleArray.length;i++)
			sum+=circleArray[i].getArea();
		
		return sum;
	}
}
