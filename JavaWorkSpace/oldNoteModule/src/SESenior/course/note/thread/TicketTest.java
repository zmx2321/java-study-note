package SESenior.course.note.thread;

public class TicketTest {
	public static void main(String[] args) {
		Ticket2 ticket = new Ticket2();
		
		// ����5���̣߳��������߳�
		new Thread(ticket, "����1").start();
		new Thread(ticket, "����2").start();
		new Thread(ticket, "����3").start();
		new Thread(ticket, "����4").start();
		new Thread(ticket, "����5").start();
	}
}
