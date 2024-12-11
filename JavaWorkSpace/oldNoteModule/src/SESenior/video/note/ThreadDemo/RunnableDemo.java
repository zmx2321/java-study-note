package SESenior.video.note.ThreadDemo;

public class RunnableDemo {
	public static void main(String[] args) {
		//����ʵ�ֽӿڵ�ʵ����
		HelloRunnable h1 = new HelloRunnable();
		
		//����һ���߳������
		Thread t1 = new Thread(h1);
		
		//�����߳�
		t1.start();
		
		//�޸��߳���
		Thread t2 = new Thread(h1, "A");
		t2.start();
		
		Thread t3 = new Thread(h1, "B");
		t3.start();
		
	}
}

//�ýӿڱ��ⵥ�̳еľ���
//һ�������ʵ�ֶ���ӿڣ���ֻ�ܼ̳�һ����
//�ʺ���Դ�Ĺ���

//�߳���
class HelloRunnable implements Runnable {
	//��дrun�������߳�Ҫ���ľ��幤��
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			//��ȡ��ǰ�̶߳�������ã��ٻ�ȡ��ǰ�̶߳��������
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
	}
}