class t2 implements Runnable{  
    public void run(){  
        System.out.println("thread is running...");  
    }  
  
    public static void main(String args[]){  
        t2 obj=new t2();  
        Thread t1 =new Thread(obj);  
        t1.start();  
    }  
}