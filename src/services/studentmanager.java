package src.services;
import src.exception.DuplicateStudentIdException;
import src.module.Student;
import java.util.HashMap;

public class studentmanager {
  private HashMap<String,Student> map = new HashMap<String,Student>();
  public void addStudent(Student student) throws DuplicateStudentIdException
  {
    if(map.containsKey(student.getId()))
    {
      throw new DuplicateStudentIdException("Student Id: "+student.getId()+"already exists");
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
  public void delete(String id)
  {
    if(map.containsKey(id)) map.remove(id);
    else System.out.println("wrong entry");
  }
}
