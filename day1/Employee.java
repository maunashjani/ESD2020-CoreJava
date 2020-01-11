class Employee {

    //class level or global vars
    static int EmpID;
    static String Name;
    static int salary;
    static String dept;

    public static void main(String[] args ) {
        setData();
        getData();
    }

    public static void setData()
    {
        EmpID = 10;
        Name = "John";
        salary = 2000;
    }

    public static void getData()
    {
        System.out.println(EmpID);
        System.out.println(Name);
        System.out.println(salary);
    }
}
