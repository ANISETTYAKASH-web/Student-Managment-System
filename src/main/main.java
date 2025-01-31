package src.main;
import src.services.*;
import src.exception.DuplicateStudentIdException;
import src.module.*;
public class Main {
  public static void main(String[] args)
  {
    Student newstu = new Student("10","akash",18,81);
    Student newstud = new Student("10","akash",18,81);
    studentmanager stu = new studentmanager();
    try
    {
      stu.addStudent(newstu);
    }
    catch(DuplicateStudentIdException e)
    {
      System.out.println(e.getMessage());
    }
    try
    {
      stu.addStudent(newstud);
    }
    catch(DuplicateStudentIdException e)
    {
      System.out.println(e.getMessage());
    }
    stu.viewAll();
  }
}
