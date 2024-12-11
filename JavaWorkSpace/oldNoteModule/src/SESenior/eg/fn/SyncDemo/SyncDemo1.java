/*
 * �ó���ģ����·��Ʊϵͳ��ʵ��ͨ��������Ʊ�㷢��ĳ��ĳ���г���50�ų�Ʊ��
 * һ����Ʊ����һ���̱߳�ʾ
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo1 {
	public static void main(String[] args) {
		/*
		 * new SaleTicketThread("����1").start(); new
		 * SaleTicketThread("����2").start();
		 */

		// ����Ʊ�����ڲ���װ����Ʊ�ķ��������Ҿ߱��������߳��е�������
		Ticket tickt = new Ticket();
		// �ö������ͬʱ��Ʊ�����߳�ִ��ָ�����������
		new Thread(tickt, "����1").start();
		new Thread(tickt, "����2").start();
	}
}

class Ticket implements Runnable {
	int num = 50;// Ʊ��
	Object obj = new Object();

	@Override
	public void run() {
		// ��ͣ����Ʊ
		while (true) {
			sale();
		}
	}

	/**
	 * ��Ʊ��ÿ����һ�Σ���һ��Ʊ
	 */
	// ͬ����������ʵ����ͬ�������ļ�д��ʽ
	public synchronized void sale() {
		// ͬ������飬ͬһʱ��ֻ����һ���߳̽���ִ������Ĵ���
		//synchronized (this) {// ͬ����,ÿ�����󶼿�����Ϊͬ��������ʹ��(�����κζ���)
		if (num > 0) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + "...sale..." + num--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//}
	}
}

class SaleTicketThread extends Thread {
	private int num = 50;

	public SaleTicketThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (num > 0) {
			System.out.println(getName() + "......sale....." + num);
			num--;
		}
	}
}
