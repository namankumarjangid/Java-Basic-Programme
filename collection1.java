import java.util.*;

/**
 *
 * @author Naman Nisu
 */
public class collection1 {
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    ArrayList l=new ArrayList(25);
    l.add("ajay");
    l.add("naman");
    Iterator it=l.iterator();
    while(it.hasNext())
    {System.out.println(it.next());
    
    }
}
}
