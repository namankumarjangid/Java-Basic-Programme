import javava.io.*;
public class FileExample
{
public static void main(String []arr){
FileWriter fw=new FileWriter("D:\DOCUMENTS\New Folder 1/javaexa.txt,trye");
BufferedWriter bf=new BufferedWriter(fw);
bf.Write("compute");
bf.close();
}
}
