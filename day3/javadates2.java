import java.time.*; 
import java.time.format.*; 

public class javadates2 {
  public static void main(String[] args) throws InterruptedException{

    for(int i=0; i<5; i++)
    {
        LocalTime timeObj = LocalTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = timeObj.format(formatObj);
        System.out.println("Local Time: " + formattedTime);
        Thread.sleep(1000);
    }
  }
}