import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class CodingTracker {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("How many hours did you study today?");
    String stringStudyHoursToday = myConsole.readLine();
    Integer studyHoursToday = Integer.parseInt(stringStudyHoursToday);
    System.out.println("How many hours did you study yesterday?");
    String stringStudyHoursYesterday = myConsole.readLine();
    Integer studyHoursYesterday = Integer.parseInt(stringStudyHoursYesterday);
    System.out.println("How many hours did you study two days ago?");
    String stringStudyHoursTwo = myConsole.readLine();
    Integer studyHoursTwo = Integer.parseInt(stringStudyHoursTwo);
    Integer totalTime = studyHoursToday + studyHoursYesterday + studyHoursTwo;
    System.out.println("You studied for " + totalTime + " hours.");
    if(totalTime <= 6) {
      System.out.println("Schedule yourself time to study in a daily planner. YOU TIME = STUDY TIME.");
    } else if (totalTime >= 7 && totalTime <= 12) {
      System.out.println("Good job! Your hard work will pay off.");
    } else if (totalTime >=13) {
      System.out.println("Amazing! Don't forget to sleep and eat. Learning takes energy.");
    } else {
      System.out.println("Please enter a number.");
    }
  }
}
