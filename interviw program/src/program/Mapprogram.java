package program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapprogram {
public static void main(String[] args) {
	Map m=new HashMap();
	    m.put(1, "java");
	    m.put(2, "python");
	    m.put(3, "HTML");
	    m.put(4, "CSS");
	    Set<Integer> keys=m.keySet();
	    Iterator itr=keys.iterator();
	    while(itr.hasNext())
	    {
	    	int key=(int)itr.next();
	    	System.out.println(key);
	    	String val=(String)m.get(key);
	    	System.out.println(val);
	    }

}
}
