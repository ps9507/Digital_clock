 package program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap12  {
public static void main(String[] args) {
	Map m=new HashMap<>();
	m.put(1, 10);
	m.put(2, 20);
	m.put(3, 30);
	Set<Integer>keys=m.keySet();
	System.out.println(keys);
	Iterator<Integer>itr=keys.iterator();
	while(itr.hasNext())
	{
		int key=itr.next();
		int val1=(int)m.get(key);
		System.out.println(val1);

	}
}
}
