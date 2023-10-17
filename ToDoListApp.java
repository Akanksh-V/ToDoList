
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task: " + description + " (Priority: " + priority + ")";
    }
}


public class ToDoListApp {
    private ArrayList<Task> taskList;

    public ToDoListApp() {
        taskList = new ArrayList<>();
    }

    public void addTask(String description, int priority) {
        Task task = new Task(description, priority);
        taskList.add(task);
    }

    public void displayTasks() {
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoList = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task\n2. Display Tasks\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority: ");
                    int priority = scanner.nextInt();
                    toDoList.addTask(description, priority);
                    break;
                case 2:
                    toDoList.displayTasks();
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}