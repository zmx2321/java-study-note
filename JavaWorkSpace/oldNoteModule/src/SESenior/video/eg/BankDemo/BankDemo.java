package SESenior.video.eg.BankDemo;

public class BankDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		//����2���߳������
		BankThread p1 = new BankThread(bank);
		p1.start();  //��̨ȡǮ
		BankThread p2 = new BankThread(bank);
		p2.start();  //atmȡǮ
	}
}

//�����߳���
class BankThread extends Thread{
	private Bank bank = null;  //����һ�����ж��������
	
	//bank�������ж��������
	public BankThread(Bank bank){
		this.bank = bank;
	}
	
	//�߳���Ҫʵ��run����
	@Override
	public void run() {
		System.out.println("ȡǮ" + bank.getMoney(400));
	}
}

class Bank{
	private int money = 500;
	
	//ȡǮ�ķ���������ȡǮ����Ŀ
	//synchronized(ͬ������)
	//��һ���̵߳���ͬ��������ʱ������߳̾ͻ�ȡ�˵�ǰ�������
	//�����̵߳�����ͬ��������ʱ��ֻ�ܵȴ�����Ϊ�޷���ö������
	//ֻ�еȴ���һ���߳��ͷŶ���������ɽ���
	public /*synchronized*/ int getMoney(int number){
		synchronized(this){
			if(number<0){
				return -1;
			}else if(money<0){
				return -2;
			}else if(number-money>0){
				return -3;
			}else{
				try {
					Thread.sleep(1000);  //ģ��ȡǮ��ʱ��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				money -= number;
				System.out.println("���" + money);
			}
			
			return number;
		}
	}
}
