interface Person
{
    public void introduce();
   }
interface teacher extends Person
{
   public void teach();
   public void setTid(int);
}
interface student extends Person
{
    public void study();
    public void setSid(int);
 }
class TeacherAsst implement  Teacher ,student
{
    private string name;
    private int Tid;
    private int Sid;
}
public TeacherAsst()
{
      this.name = "";
      this.Tid = Null;
      this.Sid = Null;
}
public TeacherAsst(string name ,int Tid , int Sid)
{
      this.name = name ;
      this.Tid = Tid;
      this.Sid = Sid;
}
public void SetTid(int Tid)
{
  this.Tid = Tid;
  Syastem.out.println("teacher ID is" + this.Tid);
}
public voidsetid(sid this.sid(int Sid)
{
      this.Sid = Sid;
public.out.println("Student ID is" + this.Sid);
}
poblic void interoduce()
{
   System.out.println("My Name is :" + this.name);
}
public void teach()
{
    System.out.println("I am teachr  in java Sybject"); 
}
public void Study()
{
      System.out.println("I am student for python subject");
}
public void TeacherAsst()
{
   System.out.println("I am teacher assistants");
 }
}
class main()
{
public static void main(String [] args)
 {
    TeacherAsst T = new TeacherAsst("vishanu")
  

