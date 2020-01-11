class ArraysProgram {
    public static void main(String[] args ) {
        
        //Declare and initialize the integer array
        //int years[] = new int[3];
        //years[0] = 2000; //value for 1st element in array
        //years[1] = 2001; //value for 2nd element in array
        //years[2] = 2005; //value for 3rd element in array
        //years[3] = 2020; //ArrayIndexOutOfBounds

        int years [] = new int[] {2000, 2001, 2005, 2020};
        
        /*System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2]);
        System.out.println(years[3]);*/

        //For loop
        /*for(int i=0;i<years.length;i++)
        {
            System.out.println(years[i]);
        }*/

        //For-each loop for collections
        for(int year: years)
        {
            System.out.println(year);
        }

    }
}
