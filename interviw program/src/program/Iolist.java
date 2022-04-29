package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iolist {
public static void main(String[] args) {
	List l=new ArrayList();
	     l.add(19);
	     l.add(1995);
	     l.add("pradip");
	     l.add("shinde");
	     Iterator itr=l.iterator();
	     while(itr.hasNext())
	     {
	    	 Object o=itr.next();
	    	 if(o instanceof Integer)
	    	 {
	    		 int x=(int)o;
	    		 System.out.println(x);
	    	 }
	    	 else
	    	 {
	    		 String s=(String)o;
	    		 System.out.println(s);
	    	 }
	     }
    }
}
