/**
 * �����̵߳�ѭ�����
 * ���߳�ѭ��3�Σ��������߳�ѭ��6�Σ������ֻص����߳�ѭ��3�Σ������ٻص����߳���ѭ��6�Σ����ѭ��10�Σ���д������
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo6 {
	static boolean flag = false; // ��¼���߳��Ƿ��Ѿ����
	static Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated methodstub
		// ���߳�
		new Thread() {
			@Override
			public void run() {
				try {
					for (int i = 1; i <= 10; i++) {
						synchronized (lock) {
							if (flag) {
								lock.wait();
							}
							System.out.println("~~~~~~~~~~~~~~��" + i + "�غ�~~~~~~~~");
							for (int j = 1; j <= 3; j++) {
								System.out.println("���߳�" + j);
								Thread.sleep(200);
							}
							flag = true;
							lock.notify();
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
		// ���߳�
		for (int i = 1; i <= 10; i++) {
			try {
				synchronized (lock) {
					if (!flag) {
						lock.wait();
					}
					for (int j = 1; j <= 6; j++) {
						System.out.println("���߳�....." + j);
						Thread.sleep(200);
					}
					flag = false;
					lock.notify();
				}
			} catch (InterruptedException e) {
				// TODOAuto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
