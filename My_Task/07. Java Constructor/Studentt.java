   public class Studentt{
     // Attributes
    int studenttId;
    String studenttName;
    String course;

  Studentt(){
    studenttId = 101;
    studenttName = "john";
    course = "Java programming";
  }

  Studentt(int studentId,String studentName,String course){
    this.studenttId = studentId;
    this.studenttName = studentName;
    this.course = course;
}

Studentt(Studentt s){

    this.studenttId = s.studenttId;
    this.studenttName = s.studenttName;
    this.course = s.course;
}

void displayDetails(){
    
    System.out.println("Student ID: " + studenttId);
    System.out.println("Student Name: " + studenttName);
    System.out.println("Course: " + course);
    System.out.println("                  ");
}

public static void main(String[]args){
   
    Studentt s1= new Studentt();
    Studentt s2 = new Studentt(102,"Izza Faris","Cyber Security");
    Studentt s3 = new Studentt(s2);


   
    System.out.println("\n=== Student Details ===\n");

    s1.displayDetails();
    s2.displayDetails();
    s3.displayDetails();
}



}



















