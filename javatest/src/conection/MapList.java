package conection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("01", "李同学");
		map.put("02", "魏同学");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		System.out.println("key集合中的元素");
		
		while (it.hasNext()) {
			String key=it.next();
			System.out.println(key+""+ map.get(key));
		}
		Collection<String> coll=map.values();
		it=coll.iterator();
		while (it.hasNext()) {
			String key=it.next();
			System.out.println(key);
		}
	}

}
