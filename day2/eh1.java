class eh1 {
    public static void main(String [] args){
        try{
            int a = 10;
            int b = 0;

            int c = a / b;

            System.out.println(c);
        }
        catch(Exception ex){
            System.out.println("There was an error");
            ex.printStackTrace();
        }
        finally{
            System.out.println("Program executed");
        }
    }
}