package SEBase.eg.oop.comparatorDemo_1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * 书实体类
 *
 * @author *
 *
 */
@SuppressWarnings("rawtypes")
public class Book implements Comparable { // 定义名为Book的类，默认继承自Object类
    public int id;// 编号
    public String name;// 名称
    public double price; // 价格
    private String author;// 作者
    public GregorianCalendar calendar;// 出版日期

    public Book() {
        this(0, "X", 0.0, new GregorianCalendar(), "");
    }

    public Book(int id, String name, double price, GregorianCalendar calender,
                String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calendar = calender;
        this.author = author;
    }

    // 重写继承自父类Object的方法，满足Book类信息描述的要求
    public String toString() {
        String showStr = id + "\t" + name; // 定义显示类信息的字符串
        DecimalFormat formatPrice = new DecimalFormat("0.00");// 格式化价格到小数点后两位
        showStr += "\t" + formatPrice.format(price);// 格式化价格
        showStr += "\t" + author;
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy年MM月dd日");
        showStr += "\t" + formatDate.format(calendar.getTime()); // 格式化时间
        return showStr; // 返回类信息字符串
    }

    public int compareTo(Object obj) {// Comparable接口中的方法
        Book b = (Book) obj;
        return this.id - b.id; // 按书的id比较大小，用于默认排序
    }

    @SuppressWarnings({ "unchecked", "unused" })
    public static void main(String[] args) {
        Book b1 = new Book(10000, "红楼梦", 150.86, new GregorianCalendar(2009,
                01, 25), "曹雪芹、高鄂");
        Book b2 = new Book(10001, "三国演义", 99.68, new GregorianCalendar(2008, 7,
                8), "罗贯中 ");
        Book b3 = new Book(10002, "水浒传", 100.8, new GregorianCalendar(2009, 6,
                28), "施耐庵 ");
        Book b4 = new Book(10003, "西游记", 120.8, new GregorianCalendar(2011, 6,
                8), "吴承恩");
        Book b5 = new Book(10004, "天龙八部", 10.4, new GregorianCalendar(2011, 9,
                23), "搜狐");
        TreeMap tm = new TreeMap();
        tm.put(b1, new Integer(255));
        tm.put(b2, new Integer(122));
        tm.put(b3, new Integer(688));
        tm.put(b4, new Integer(453));
        tm.put(b5, new Integer(40));
        Iterator it = tm.keySet().iterator();
        Object key = null, value = null;
        Book bb = null;
        while (it.hasNext()) {
            key = it.next();
            bb = (Book) key;
            value = tm.get(key);
            System.out.println(bb.toString() + "\t库存：" + tm.get(key));
        }
    }
}  
