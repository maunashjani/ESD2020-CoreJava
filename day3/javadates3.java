import java.time.*; 
import java.time.format.*; 

public class javadates3 implements Runnable {
    
    public void run() {
        LocalTime timeObj = LocalTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = timeObj.format(formatObj);
        System.out.println("Local Time: " + formattedTime);
    }

    public static void main(String[] args) throws InterruptedException{
        javadates3 obj = new javadates3();
        for(int i=0; i<5; i++)
        {
            Thread t = new Thread(obj);
            t.start();
            t.sleep(1000);
        }
    }
}