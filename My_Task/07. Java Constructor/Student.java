   public class Student{
     // Attributes
    int studentId;
    String studentName;
    String course;

  Student(){
    studentId = 101;
    studentName = "john";
    course = "Java programming";
  }

  Student(int studentId,String studentName,String course){
    this.studentId = studentId;
    this.studentName = studentName;
    this.course = course;
}

Student(Student s){

    this.studentId = s.studentId;
    this.studentName = s.studentName;
    this.course = s.course;
}

void displayDetails(){
    
    System.out.println("Student ID: " + studentId);
    System.out.println("Student Name: " + studentName);
    System.out.println("Course: " + course);
    System.out.println("                  ");
}

public static void main(String[]args){
   
    Student s1= new Student();
    Student s2 = new Student(102,"Izza Faris","Cyber Security");
    Student s3 = new Student(s2);


   
    System.out.println("\n=== Student Details ===\n");

    s1.displayDetails();
    s2.displayDetails();
    s3.displayDetails();
}



}



















