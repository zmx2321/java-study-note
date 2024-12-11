package SESenior.video.note.ThreadDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		//����һ���߳���Ķ���
		HelloThread h1 = new HelloThread();
		h1.start();  //�����߳�
		
		//����Ĭ���̶߳���
		h1.setName("�߳�1");
		
		//һ���߳�����Դ�������߳�
		HelloThread h2 = new HelloThread();
		h2.start();  //�����߳�
		
		//����Ĭ���̶߳���
		h1.setName("�߳�2");
		
		//�����̲߳��ƶ�����
		HelloThread h3 = new HelloThread("A");
		HelloThread h4 = new HelloThread("B");
		h3.start();
		h4.start();
		
		//�߳�һ�����������ѿ��ƣ�ÿ��ִ�еĽ����һ��
	}
}

//�߳���
class HelloThread extends Thread{
	public HelloThread(){
		
	}
	
	public HelloThread(String name){
		super(name);
	}
	
	//��дrun�������߳�Ҫ���ľ��幤��
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			//System.out.println(i);
			
			//��ӡ�߳�����
			System.out.println(this.getName() + ":" + i);
		}
	}
}