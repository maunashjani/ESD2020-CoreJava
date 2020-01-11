import java.net.*;
class p2
{
    InetAddress inet;
    public static void main(String a[]) 
    {
        try 
        {
            //System.out.println(InetAddress.getByName("google.com"));
            System.out.println(InetAddress.getLocalHost());            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}