package conection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapText {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Emp emp = new Emp("351", "����");
		Emp emp2 = new Emp("512", "����");
		Emp emp3 = new Emp("853", "��һ");
		Emp emp4 = new Emp("125", "����");
		Emp emp5 = new Emp("341", "����");

		map.put(emp4.getId(), emp4.getName());
		map.put(emp5.getId(), emp5.getName());
		map.put(emp.getId(), emp.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) map.get(key);
			System.out.println(key + ":" + value);

		}
		
		TreeMap<String, String> treeMap=new TreeMap<>();
		treeMap.putAll(map);
		Iterator<String> iter=treeMap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�map���ϣ�����������");
		while (iter.hasNext()) {
			String key = (String) iter.next();
			String value = (String) treeMap.get(key);
			System.out.println(key + ":" + value);
			
		}
	}

}

class Emp {
	private String id;
	private String name;

	public Emp(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
