package com.kuang._05Dom4j解析案例;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author xinman.kuang
 * @date 2021/8/11 22:37
 *
 * 创建xml文件
 */
public class Dom4jDemo {

    private static Document document = null;

    public static void main(String[] args) throws Exception {
        // 1.生产document对象
        parse();
        add();
    }

    /**
     * 生成一个xml文件
     * @return
     * @throws ParserConfigurationException
     */
    public static Document parse() throws ParserConfigurationException {
        //1.创建工厂
        DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = instance.newDocumentBuilder();
        document = documentBuilder.newDocument();
        return document;
    }

    private static void writerXml() throws Exception {
        //1.创建TransformerFactory
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //2.创建Transformer
        Transformer transformer = transformerFactory.newTransformer();
        // 设置输出xml的格式
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");


        //3.DomSource Dom树的源文件, 将xml信息写入source
        DOMSource domSource = new DOMSource(document);
        //4.需要
        //5.设置编码信息
        transformer.setOutputProperty("encoding", "UTF-8");
        transformer.setOutputProperty("version", "1.0");
        //6.创建streamResult
        StreamResult streamResult = new StreamResult(new OutputStreamWriter(new FileOutputStream("./name.xml"), "UTF-8"));
        transformer.transform(domSource, streamResult);
    }

    /**
     * 添加元素内容
     * @throws ParserConfigurationException
     */
    private static void add() throws Exception {
        // 第一层大节点
        Element students = document.createElement("students");
        // 第二层节点
        Element student = document.createElement("student");
        Node node = students.appendChild(student);
        student.setAttribute("name", "张三");
        document.appendChild(students);
        writerXml();
    }
}
