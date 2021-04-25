
import java.util.Scanner;

public class Laptop {		
	
	Scanner scan = new Scanner(System.in);
	
	private double length, width, height, weight;
	
	Laptop(){			//Constructor without argument named Laptop
		System.out.print("Enter length: ");
		this.length = scan.nextDouble();
		System.out.print("Enter width: ");
		this.width = scan.nextDouble();
		System.out.print("Enter height: ");
		this.height = scan.nextDouble();
		System.out.print("Enter weight: ");
		this.weight = scan.nextDouble();
		
	}
	
	double getLength() {
		return this.length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
}
