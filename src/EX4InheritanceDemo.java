// Base class
class Person
{
    String name;
    int age;
    void setPersonDetails(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayPersonDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// Derived class
class Student extends Person
{
    int rollNo;
    String course;
    void setStudentDetails(String name, int age, int rollNo, String course)
    {
// Calling the method of base class
        setPersonDetails(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentDetails() {
// Calling the method of base class
        displayPersonDetails();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Main class
public class EX4InheritanceDemo
{
    public static void main(String[] args)
    {
        Student student = new Student();
// Set student details
        student.setStudentDetails("Alice", 20, 101, "Computer Science");
// Display student details
        System.out.println("Student Information:");
        student.displayStudentDetails();
    }
}