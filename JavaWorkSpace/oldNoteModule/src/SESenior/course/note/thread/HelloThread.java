package SESenior.course.note.thread;

/**
 * 
 * ʵ���̷߳�ʽһ��
 * 1.�̳�Thread��
 * 2.��дrun����
 * 3.�߳���ִ�еĴ��룬д��run������
 *
 */

public class HelloThread extends Thread {  //�߳���
	
	@Override
	public void run() {
		
		String ThreadName = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++){
			try {
				//�������ʾһ����ִ��һ��
				Thread.sleep(1000);  //�Զ���
				//wait();  //���ж�����wait�������ȴ�������ռcpu����Ҫnotify���ѣ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(ThreadName + " for i=" + i);
		}
		
		//���������ָһ����֮��ȫ��ִ��
		/*String ThreadName = Thread.currentThread().getName();
		for(int i=1; i<=10; i++){
			System.out.println(ThreadName + " for i=" + i);
		}*/
	}
	
}
