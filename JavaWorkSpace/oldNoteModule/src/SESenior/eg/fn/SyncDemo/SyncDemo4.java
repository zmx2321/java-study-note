/*
 *  ������ģʽ�е��߳�ͬ������
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo4 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(Singleton3.getInstance());
			}

		}.start();

		new Thread() {

			@Override
			public void run() {
				System.out.println(Singleton3.getInstance());
			}

		}.start();

	}
}

// ����ģʽ(����ʽ)
class Singleton {
	// ��̬�ֶ���������ص�ʱ��ͳ�ʼ����
	private static Singleton instance = new Singleton();

	// ˽�л����췽������ֹ��紴������
	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}

// ����ģʽ(����ʽ)
// �����̰߳�ȫ���⣬����ͨ��˫���жϼ�ͬ��������������̰߳�ȫ����

class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
		// emty
	}

	// ������̰߳�ȫ����ֻ������ڵ�һ�δ��������ʱ��ֻҪ�����Ѿ��������꣬
	// ��ô�Ͳ���Ҫ�ٶԴ������ͬ������
	// public static synchronizedSingleton2
	// getInstance(){//�����̰߳�ȫ���⣬����ͨ��˫���жϼ�ͬ��������������̰߳�ȫ����
	public static Singleton2 getInstance() {
		if (instance == null) { // ͨ��˫���ж϶����Ƿ����
			synchronized (Singleton2.class) {// ͬ��
				if (instance == null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}

/*
 * ʹ�þ�̬�ڲ���ʵ�ֵ���ģʽ ������ص�ʱ���������еĳ�Ա�����ʼ����̬�ֶΣ������еĳ�Ա���ص��ڴ���(������)
 *
 */
class Singleton3 {
	private Singleton3() {

	}

	// ��̬�����ֻ��������ص�ʱ�򱻵���һ��
	static {
		System.out.println("�ⲿ���еľ�̬�����......");
	}

	// ��̬�ڲ���
	private static class Inner {
		static Singleton3 instance = new Singleton3();

		static {
			System.out.println("�ڲ����еľ�̬�����.....");
		}
	}

	public static Singleton3 getInstance() {
		return Inner.instance;
	}
}
