package SESenior.eg.fn.exd;

public class Test2 {
	public static void main(String[] args) {
		Son son = new Son();
		Father father = new Father(son);
		father.fun1();
		father.fun4();
	}
}

class Father {
	public Son son;

	public Father(Son son) {
		this.son = son;
	}

	public Father() {

	}

	public void fun4() {
		// ����3��ʹ�÷���ķ�ʽ�������෽��
		try {
			Class<?> cls = Class.forName("eg.fn.exd.Son");
			Son son = (Son) cls.newInstance();
			son.fun2();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void fun1() {
		// ����1�������ഫ�ݵ�������вι��캯���У�Ȼ����á�
		System.out.println("���Ǹ���ķ���");
		son.fun2();

		// ����2�������������ľ�̬������
		Son.fun3();
	}
}

class Son extends Father {

	public static void fun3() {
		System.out.println("��������ľ�̬����");
	}

	public void fun2() {
		System.out.println("��������ķ���");

	}

}
