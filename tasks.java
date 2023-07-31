package task_manager;

import java.util.ArrayList;
import java.util.Scanner;

// class tasks 

public class tasks {
	
	String title;
	String description;
	boolean priority;
	Scanner object = new Scanner(System.in);
	
	void task() {
		this.priority = false;
	}
	
	// validates user proceeding
	public static boolean notEqual(String userInput) {
		
		String yes = "Y";
		String no = "N";
		if (userInput.equals(yes)) {
			return false;
		}
		else if (userInput.equals(no)) {
			return false;
		}
		else {
			return true;
		}	
	} // end notEqual()
	
	// ensures user input is either "Y" or "N" (uses notEqual() method)
	static void validResponse(String userInput) {
		
		boolean trigger = true;
		while(trigger) {
			
			// if user input is not valid continue until valid
			if (notEqual(userInput)) {
				System.out.println("Invalid input! Please utilize only the indicated characters 'Y' or 'N'");
				System.exit(0);
			}
			else if (userInput.equals("N")) {
				System.out.println("Program has exited!");
				System.exit(0);
			}
			else {
				trigger = false; // exit while loop
			}
		} // end while
	} // end validResponse()
	
	// determines priority rating (yes/no)
	public static boolean isPriority(String userInput) {
		
		String yes = "Y";
		if (userInput.equals(yes)) {
			return true;
		}
		else {
			return false;
		}
	} // end isPriority()
	
	// check user input and validate for priority functionality
	static void isPriorityValid(String userInput) {
		
		
		boolean trigger = true;
		while(trigger) {
			
			// if user input is not valid continue until valid
			if (notEqual(userInput)) {
				System.out.println("Invalid input! Please utilize only the indicated characters 'Y' or 'N'");
				System.exit(0);
			}
			else {
				trigger = false; // exit while loop
			}
		} // end while
	} // end isPriority()
	
	// determines whether the user would like to exit program
	public static boolean validateResponse(String title) {
		
		String no = "N";
		if (title.equals(no)) return false;
		return true;
		
	}
	
	// prints task list
	public static void print(ArrayList<tasks> list) {
		System.out.println();
		System.out.println("Your Task Manager List:");
		for (tasks objects : list) {
			if (objects.priority == true) {
				System.out.println(objects.title + " (*)");
				System.out.println(" - Note: " + objects.description);
			} else {
				System.out.println(objects.title);
				System.out.println(" - Note: " + objects.description);
			}
		} // end for
	} // end print()
	
} // end class tasks()
