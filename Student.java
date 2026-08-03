class Student {

    String name;
    int age;
    int marks;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }


public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.name = "Ravi";
        s1.age = 20;
        s1.marks = 85;

        s1.display();
    }
}
    
}
