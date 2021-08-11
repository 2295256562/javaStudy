package com.kuang._04Dom4j解析XML的文本;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * @author xinman.kuang
 * @date 2021/8/11 22:27
 *
 * Element:
 *      String elementText(String name):可以直接获取当元素的子元素的文本内容
 *      String elementTextTrim(String name):去前后空格，直接获取当前元素的子元素的文本内容
 *      String getText():直接获取当元素的文本内容
 *      String getTextTrim(): 去前后空格
 */
public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("Day13Demo/xml/demo01_helloword.xml"));

        // 3.获取root根节点
        Element root = document.getRootElement();

        // 直接拿到当前person元素下的子元素文本值
        System.out.println(root.elementText("name"));
        System.out.println(root.elementTextTrim("sex"));

        // 先获取到子元素对象，再获取该文本值
        Element name = root.element("name");
        System.out.println(name.getText());
        System.out.println(name.getTextTrim());
    }
}
