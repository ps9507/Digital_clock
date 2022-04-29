package program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setprogram {
public static void main(String[] args) {
	Set s=new HashSet<>();
	    s.add(1);
	    s.add(2);
	    s.add(3);
	    s.add(4);
	    Iterator itr=s.iterator();
	    while(itr.hasNext())
	    {
	    	int x=(int)itr.next();
	    	System.out.println(x);
	    }

}
}
