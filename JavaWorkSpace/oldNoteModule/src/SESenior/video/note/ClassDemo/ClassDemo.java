package SESenior.video.note.ClassDemo;

public class ClassDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee emp = new Employee("zhangs", 20);
		
		//���ش�object������ʱ��
		//��ö�������������͵�class����
		//?��ʾ������Ϳ��Խ����������͵�class����
		//������.getclass
		//Class<?> classType = emp.getClass();
		
		//����.class
		//Class<?> classType = Employee.class;
		
		//class.forName()
		//��������и����ַ����������ӿ��������class����
		/*try {
			Class<?> classType = Class.forName("video.note.ClassDemo.Employee");
			System.out.println(classType.getCanonicalName());
			System.out.println(classType.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//��ȡ�����������͵�class����(������������û�и���)
		//Class<?> classType = int.class;
		
		//ͨ�������������͵İ�װ������ȡ�Ļ���������������Ӧ��class����
		//Class<?> classType = Double.TYPE;
		
		//��װ���и���
		Class<?> classType = Double.class;
		
		//����
		System.out.println(classType.getCanonicalName());
		
		//����class����ĸ���(������������û�и���)
		System.out.println(classType.getSuperclass().getName());
		
		
	}
}

class Employee{
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
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}