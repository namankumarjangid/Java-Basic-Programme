import java.util.Scanner;
class Linearsearch
{
public static void main(string ar[])
{
int i,n,search,a[];
System.out.println("enter the size of the array");
Scanner sc=new Scanner(system.in);
n=sc.nextint();
a=new int [n];
System.out.println("enter the array element:");
for(i=0;i<n;i++)
{
a[i]=sc.nextint();
}
System.out.println("enter the search element:");
search=sc.nextint();
for(i=0;i<n;i++)
{
if(search==a[i])
{
System.out.println("search is found at:" + i);
}
else
{
System.out.println("search is failed");
}
}
}
}
