package day13hw;
import java.util.Scanner;

public class FindingSqure {
	

	

	    
	    private static int side;

	  
	    static {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the side of the square: ");
	        side = scanner.nextInt();
	        scanner.close();
	    }

	   
	    public static int calculateArea() {
	        return side * side;
	    }

	    public static void main(String[] args) {
	        System.out.println("Total area of the square: " + calculateArea());
	    }
	}


