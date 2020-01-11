import java.util.*;

class p1 {

    public static void main(String [] args){
        try
        {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        double num2 = Math.pow(num,2);

        double num3 = Math.pow(num2,2);

        System.out.println(num2);
        Thread.sleep(1000);
        System.out.println(num3);
        }
        catch(Exception ex)
        {
            
        }
    }
}