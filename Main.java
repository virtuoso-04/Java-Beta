interface A {
void method1();
}
interface B
{
  void method2();
}
class C implements A,B
{
  public void method1()
  {
    System.out.println("Method 1");
  }
    public void method2()
  {
    System.out.println("Method 2");
  }
}
class Myclass 
  {
    public static void main (String args[]) 
    {
      C obj= new C();
      obj.method1();
      obj.method2();
    }
  }


      
