

// Class definition
class Student {
    // Instance variables
String name;
    int age;
    String course;

    // Constructor with parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student info
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("-------------------");
    }
}

