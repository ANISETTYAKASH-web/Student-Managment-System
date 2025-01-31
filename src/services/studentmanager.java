package src.services;
import src.exception.DuplicateStudentIdException;
import src.exception.Studentdoesnotexist;
import src.module.Student;
import java.util.HashMap;
import java.util.Scanner;

public class studentmanager {
  private HashMap<String,Student> map = new HashMap<String,Student>();
  Scanner sc = new Scanner(System.in);
  public void addStudent(Student student) throws DuplicateStudentIdException
  {
    if(map.containsKey(student.getId()))
    {
      throw new DuplicateStudentIdException("" );
    }
    map.put(student.getId(), student);
  }
  public void viewAll()
  {
    if(map.isEmpty()) System.out.println("No students to display");
    else {
      map.forEach((k,v)->{System.out.println(v);});
    }
  }
  public void delete(String id) throws Studentdoesnotexist
  {
    if(!map.containsKey(id)) throw new Studentdoesnotexist(" ");
    else map.remove(id);
  }
  public void update(String id)
  {
    if(!map.containsKey(id)) System.out.println("student doesn't exist");
    else {
      System.out.println("enter what you want to update 1.name 2.age 3.grade");
      int choice = sc.nextInt();
      // Student updated = Student.getId(id);
      // Student updated = new Student();
      Student updatedStudent = map.get(id);
      switch (choice) {
        case 1:
          System.out.println("enter name to update");
          String name = sc.next();
          updatedStudent.setName(name); 
          break;
        case 2:
          System.out.println("enter age to update");
          int age = sc.nextInt();
          updatedStudent.setAge(age); 
          break;
        case 3:
          System.out.println("enter grade to update");
          float grade = sc.nextFloat();
          updatedStudent.setGrade(grade); 
          break;
        // default:
        //   break;
      }
    }
  }
}
