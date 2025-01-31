package src.exception;

public class DuplicateStudentIdException extends Exception{
  public DuplicateStudentIdException(String message)
  {
    super("student already exists");
  }
  
}
