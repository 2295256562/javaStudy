package com.kuang._19File目录的遍历;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 目标：File针对目录的遍历
 *
 */
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("E:" + File.separator + "Python代码");
        String[] list = dir.list();
        for (String name : list) {
            System.out.println(name);
        }

        File dir1 = new File("E:" + File.separator + "Python代码");
        File[] files = dir1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            long time = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(time));
        }
    }
}
