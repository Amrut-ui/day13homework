package day13hw;
import java.util.Scanner;


public class GrossSalary {
	

	

	    
	    static class SalaryCalculator {
	        public static double calculateGrossSalary(double basicSalary) {
	            double hra = 0.4 * basicSalary; 
	            return basicSalary + hra;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter basic salary: ");
	        double basicSalary = scanner.nextDouble();

	      
	        double grossSalary = SalaryCalculator.calculateGrossSalary(basicSalary);

	        System.out.println("Gross salary: " + grossSalary);

	        scanner.close();
	    }
	}


