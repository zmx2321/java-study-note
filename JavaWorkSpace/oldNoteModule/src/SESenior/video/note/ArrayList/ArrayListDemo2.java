package SESenior.video.note.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		Student stu1 = new Student("zhangsan", 10);
		Student stu2 = new Student("lisi", 18);
		Student stu3 = new Student("wangwu", 32);
		Student stu4 = new Student("zmx", 18);
		Student stu5 = new Student("ddd", 20);
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);
		stuList.add(stu5);
		
		Student stu6 = new Student("ddd", 20);
		//û�ҵ�
		System.out.println(stuList.indexOf(stu6));
		//�����ֺ�����һ������Ĭ���������д���
		//��дequals����....
		//ɾ��
		System.out.println(stuList.indexOf(stu5));
		System.out.println(stuList.contains(stu6));
		System.out.println(stuList.remove(stu6));
		System.out.println(stuList.indexOf(stu6));
		System.out.println(stuList.indexOf(stu5));
		System.out.println(stuList.size());
	}
}

class Student{
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
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//ctrl+alt+s --> hashCode and equals
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
		if (this == obj)  //�Լ����Լ��ȣ�����ָ��ָ��ͬһ������
			return true;
		if (obj == null)  //Ϊ��
			return false;
		if (getClass() != obj.getClass())  //���Ͳ�һ��������˵���˺͹�
			return false;
		Student other = (Student) obj;  //ת����ѧ������
		if (age != other.age)  //���䲻���
			return false;
		if (name == null) {  //����Ϊ��
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))  //���ֲ����
			return false;
		return true;  //�����������һ���ŷ���true
	}
}
