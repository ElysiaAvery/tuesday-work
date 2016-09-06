public class Repl {
  public static void main(String[] args) {
    String[] nameArray = {"elysia", "caleb", "naima", "selena"};
    Integer[] ageArray = {27, 32, 2, 1};

    for(String name : nameArray) {
      System.out.println(name);
    }
    Integer total = 0;
    for(Integer age : ageArray) {
      total = total + age;
    }
    System.out.println("Your cumulative age is:" + total);
  }
}
