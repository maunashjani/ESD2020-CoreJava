import java.time.*; // Import the LocalDateTime class
import java.time.format.*; // Import the DateTimeFormatter class

public class javadates1 {
  public static void main(String[] args) {
    //LocalDateTime dateObj = LocalDateTime.now();
    //LocalDate dateObj = LocalDate.now();
    LocalTime dateObj = LocalTime.now();
    System.out.println("Before formatting: " + dateObj);
    //DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    //DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("HH:mm:ss");

    String formattedDate = dateObj.format(formatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}