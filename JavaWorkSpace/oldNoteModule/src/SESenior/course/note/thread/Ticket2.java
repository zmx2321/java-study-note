package SESenior.course.note.thread;

/**
 * 
 * ��Ʊ����
 * ����߳����п��ܻ���ֹ������ݵ�����
 *
 */

public class Ticket2 implements Runnable {
	
	private int total = 100;
	
	public Ticket2() {}

	@Override
	public void run() {
		//ѭ��Ҫ������
		while(total > 0) {
			boolean none = ticket();
			
			if(!none){
				break;
			}
		}
	}
	
	//ͬ��������(Ĭ����this)
	private synchronized boolean ticket(){
		//�ж�
		if(total <= 0){
			return false;
		}
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "������Ʊ����ǰƱ��" + total + "��ʣ��" + total + "��Ʊ");
		total--;
		
		return true;
	}
	
	//��̬��ͬ������ -- Class����
	@SuppressWarnings("unused")
	private static synchronized void testLock(){}
}
