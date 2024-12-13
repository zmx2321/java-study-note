package com.my.test01;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 创建SAXReader对象
        // 创建一个xml解析器对象(就是一个流)
        SAXReader saxReader = new SAXReader();

        try {
            // 读取XML文件并返回Document对象
            Document document = saxReader.read(new File("javaXMLModule/XML/test.xml"));
            // System.out.println(document);

            // 获取根元素
            Element rootElement = document.getRootElement();

            // 获取根节点下的多个子节点
            Iterator<Element> iterator = rootElement.elementIterator();
            while (iterator.hasNext()) {
                // 获取到子节点
                Element element = iterator.next();
                // 获取子节点的属性
                List<Attribute> atts = element.attributes();
                for (Attribute attribute : atts) {
                    System.out.println("该子节点的属性:" + attribute.getName() + "---" + attribute.getText());
                }
                // 获取到子节点的子节点
                Iterator<Element> iterator2 = element.elementIterator();
                while (iterator2.hasNext()) {
                    Element element2 = iterator2.next();
                    System.out.println("节点:" + element2.getName() + "---" + element2.getText());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
