import java.util.Scanner;
class Test
{
int a,b,c;
Scanner obj=new Scanner(System.in);
void getdata()
{
System.out.println("enter the number");
a=obj.nextInt();
System.out.println("enter the second number");
b=obj.nextInt();
}
void add()
{
c=a+b;
System.out.println("the addition is:"+c);
}
}
class Main
{
public static void main(String ar[])
{
Test obj=new Test();
obj.getdata();
obj.add();
}
}
