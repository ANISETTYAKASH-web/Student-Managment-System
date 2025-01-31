package src.exception;
  public class Studentdoesnotexist extends Exception{
    public Studentdoesnotexist(String message)
    {
      super("student doesn't exist");
    }
}
