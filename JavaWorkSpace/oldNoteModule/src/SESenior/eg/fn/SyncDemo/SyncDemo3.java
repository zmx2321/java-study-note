/*
 * ��5����Ҫ��ɽ������ȷ��ɽ��ͬʱֻ����һ����ͨ������ɽ����Ҫ1�룩����ӡ�����ͨ����˳��
 * ����ɽ����˳���ǲ��ɿصģ�ֻҪ��֤ͬһʱ��ֻ��һ������ͨ��ɽ�����ɣ�
 * ��ʾ��ʹ���߳�ͬ����һ���𳵾���һ���߳�
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo3 {
	public static void main(String[] args) {
		new Train("��1").start();
		new Train("��2").start();
		new Train("��3").start();
		new Train("��4").start();
		new Train("��5").start();
	}
}

class Train extends Thread {
	public Train(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (Train.class) {
			System.out.println(getName() + "��ɽ��.....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODOAuto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
