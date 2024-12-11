package SESenior.video.note.TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		//����һ��TreeMap����(Person1)
		TreeMap<Person1, String> pdata1 = new TreeMap<>();
		pdata1.put(new Person1("zhangsan", 30), "����");
		pdata1.put(new Person1("lisi", 60), "����");
		pdata1.put(new Person1("rose", 22), "õ��");
		pdata1.put(new Person1("zhangsan", 16), "����");
		
		Set<Entry<Person1, String>> entrys1 = pdata1.entrySet();
		for(Entry<Person1, String> entry:entrys1){
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println(pdata1);
		
		
		//����һ��TreeMap����(Person2)
		//ʹ�������ڲ���
		TreeMap<Person2, String> pdata2 = new TreeMap<>(new Comparator<Person2>(){
			@Override
			public int compare(Person2 o1, Person2 o2) {
				//��С����
				//return o1.getAge() - o2.getAge();
				
				//���������ͬ���������������
				if(o1.getName().compareTo(o2.getName())>0){
					return 1;
				}else if(o1.getName().compareTo(o2.getName())<0){
					return -1;
				}else{
					return o1.getAge() - o2.getAge();
				}
			}
		});
		
		pdata2.put(new Person2("zhangsan", 30), "����");
		pdata2.put(new Person2("lisi", 60), "����");
		pdata2.put(new Person2("rose", 22), "õ��");
		pdata2.put(new Person2("zhangsan", 16), "����");
		
		Set<Entry<Person2, String>> entrys2 = pdata2.entrySet();
		for(Entry<Person2, String> entry:entrys2){
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		System.out.println(pdata2);
	}
}

//ʵ��Comparable�ӿ��еķ���
class Person1 implements Comparable<Person1> {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//ʵ�ֽӿڷ���
	@Override
	public int compareTo(Person1 o) {
		if(this.age - o.getAge()>0){
			return 1;
		}else if(this.age - o.getAge()<0){
			return 1;
		}
		return 0;
	}
}

class Person2 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}