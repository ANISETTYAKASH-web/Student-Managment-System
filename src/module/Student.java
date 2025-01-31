package src.module;
public class Student 
{
  private String id;
  private String name;
  private int age;
  private float grade;   


  public Student(String id,String name,int age,float grade)
  {
    this.age=age;
    this.grade=grade;
    this.name = name;
    this.id = id;

  }
  public String getName(){
    return name;
  }
  public  void setName(String name){
    this.name=name;
  }
  public String getId(){
    return id;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age=age;
  }
  public float getGrade(){
    return grade;
  }
  public void setGrade(float grade){
    this.grade=grade;
  }
  public String toString()
  {
    return "Stuent ID: "+id+", Name: "+name+", Age: "+age+", Grade: "+grade;
  }
  
}