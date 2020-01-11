import java.util.*;

class p1 {
    public static void main(String [] args){
        Random r = new Random();

        for(int i=1; i<5; i++){
            System.out.println(r.nextInt(50));
        }
    }
}