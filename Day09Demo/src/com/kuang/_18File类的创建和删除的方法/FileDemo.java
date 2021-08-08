package com.kuang._18File类的创建和删除的方法;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Day09Demo/src/dlei02.text");
        System.out.println(f1.createNewFile());

        // 删除文件或者文件夹，不能删除非空文件夹
        System.out.println(f1.delete());

        File f2 = new File("Day09Demo/src/name/s");
        System.out.println(f2.mkdirs());
    }
}
