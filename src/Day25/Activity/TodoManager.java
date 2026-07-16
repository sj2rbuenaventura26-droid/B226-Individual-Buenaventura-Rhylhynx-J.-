
package Day25.Activity;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {
    
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        System.out.println("---------Simple To-do List--------");
        System.out.println("         [1] Add a task");
        System.out.println("         [2] View all task");
        System.out.println("         [3] Update a task");
        System.out.println("         [4] Remove a task");
        System.out.println("         [5] Clear all tasks");
        System.out.println("         [6] Exit");
        
        System.out.print(" Enter Your Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if (choice == 1) {
            System.out.println("Enter a task: ");
            String task = scanner.nextLine();
            tasks.add(task);    
            System.out.println("Task Add Successfully");
        } else if (choice == 2) {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1)+ "." + tasks.get(i));
            }
        } else if (choice == 3) {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1)+ "." + tasks.get(i));
                }
                System.out.println("Enter the task number to update: ");
                int taskNumber = scanner.nextInt();
                scanner.nextLine();
               
                System.out.println("Enter a new task");
                String newTask = scanner.nextLine();
                tasks.set(taskNumber -1, newTask);
                System.out.println("Task Updated Successfully!");
                
         } else if (choice == 4) {
              for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1)+ "." + tasks.get(i));
                }
                System.out.println("Enter a task to remove: ");
                int taskNumber = scanner.nextInt();
                scanner.nextLine();
                
                tasks.remove(taskNumber -1);
                System.out.println("Task remove Successfully");
            } else if (choice == 5) {
                 for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1)+ "." + tasks.get(i));
                }
                    tasks.removeAll(tasks);
                    System.out.println("Clear All the tasks Successfully");
                    System.out.println();
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        
        
    }
}
}