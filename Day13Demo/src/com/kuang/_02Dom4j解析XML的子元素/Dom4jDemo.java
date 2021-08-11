package com.kuang._02Dom4j解析XML的子元素;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @author xinman.kuang
 * @date 2021/8/11 21:42
 *
 *
 * Element元素的API：
 *      String getName(): 取元素的名称
 *      List<Element> elements(): 获取当前元素下的全部子元素（一级）
 *      List<Element> elementS(String name): 获取当前元素下的指定名称的全部子元素（一级）
 *      Element element(String name)：获取当前元素下的指定名称的某个元素，默认取第一个（一级）
 */
public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("Day13Demo/xml/demo01_helloword.xml"));

        // 获取根元素
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 获取更元素下的全部子元素
        List<Element> sonElements = root.elements();
        sonElements.forEach( x->{
            System.out.println(x.getName());
        });
        System.out.println("-------------------------");

        // 获取根元素下的全部
        List<Element> sonElements1 = root.elements("work");
        sonElements1.forEach(element -> {
            System.out.println(element.getName());
        });
        System.out.println("-------------------------");

        // 获取根源下的指定某个元素
        Element son = root.element("name");
        System.out.println(son.getName() +   son.getStringValue());
        System.out.println(son.attributeValue("name"));
    }
}
