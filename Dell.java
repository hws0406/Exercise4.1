
import java.util.Scanner;

public class Dell extends Laptop {				//Dell as subclass of Laptop Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, model, color, processor;
	private double ram, price, months, installment;
	
	Dell(){
		this.brand = "Dell";
		System.out.print("Enter model: ");
		this.model = scan.nextLine();
		System.out.print("Enter color: ");
		this.color = scan.nextLine();
		this.processor = "Intel i7";
		System.out.print("Enter RAM size: ");
		this.ram = scan.nextDouble();
				if (ram == 8) {
					this.price = 3000;
				}
				else if (ram == 16) {
					this.price = 3500;
			    }
		System.out.print("Enter months: ");
		this.months = scan.nextDouble();
		this.installment = this.price / this.months;
	}
	
	String getBrand() {
		return this.brand;
	}
	
	String getModel() {
		return this.model;
	}
	
	String getColor() {
		return this.color;
	}
	
	String getProcessor() {
		return this.processor;
	}

	double getRam() {
		return this.ram;
	}
	
	double getPrice() {
		return this.price;
	}
	
	double getInstallment() {
		return this.getInstallment();
	}
}
