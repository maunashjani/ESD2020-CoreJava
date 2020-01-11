class eh5 {

    public void checkAge(int age) {
     if(age>18){
        System.out.println("Eligible");
     }
     else
     {
         throw new ArithmeticException("Not Eligible as age under 18");
     }
    }

    public static void main(String [] args){
        eh5 obj = new eh5();
        obj.checkAge(15);
    }
}