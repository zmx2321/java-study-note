package SESenior.video.note.ThreadDemo;

public class ShareDataThreadDemo {
	public static void main(String[] args) {
		/*//����2���߳������
		TicketThread s1 = new TicketThread("1�Ŵ���");
		s1.start();
		
		TicketThread s2 = new TicketThread("2�Ŵ���");
		s2.start();*/
		
		//����һ���ӿڵ�ʵ�������(��Ϊ��ֻ������һ������ʵ�����ݵĹ���)
		TicketRunnable runnable = new TicketRunnable();
		
		//�����߳������
		Thread t1 = new Thread(runnable, "һ�Ŵ���");
		t1.start();
		Thread t2 = new Thread(runnable, "���Ŵ���");
		t2.start();
	}
}

class TicketRunnable implements Runnable{
	private int ticket = 5;  //5��Ʊ
	
	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName() + ":" + (ticket--));
			if(ticket<1){
				break;
			}
		}
	}
}


//���ʺ��ü̳�
/*class TicketThread extends Thread{
	private int ticket = 5;
	
	public TicketThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(this.getName() + ":" + (ticket--));
			if(ticket<1){
				break;
			}
		}
	}
}*/