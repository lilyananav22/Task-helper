import java.util.Scanner;
class Task {
    private String taskName;
    private Integer time;
    private Boolean completed;

    public Task( String taskName, Integer time, Boolean completed) {
        this.taskName = taskName;
        this.time = time;
        this.completed = completed;
    }
    public String getTaskName() {
        return taskName;
    }
    public Integer getTime() {
        return time;
    }
    public Boolean getCompleted() {
        return completed;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setTime(Integer time) {
        this.time = time;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}
public class tasks{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Task[] tasks = new Task[5];

    for (int i = 0; i < 5; i++) {
        System.out.println("Enter task name:");
        String name = input.nextLine();

        System.out.println("Enter time needed in minutes:");
        Integer time = Integer.parseInt(input.nextLine());

        System.out.println("have you completed the task (true/false)");
        Boolean completed = Boolean.parseBoolean(input.nextLine());

        tasks[i] = new Task( name, time, completed);
    }

    System.out.println("\nYour tasks:");

    for (int i = 0; i < 5; i++) {
        System.out.println("Task: " + tasks[i].getTaskName());
        System.out.println("Time: " + tasks[i].getTime() + "minutes");
        System.out.println("Completed: " + tasks[i].getCompleted());

    }
        System.out.println("Enter the task number you want to update (1-5):");
        int taskNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter 1 to update time or 2 to mark completed:");
        int choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            System.out.println("Enter the new time in minutes:");
            Integer newTime = Integer.parseInt(input.nextLine());
            tasks[taskNumber - 1].setTime(newTime);
        } else if (choice == 2) {
            tasks[taskNumber - 1].setCompleted(true);
        }
        System.out.println("Updated task:");
        System.out.println("Task: " + tasks[taskNumber - 1].getTaskName());
        System.out.println("Time: " + tasks[taskNumber - 1].getTime() + " minutes");
        System.out.println("Completed: " + tasks[taskNumber - 1].getCompleted());

    }
}