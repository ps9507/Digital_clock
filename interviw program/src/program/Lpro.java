package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lpro {
	public static void main(String[] args) {
		 List l=new ArrayList();
		     l.add(1);
		     l.add(2);
		     l.add(3);
		     l.add(4);
		     l.add(5);
		     Iterator itr=l.iterator();
		     while(itr.hasNext())
		     {
		    	 int x=(int)itr.next();
		    	 System.out.println(x);
		     }

	}

}
