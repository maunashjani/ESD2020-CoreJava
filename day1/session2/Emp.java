import java.util.Scanner;

abstract class Emp {

    int empID;
    String name;
    String dept;
    double salary;

    public Emp(int e, String n, String d, double s){
        empID = e;
        name = n;
        dept = d;
        salary = s;
    }

    public void display()
    {
        System.out.println(empID+"\n"+name+"\n"+dept+"\n"+salary);
    }

    final public void sample()
    {
        System.out.println("This is sample method.");
    }
}

class Manager extends Emp
{
    int managerID;
    //parameterized constructor that extends 
    //the base class constructor
    public Manager(int o1, String o2, String o3, double o4, int m){
        super(o1,o2,o3,o4);
        managerID = m;
    }

    public void display(){
        super.display();
        System.out.println(managerID);
    }

    /*
    @Override
    public void display()
    {
        System.out.println("ManagerID:"+managerID);
    }*/

/*
    public void sample()
    {
        super.sample();
        System.out.println("This is new sample method.");
    }*/

    public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int v1 = sc.nextInt();
            String v2 = sc.next();
            String v3 = sc.next();
            double v4 = sc.nextDouble();
            int v5 = sc.nextInt();
            Manager e = new Manager(v1, v2, v3, v4, v5);
            e.display();
            e.sample();

            Emp emp = new Emp(v1, v2, v3, v4);
            emp.display();
            emp.sample();
    }
}