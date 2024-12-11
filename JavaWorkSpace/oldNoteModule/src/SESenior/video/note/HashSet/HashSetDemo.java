package SESenior.video.note.HashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//����һ��HashSet����
		//֧�ַ���
		HashSet<String> data = new HashSet<>();
		
		//���
		data.add("zhangsan");
		data.add("lisi");
		data.add("wangwu");
		data.add("zhaoliu");
		data.add("zhangsan");
		
		//��ӡ
		System.out.println(data);
		
		//�鿴�Ƿ���ӳɹ�
		System.out.println(data.add("zhangsan"));
		
		//�鿴����
		System.out.println(data.size());
		
		
		//ѧ������
		HashSet<Student> stuSet = new HashSet<>();
		
		stuSet.add(new Student("����", 20));
		stuSet.add(new Student("����", 30));
		stuSet.add(new Student("����", 20));
		
		//û�г�ͻ(new)
		System.out.println(stuSet.add(new Student("����", 20)));
		
		//�鿴����
		System.out.println(stuSet.size());
	}
}

class Student{
	private String name;
	private int age;
	
	public Student() {
	}
	
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

	//������������ظ�����ֻ�϶�����һ��
	//��дhashcode��equals����
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
