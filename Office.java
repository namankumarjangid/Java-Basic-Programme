import java.util.Scanner;
class Office
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the salary");
int sal=obj.nextInt();
if(sal>=10000)
{
System.out.println("your diwali bonus is" + (sal+sal/10));
}
else
{
System.out.println("your salary is" + (sal));
}
}
}