/**
 *  ͬ�˻�ͬ����Ǯ
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo2 {
	public static void main(String[] args) {
		Account account = new Account();
		new Thread(account, "Сǿ").start();
		new Thread(account, "С��").start();
	}
}

class Account implements Runnable {
	private int money = 0; // ���

	@Override
	public void run() {
		// ��Ǯ���Σ�ÿ�δ�100Ԫ�������ڶ���֮����ʾ�˻������
		for (int i = 0; i < 3; i++) {
			saveMoney(100);
		}
	}

	/**
	 * ��Ǯ
	 */
	public synchronized void saveMoney(int money) {
		this.money += money;
		System.out.println(Thread.currentThread().getName() + "����100Ԫ���˻����Ϊ" + this.money);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}
	}
}
