package SESenior.video.note.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//�ӿڵ����ñ�����������ʵ�������
		Map<Student, String> map = new HashMap<>();
		map.put(new Student("jay", 20), "����");
		map.put(new Student("lisi", 30), "����");
		map.put(new Student("lisi", 30), "333");
		
		//�鿴Ԫ������
		System.out.println(map.size());
		
		//��ӡ
		System.out.println(map);
		
		//��Entry����
		Set<Entry<Student, String>> entrys = map.entrySet();
		for(Entry<Student, String> entry:entrys){
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}
}

class Student{
	private String name;
	private int age;
	
	public Student() {}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	//�������ͬ����ֵ����
	//��дhashcode������equals����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}