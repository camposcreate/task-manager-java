package task_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			if (validateResponse(title) != true) {
				break;
			}
			
			// task object
			tasks Task = new tasks();
			Task.title = title;
			
			// priority?
			System.out.println("Is this task a priority? (Y/N): ");
			String answer = object.nextLine();
			
			isPriorityValid(answer);
			Task.priority = isPriority(answer);
			
			taskObjects.add(Task);
			
		} // end while
		
		print(taskObjects); // print
		
	}

}
