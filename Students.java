import java.util.Scanner;
class Students
{
public static void main(String args[])
{
int roll;
Scanner obj=new Scanner(System.in);
System.out.println("enter the roll no");
roll=obj.nextInt();
switch(roll)
{
case 101:
System.out.println("student name is : ramesh");
System.out.println("fname is : namanji");
break;
case 102:
System.out.println("student name is : pappu");
System.out.println("fname is : praveen");
break;
case 103:
System.out.println("student name is : naman");
System.out.println("fname is : rajesh");
break;
default:
System.out.println("roll no is not found");
}
}
}