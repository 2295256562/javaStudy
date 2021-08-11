package com.kuang._01Dom4j解析XML文档根元素;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;

/**
 * @author xinman.kuang
 * @date 2021/8/11 21:22
 */
public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        //1.创建一个dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();

        // 方式1：通过解析器去加载xml文件数据，成为一个Document文件树对象
        Document document = saxReader.read(new File("Day13Demo/xml/demo01_helloword.xml"));

        // 方式2：先把xml文件读成一个字节输入流
        // InputStream is = Dom4jDemo.class.getResourceAsStream("../demo01_helloword.xml");
        // Document document1 = saxReader.read(is);
        System.out.println(document);

        // 从document文档树对象中提取元素对象
        Element root = document.getRootElement();
        System.out.println(root);

    }
}
