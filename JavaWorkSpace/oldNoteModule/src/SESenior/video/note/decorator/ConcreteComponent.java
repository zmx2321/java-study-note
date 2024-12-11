package SESenior.video.note.decorator;

/**
 * ������FileInputStream(�̳�InputStream��)
 * @author hjkjkj
 *
 */
public class ConcreteComponent implements Component {
	@Override
	public void doThingA() {
		System.out.println("do A thing");
	}
}
