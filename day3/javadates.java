import java.time.*; // import the LocalDate class

public class javadates {
  public static void main(String[] args) {
    
    LocalDate obj1 = LocalDate.now(); // Create a date object
    System.out.println(obj1); // Display the current date

    LocalTime obj2 = LocalTime.now();
    System.out.println(obj2);

    LocalDateTime obj3 = LocalDateTime.now();
    System.out.println(obj3);

  }
}