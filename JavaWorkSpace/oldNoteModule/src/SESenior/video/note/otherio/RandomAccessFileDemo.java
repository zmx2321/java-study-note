package SESenior.video.note.otherio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		Person[] persons = {new Person("zz", 90), new Person("we", 50), new Person("vfvfd", 44)};
		
		RandomAccessFile raf = new RandomAccessFile("D:\\_site_\\aaa\\io2.txt", "rw");
		
		//д�����ݵ�RandomAccessFile���������
		for(int i=0; i<persons.length; i++){
			raf.writeChars(persons[i].getName());
			raf.writeInt(persons[i].getAge());
		}
		
		//��ȡָ��λ�õ�Person����
		Scanner in = new Scanner(System.in);
		
		System.out.println("��ȡ�ڼ���Person��������");
		int num = in.nextInt();
		//ʹ��seek������������ȡλ��
		raf.seek((num-1)*Person.size());
		
		Person p = new Person();
		
		//��
		p.setName(readName(raf));
		
		p.setAge(raf.readInt());
		
		System.out.println("������" + p.getName());
		System.out.println("���䣺" + p.getAge());
		
		raf.close();
		in.close();
	}
	
	private static String readName(RandomAccessFile raf) throws IOException{
		char[] name = new char[15];
		for(int i=0; i<name.length; i++){
			name[i] = raf.readChar();
		}
		return new String(name).replace('\u0000', ' ');
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		StringBuilder builder = null;
		if(name!=null){
			builder = new StringBuilder(name);
		}else{
			//�Զ��峤�ȵĶ�̬�ַ���
			builder = new StringBuilder(15);
		}
		
		//�趨builder�Ĺ̶�����(���ַ�'\u0000')
		//15���ַ���ռ30���ֽڣ�java��Unicode���룩
		builder.setLength(15);
		
		this.name = builder.toString();
		this.age = age;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		StringBuilder builder = null;
		if(name!=null){
			builder = new StringBuilder(name);
		}else{
			//�Զ��峤�ȵĶ�̬�ַ���
			builder = new StringBuilder(15);
		}
		
		//�趨builder�Ĺ̶�����(���ַ�'\u0000')
		//15���ַ���ռ30���ֽڣ�java��Unicode���룩
		builder.setLength(15);
		
		this.name = builder.toString();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//ÿ��������ռ���ֽ���
	public static int size(){
		return 34;
	}
}
