import java.io.*;
import java.net.*;
class Connection{

	public static void main(String[] args)throws Exceptions
	{
		URL u1=new URL("http://google.com");
		URLConnection u2=u1.openConnection();
		InputStream is=u2.getInputStream();
		int i;
		while(i=is.read()!=-1)
		{
			System.out.println((char)i);
	}
	}
}
