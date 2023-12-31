package task_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main driver file
public class main extends tasks{

	public static void main(String[] args) {
		
		ArrayList<tasks> taskObjects = new ArrayList<>();
		
		// Scanner object
		Scanner object = new Scanner(System.in);
		
		// Welcome!
		System.out.println("Welcome to the Task Manager!");
		System.out.println("Type Y/N to proceed (respectively):");
		
		String enter = object.nextLine(); //get user response
		validResponse(enter); // validate response
		
		boolean begin = true;
		while (begin) {
			
			// enter title
			System.out.println("Please enter a title for your task ('N' to exit): ");
			String title = object.nextLine(); // get title
			
			// if "N" exit while loop
			if (validateResponse(title)) {
				break;
			}
			
			// enter short description
			System.out.println("Enter a short description for your task:");
			String description = object.nextLine();
			
			// task object
			tasks Task = new tasks();
			Task.title = title;
			Task.description = description;
			
			// priority?
			System.out.println("Is this task a priority? (Y/N): ");
			String answer = object.nextLine();
			
			// determines priority and assigns rating to the task
			isPriorityValid(answer);
			Task.priority = isPriority(answer);
			
			// Organize ArrayList by priority -> marked as (*)
			if (Task.priority && taskObjects.isEmpty()) {
				taskObjects.add(Task);
			} else if (Task.priority){
				taskObjects.add(0, Task);
			} else {
				taskObjects.add(Task);
			}
			
		} // end while
		
		print(taskObjects); // print
		
		
	}

}
