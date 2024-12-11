package SESenior.video.eg.myIterator;

//�����ӿڣ���������������߱��Ĺ���
public interface List<T> {
	//��������������Ԫ��
	public void add(T obj);
	
	//��ȡָ��λ���ϵ�Ԫ��
	public T get(int index);
	
	//��������е�Ԫ�ظ���
	public int size();
	
	//�õ�����ĵ���������
	public Iterator<T> iterator();
}
