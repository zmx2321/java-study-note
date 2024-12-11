package SESenior.course.demo.collection;

import java.util.HashSet;

public class Class4{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		//Ҫ��������ͬ������Ϊ��ͬһ������
		//��дequals��hashcode����
		user1.setName("w");
		user2.setName("w");
		user3.setName("w");
		
		// �������ظ�������
		HashSet hashSet = new HashSet();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		
		/*hashSet.add(user1);
		hashSet.add(user2);
		hashSet.add(user3);*/
		
		//System.out.println(hashSet.size());
		
		for(int i=0; i<100; i++){
			hashSet.add(i);
		}
		
		for(Object obj : hashSet){
			System.out.println(obj);
		}
		
	}
}