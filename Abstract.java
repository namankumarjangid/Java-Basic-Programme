abstract class A
{
abstract void disp();
void display()
{
System.out.println("method from a class");
}
}
class B extends A
{
void disp()
{
System.out.println("method of b class");
}
void add()
{
System.out.println("new another method");
}
}
class Abstract
{
public static void main(String ar[])
{
B obj=new B();
obj.disp();
obj.display();
obj.add();
}
}