package SESenior.eg.fn.currency.ArrayListDel;
import java.util.ArrayList;
import java.util.List;
 
public class Check {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User user = new User(1, "liuweimin");
        User user2 = new User(2, "baishuang");
        User user3 = new User(3, "zhangxiaolei");
 
        list.add(user);
        list.add(user2);
        list.add(user3);
 
        for (User result : list) {
            if (result.getId() == 2) {
                list.remove(result);
                System.out.println("ɾ����");
                System.out.println("id:" + result.getId() + "\tname:"
                        + result.getName());
                }
        }
        System.out.println("ʣ�£�");
        for (User result : list) {
            System.out.println("id:" + result.getId() + "\tname:"
                    + result.getName());
        }
    }
}