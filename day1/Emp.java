class Emp {

    //class level or global vars
    int EmpID;
    String Name;
    int salary;
    String dept;

    public static void main(String[] args ) {
        Emp e = new Emp();
        e.setData();
        e.getData();
    }

    public void setData()
    {
        EmpID = 10;
        Name = "John";
        salary = 2000;
    }

    public void getData()
    {
        System.out.println(EmpID);
        System.out.println(Name);
        System.out.println(salary);
    }
}
