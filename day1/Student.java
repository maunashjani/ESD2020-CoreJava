class Student {

    int rollNo;
    double marks;
    String name;

    //to initialize data members of the class
    //Default Constructor
    public Student() {
        rollNo = 10;
        marks = 70.50;
        name = "John";
    }

    //Parameterized Constructor
    public Student(int r, double m, String n) {
        rollNo = r;
        marks = m;
        name = n;
    }

    //Copy Constructor
    public Student(Student obj)
    {
        rollNo = obj.rollNo;
        marks = obj.marks;
        name = obj.name;
    }


    public void display(){
        System.out.println("The data is:");
        System.out.println("Roll No:"+rollNo);
        System.out.println("Marks:"+marks);
        System.out.println("Name:"+name);
    }

    public static void main(String [] args){
        //Default constructor is called here
        Student s = new Student();
        s.display();

        //Parameterized constructor is called here
        Student s1 = new Student(10, 80, "Mark");
        s1.display();

        Student s2 = new Student(20, 90, "Bill");
        s2.display();

        Student s3 = new Student(s2);
        s3.display();

        Student s4 = new Student(s3);
        s4.display();
    }
}