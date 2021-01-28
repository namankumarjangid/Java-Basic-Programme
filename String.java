class String
{
    public static void main(String args[])
{
    String str1=Easytutsforyou;
    String str2= new String("java");
    char name[]={'r','a','m','a','n'};
    String str3= new String(name);
    String str4= new String(name,2,3);
    String str5= new String(str4);
    System.out.println("1st String:"+str1.length());
    System.out.println("2nd string:"+str2);
    System.out.println("3rd string:"+str5);
}
}