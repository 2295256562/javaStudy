package com.kuang._03Dom4j解析XML的属性;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @author xinman.kuang
 * @date 2021/8/11 21:58
 *
 *
 * Element元素的API：
 *      List<Attribute> attributes()：获取元素的全部属性对象
 *      Attribute attribute(String name):根据名称获取某个元素的属性对象
 *      String attributeValue(String var1): 直接获取某个元素的某个属性名称的值
 *
 * Attribute对象的API
 *      String getName(): 获取属性名称
 *      String getValue(): 获取属性值
 */
public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("Day13Demo/xml/demo01_helloword.xml"));

        // 3.获取root根节点
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 4.获取name的全部属性
        List<Attribute> attributes = root.element("name").attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName() + "===>" + attribute.getValue());
        }

        Element nameEle = root.element("name");
        // 获取元素的某个属性对象
        Attribute idAttr = nameEle.attribute("id");
        System.out.println(idAttr.getName() + " ------>" + idAttr.getValue());

        // 直接获取元素的属性值
        System.out.println(nameEle.attributeValue("id"));
    }
}
