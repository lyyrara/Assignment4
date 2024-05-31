import java.util.Scanner;


public class TodoManager {
    
    private Task taskManager;

    public TodoManager() {
        this.taskManager = new Task();
    }

    public static void main(String[] args){
        TodoManager manager = new TodoManager();
        Scanner scanner = new Scanner(System.in);

    
        while (true) {
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. Search a task");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
    
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
    
            switch (option) {
                case 1:
                    System.out.print("Enter a task: ");
                    String addtask = scanner.nextLine();
                    manager.taskManager.addTask(addtask);
                    break;
                case 2:
                    System.out.print("Enter the task name to remove: ");
                    String delete_task = scanner.nextLine();
                    manager.taskManager.removeTask(delete_task);
                    break;
                case 3:
                    System.out.print("Update task:");
                    String old_task = scanner.nextLine();
                    System.out.print("New task:");
                    String new_task = scanner.nextLine();
                    manager.taskManager.updateTask(old_task, new_task);
                    break;
                case 4:
                    System.out.print("Search task:");
                    String task = scanner.nextLine();
                    manager.taskManager.searchTask(task);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    
}
