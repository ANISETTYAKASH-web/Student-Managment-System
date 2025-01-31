package src.main;
import src.services.*;
import src.exception.DuplicateStudentIdException;
import src.exception.Studentdoesnotexist;
import src.module.*;
import java.util.*;
public class Main {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter choice");
    System.out.println("\n 1.add new student\n2.viewAll\n3.delete\n4.update");
    studentmanager stm = new studentmanager();
    while(true){
    int choice  = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("enter id");
        String id = sc.next();
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter grade");
        float grade = sc.nextFloat();
        Student st = new Student(id, name, age, grade);
        try{
        stm.addStudent(st);
        }
        catch(DuplicateStudentIdException e)
        {
          System.out.println(e.getMessage());
        }
        break;
      case 2:
        stm.viewAll();
        break;
      case 3:
        System.out.println("enter id");
        String ids = sc.next();
        try{
          stm.delete(ids);
        }
        catch(Studentdoesnotexist e)
        {
          System.out.println(e.getMessage());
        }
        break;
      case 4:
        System.out.println("enter id");
        String idu = sc.next();
        stm.update(idu);
        break;     
      default: System.out.println("enter a valid choice"); 
        break;
    }
  }
  }
}
