class Student {
    int rollno = 1001;
    String name = "Sameer";
    String city = "Pune";
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s = new Student(); // First Object
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.city);

        Student s2 = new Student(); // Second Object -> 2nd Student
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.city);

        Student s3 = new Student();
        s3.rollno = 1003;
        s3.name = "Dollar";
        s3.city = "New York";
        System.out.println(s3.rollno);
        System.out.println(s3.name);
        System.out.println(s3.city);
    }
}
