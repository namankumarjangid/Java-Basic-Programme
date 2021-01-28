import java.util.Scanner;
class Student
{
int a,b;
Scanner obj=new Scanner(System.in);
void getmarks()
{
System.out.println("enter the first marks");
a=obj.nextInt();
System.out.println("enter the second marks");
b=obj.nextInt();
}
}
interface Sport
{
int sp=5;
void spmarks();
}
class Result extends Student implements Sport
{
public void spmarks()
{
System.out.println("sports marks is :"+sp);
}
void disp()
{
int total=a+b+sp;
System.out.println("total marks is:"+total);
}
}
class Marks
{
public static void main(String ar[])
{
Student obj1=new Student();
Result obj2=new Result();
obj1.getmarks();
obj2.spmarks();
obj2.disp();
}
}
