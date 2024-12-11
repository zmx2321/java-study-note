package SESenior.course.note.thread;

/**
 * 
 * ��Ʊ����
 * ����߳����п��ܻ���ֹ������ݵ�����
 *
 */

public class Ticket implements Runnable {
	
	private int total = 100;
	
	public Ticket() {}

	@Override
	public void run() {
		/*// thread[0, 1, 2, 3, 4]
		synchronized (this) {  //�κζ��󶼿��ԣ���������������this��ʾ��ǰ���ʵ���������󱻶���̹߳��������ж��ٸ��̣߳���������еĶ�����ͬһ����
			//����˵��߳�
			// thread[0]ִ�У����Ź��ˣ�˭Ҳ������
			while(total > 0) {
				System.out.println(Thread.currentThread().getName() + "������Ʊ����ǰƱ��" + total + "��ʣ��" + total + "��Ʊ");
				total--;
			}
			//thread[0]ִ�н���
		}
		//thread[0]�߳̽��������Ŵ��ˣ��������Խ�����total=0*/
		
		//ѭ��Ҫ������
		while(total > 0) {
			// ͬ�������
			synchronized (this) {
				if(total <= 0){
					break;
				}
				
				try {
					Thread.sleep(50);  //���ͷ�����wait�ͷ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "������Ʊ����ǰƱ��" + total + "��ʣ��" + total + "��Ʊ");
				total--;
			}
		}
	}
}
