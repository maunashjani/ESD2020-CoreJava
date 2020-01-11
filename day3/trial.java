import java.io.*;
import java.net.*;

class trial {
    public static void main(String args[]) {
        try{
            //URL url = new URL("http://official-joke-api.appspot.com/jokes/random");
            URL url = new URL("https://api.quotable.io/random1");
            HttpURLConnection huc=(HttpURLConnection)url.openConnection(); 
            InputStreamReader input = null;
            BufferedReader br = null;
            if (huc.getResponseCode() <= 200 && huc.getResponseCode() <= 299) {
                input = new InputStreamReader(huc.getInputStream());
                br = new BufferedReader(input);
                System.out.println(br.readLine());
            } else {
                input = new InputStreamReader(huc.getErrorStream());
                br = new BufferedReader(input);
                System.out.println(br.readLine());
            } 
            huc.disconnect();    
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}