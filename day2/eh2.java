class eh2 {
    public static void main(String [] args){

        try{
            String movies[] = new String[3];
            movies[0] = "Movie1";
            movies[1] = "Movie2"; 
            movies[2] = "Movie3";
            movies[3] = "Movie4";

            for(String n: movies){
                System.out.println(n);
            }

            int c = 10/0;

            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException|ArithmeticException ex){
            ex.printStackTrace();
        }
        // catch(ArithmeticException ex){
        //     ex.printStackTrace();
        // }
        finally{
            System.out.println("Executed");
        }

    }
}