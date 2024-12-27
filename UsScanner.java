package day13hw;
import java.util.Scanner;

public class UsScanner {
	

	

	  
	    static class User {
	        public static void getUserInfo() {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter your name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);

	            scanner.close();
	        }
	    }

	    public static void main(String[] args) {
	       
	        User.getUserInfo();
	    }
	}


