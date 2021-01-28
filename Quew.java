import java.util.Scanner;
class Student
{
public static void main(String args[])
{
int no;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
no=obj.nextInt();
System.out.println("que of the no is"+(no*no*no));
}
}