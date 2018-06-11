package conection;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object> {
	String name;
	long id;
	String stu;

	public UpdateStu(String name, long id,String stu) {
		this.name = name;
		this.id = id;
		this.stu = stu;
	}

	public int compareTo(Object o) {
		UpdateStu upstu = (UpdateStu) o;
		int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long Id) {
		this.id = Id;
	}

	public String getStu() {
		return this.stu;
	}

	public void setStu(String Stu) {
		this.stu = Stu;
	}
	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu("李同学", 1,"stu1");
		UpdateStu stu2 = new UpdateStu("陈同学", 3,"stu2");
		UpdateStu stu3 = new UpdateStu("王同学", 4,"stu3");
		UpdateStu stu4 = new UpdateStu("马同学", 2,"stu4");

		TreeSet<UpdateStu> tree = new TreeSet<UpdateStu>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);

		Iterator<UpdateStu> it = tree.iterator();
		System.out.println("Set集合中的所有元素：");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName()+" "+stu.getStu());

		}

		it = tree.headSet(stu2).iterator();// 载取排在stu2对象之前的对象
		System.out.println("载取前面部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName()+" "+stu.getStu());
		}
		it=tree.subSet(stu2, stu3).iterator();
		System.out.println("载取中间部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName()+" "+stu.getStu());
		}
	}

}
