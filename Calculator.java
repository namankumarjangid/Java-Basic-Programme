import java.util.Scanner;
class Calc
{
public static void main(String[] args)
{
int a,b;
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of a");
a=obj.nextInt();
System.out.println("enter the value of b");
b=obj.nextInt();
System.out.println("choose the operator (+,-,*,/):");
char operator=obj.next().charAt(0);
obj.close();
int result;
switch(operator)
{
case "+":
System.out.println("the addition is" + (a+b));
break;
case "-":
System.out.println("the subtraction is" + (a-b));
break;
case "*'":
System.out.println("the multiplication is" + (a*b));
break;
case "/":
System.out.println("the devision is" + (a/b));
break;
case "%":
System.out.println("symbol can't find");
break;
default:
System.out.println("error");
return;
}
System.out.println(a+""+result +""+ b+":"+result);
}
}