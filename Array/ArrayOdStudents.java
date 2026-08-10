class Students{
  int rollno;
  int marks;
  String name;
}

public class ArrayOdStudents {
  public static void main(String[] args) {
    Students s1 = new Students();
    s1.marks = 67;
    s1.name = "Kai";
    s1.rollno = 1;

    Students s2 = new Students();
    s2.marks = 68;
    s2.name = "Speed";
    s2.rollno = 2;

    Students s3 = new Students();
    s3.marks = 69;
    s3.name = "Jason";
    s3.rollno = 3;

    Students[] student = new Students[3];
    student[0] = s1;
    student[1] = s2;
    student[2] = s3;

    for (int i = 0; i < student.length; i++) {
      System.out.println(student[i].name + " = " + student[i].marks);
    }

    System.out.println("_______________");

    for (Students students : student) {
      System.out.println(students.marks + " = " + students.name + " | RollNo = " + students.rollno);
    }




  }
   

  
}
