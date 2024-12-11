package SESenior.course.note.thread;

/**
 *
 * �߳�ʵ�ַ�������
 * 1.ʵ��Runnable�ӿ�
 * 2.��дrun����
 * 3.������ʽ������Thread���е�start����
 *
 */

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		
		int count = 0;
		//�߳�ִ���߼�
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������" + count++);
		}
	}

}
