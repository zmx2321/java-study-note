/**
 * д�����̣߳�һ���̴߳�ӡ 1~52����һ���̴߳�ӡ��ĸA-Z��ӡ˳��Ϊ12A34B56C����5152Z��2������1����ĸ����
 * ��ʾ��ʹ���̼߳��ͨ�š�
 * ���ֺ���ĸ�ļ����� 
 */

package SESenior.eg.fn.SyncDemo;

public class SyncDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated methodstub
		Printer printer = new Printer();
		new NumberThread(printer).start();
		new LetterThread(printer).start();
	}
}

// ��������߳�
class NumberThread extends Thread {

	private Printer printer;

	public NumberThread(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 52; i++) {
			printer.printNum(i);
		}
	}
}

// ��ĸ����߳�
class LetterThread extends Thread {
	private Printer printer;

	public LetterThread(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		for (char c = 'A'; c <= 'Z'; c++) {
			printer.printLetter(c);
		}
	}
}

/**
 * ��ӡ�����
 */
class Printer {
	private boolean numOut = false; // �ź�������¼�����Ƿ��Ѿ����
	// �������

	public synchronized void printNum(int num) {
		try {
			if (numOut) {// ��������Ѿ�������͵ȴ������ĸ
				wait();// ע�⣺wait��notify�ĵ����߱����ǵ�ǰͬ��������Ӧ��ͬ����
			}
			System.out.println(num); // �������
			// ����ո������������ż���Ļ����ͻ�����ĸ����߳�
			if (num % 2 == 0) {
				numOut = true; // ����Ѿ��������
				notify(); // ������ĸ����߳�ȥ�����ĸ
			}
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}

	}

	// �����ĸ
	public synchronized void printLetter(char c) {
		try {
			if (!numOut) { // �����û��������֣��͵ȴ��������
				wait();
			}
			System.out.println(c); // �����ĸ
			numOut = false; // ����Ѿ��������ĸ���ȴ��������
			notify(); // ������������߳�ȥ�������
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}

	}
}
