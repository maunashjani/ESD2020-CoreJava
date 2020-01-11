class program1{

    public void Add(int a, int b)
    {
        System.out.println(a+b);
    }

    public void Add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public int AddMore(int a, int b)
    {
        return a+b;
    }

    public static void main(String [] args){
        program1 p = new program1();
        p.Add(10,20);
        p.Add(10,20,30);

        //int x = p.AddMore(40,50);
        //System.out.println(x);
        
        System.out.println(p.AddMore(40,50));
    }
}