import java.util.Arrays;
import java.util.Scanner;
class Task {
    String name;
    String type;
    int completionTime;
    public Task(String name, String type, int completionTime) {
        this.name = name;
        this.type = type;
        this.completionTime = completionTime;
    }
}
class Worker {
    String name;
    int timeAvailable;
    public Worker(String name) {
        this.name = name;
        this.timeAvailable = 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Task[] tasks = new Task[m];
        Worker[] workers = new Worker[n];
        for (int i = 0; i < m; i++) {
            String taskName = scanner.next();
            String taskType = scanner.next();
            int completionTime = scanner.nextInt();
            tasks[i] = new Task(taskName, taskType, completionTime);
        }
        Arrays.sort(tasks, (a, b) -> a.name.compareTo(b.name));
        for (int i = 0; i < n; i++) {
            String workerName = "W" + (i + 1);
            workers[i] = new Worker(workerName);
        }
        int timeTaken = 0;
        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (i < m && tasks[i].completionTime == 0) {
                String workerName = workers[j].name;
                System.out.println(workerName + " " + tasks[i].name + " " + timeTaken);
                i++;
                j++;
            } else if (i < m && tasks[i].completionTime > 0) {
                int minIndex = -1;
                for (int k = 0; k < n; k++) {
                    if (workers[k].timeAvailable <= timeTaken) {
                        minIndex = k;
                        break;
                    }
                }
                if (minIndex != -1) {
                    String workerName = workers[minIndex].name;
                    System.out.println(workerName + " " + tasks[i].name + " " + (timeTaken + tasks[i].completionTime));
                    workers[minIndex].timeAvailable = timeTaken + tasks[i].completionTime;
                    i++;
                }
            } else {
                int minIndex = -1;
                for (int k = 0; k < n; k++) {
                    if (workers[k].timeAvailable <= timeTaken) {
                        minIndex = k;
                        break;
                    }
                }
                if (minIndex != -1) {
                    timeTaken = workers[minIndex].timeAvailable;
                    j = minIndex + 1;
                }
            }
        }
    }
}