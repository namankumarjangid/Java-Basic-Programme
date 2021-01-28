import.java.util.Scannner;
class While
{
public static void main(String ar[])
{
int no;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
no=obj.nextInt();
do
{
System.out.print(no);
no=no+2;
}
while(no<=100);
}
}