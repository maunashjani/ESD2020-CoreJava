import java.net.*;
import java.util.*;
class WebIP {
    public static void main(String [] args) throws UnknownHostException{

        String WebAddr[] = new String[]{"www.google.com", "www.facebook.com", "www.github.com","www.youtube.com", "www.myntra.com"};
        
        Random random = new Random();
        
        int num = random.nextInt(5);

        for(int i=0;i<WebAddr.length;i++)
        {
            if(i==num)
            {
                System.out.println("RN:" + num);
                System.out.println("Website: " + WebAddr[i]);
                System.out.println(InetAddress.getByName(WebAddr[i]));
            }
        }

    }
}