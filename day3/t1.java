class t1 extends Thread {
    public void run(){  
        System.out.println("thread is running...");  
    }  

    public static void main(String args[]){  
        t1 obj=new t1();  
        obj.start();  
    }  
}  