import java.util.List;
import java.util.ArrayList;

public class MorePractice {
  public static void main(String[] args) {
    String name = "Joe";
    String places = "Portland";
    Integer age = 32;
    Integer year = 2016;
    List<Object> objectList = new ArrayList<Object>();
    objectList.add(name);
    objectList.add(places);
    objectList.add(age);
    objectList.add(year);

    System.out.println("your array:" + objectList);
  }
}
